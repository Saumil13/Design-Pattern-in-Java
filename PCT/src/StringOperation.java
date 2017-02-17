import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {

		// This program asks the user to enter few values for an investment and
		// then calculates the profit accordingly

		String firstName, familyName;
		String quote1, quote2, jk;

		// Create one scanner object; this object is needed since inputs will be
		// made through it
		Scanner kb = new Scanner(System.in); // kb is just a name; it can be
												// anything

		System.out.print("Please Enter Your First Name and Your Family Name: ");

		// Read first and family name from input
		firstName = kb.next();
		familyName = kb.next();

		jk = kb.nextLine();

		System.out.println("\nPlease Enter Your Favorite Quotes, one per line: ");

		// Read two entire lines from input
		quote1 = kb.nextLine();
		quote2 = kb.nextLine();

		System.out.println("\nThanks " + firstName + " " + familyName + " for your entries. You quotes are as follows: ");

		System.out.println("First Quote: " + quote1);
		System.out.println("Second Quote: " + quote2);

		kb.close();

	}

}
