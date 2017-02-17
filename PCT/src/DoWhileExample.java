import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

		int enteredNumner;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Please enter the number between 1 to 10.");
			enteredNumner = sc.nextInt();
			
		} while (enteredNumner < 1 || enteredNumner > 10);

		
		do{
			System.out.println("Enter number: "+enteredNumner);
			enteredNumner++;
		}while (enteredNumner <=10);
	}

}
