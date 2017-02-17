import java.util.Scanner;

public class InputScanner4 {

	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		String firstName, familyName, quote1, quote2;
		
		System.out.print("Please Enter Your First Name and Your Family Name: ");

		// Read first and family name from input
		firstName = kb.next();
		familyName = kb.next();
		
		// Read two entire lines from input
		 kb.nextLine();
		
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
