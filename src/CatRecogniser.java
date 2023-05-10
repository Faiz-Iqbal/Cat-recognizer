import java.util.Scanner;
/**
 * @MohammedFaizIqbal 
 * Software Development 1, Coursework 2.
 * 
 * 
 */
public class CatRecogniser {

	public static void main(String[] args) {
		//Variables to be used later
		Scanner scan = new Scanner(System.in);
		int catNum;
		String Identify; // 
		boolean repeat;
		String hairAns;
		String ageAns;

		//Welcome message for user
		System.out.println("Welcome to Cat Recogniser");
		System.out.println("_________________________");

		//Ask user for number of cats
		System.out.println("How many cats do you have?");
		catNum= scan.nextInt();

		// Array for storing name of cats, hair type and age, array length is defined by catNum
		String catName[] = new String[catNum];
		String catHair[] = new String[catName.length];
		double catAge[]= new double[catName.length];

		//Asks user the Name, Hair type and Age of all cats
		for (int i=0; i<catNum; i++) {
			System.out.println("Please enter the name of cat #" + (i+1));
			catName[i]= scan.next();

			System.out.println("Does " + catName[i] + " have 'long' or 'short' hair?");
			catHair[i]= scan.next().toLowerCase();

			System.out.println("How old is " + catName[i]);
			catAge[i] = scan.nextDouble();
			System.out.println(" ");
		}

		/* At this point all the Cats, their age and hair type are stored in memory, from next line the system will ask the
		   user if they want to identify their cats. */

		// Outer loop starts
		do {
			//Asks user if they want to identify their cat
			System.out.println(" ");
			System.out.println("Do you wish to identify a cat?");
			Identify = scan.next();
			if (Identify.equalsIgnoreCase("no")) {
				break;									// If user enters no the loop is brokem.
			}

			//Asks user if their cat has long or short hair
			System.out.println("Does it have 'long or 'short' hair? ");
			hairAns = scan.next();

			// Asks user if their cat is old or young
			System.out.println("Is it old or young? ");
			ageAns = scan.next();

			// Outputs results to user
			System.out.println(" ");
			System.out.println("The following cats meet this criteria: ");

			// Filters results based on criteria, inner loop starts
			for (int i=0; i<catNum; i++) {

				if (hairAns.equalsIgnoreCase("long") && ageAns.equalsIgnoreCase("old")) {
					if(catHair[i].equalsIgnoreCase("long") && catAge[i]>=7) // Age greater than 7 is considered old
						System.out.println(catName[i] + ", who is " + catAge[i]);

				}
				else if (hairAns.equalsIgnoreCase("long") && ageAns.equalsIgnoreCase("young")) {
					if(catHair[i].equalsIgnoreCase("long") && catAge[i]<7) // Age less than 7 is considered young
						System.out.println(catName[i] + ", who is " + catAge[i]);


				}else if (hairAns.equalsIgnoreCase("short") && ageAns.equalsIgnoreCase("old")) {
					if(catHair[i].equalsIgnoreCase("short") && catAge[i]>=7) // Age greater than 7 is considered old
						System.out.println(catName[i] + ", who is " + catAge[i]);


				}else if (hairAns.equalsIgnoreCase("short") && ageAns.equalsIgnoreCase("young")) {
					if(catHair[i].equalsIgnoreCase("short") && catAge[i]<7) // Age less than 7 is considered young
						System.out.println(catName[i] + ", who is " + catAge[i]);
				}else {
					System.out.println("Sorry there are no results that meet your criteria");
				}	
			} //Inner loop ends

		}while (Identify.equalsIgnoreCase("yes")); 
		System.out.print("Thanks you for using Cat Recogniser! Goodbye.");	
		//Outer loop ends


	}

}
