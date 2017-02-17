import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String input;
		String secondInput;
		System.out.println("Please enter the string you would like to enter");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();

		StringTokenizer stringTokennizer = new StringTokenizer(input);
		int count = stringTokennizer.countTokens();

		for(int index=0; index < count; index ++){
			System.out.println("Words: " + stringTokennizer.nextToken());
		}
		
		secondInput = scanner.nextLine();
		StringTokenizer stringTokennizerForSecondInput = new StringTokenizer(secondInput,"#");
		int secondInputCount = stringTokennizerForSecondInput.countTokens();
		System.out.println("Please enter the string you would like to enter with separte with #");
		
		for(int index=0; index < secondInputCount; index ++){
			System.out.println("Words: " + stringTokennizerForSecondInput.nextToken());
		}
		
		scanner.close();
	}
}
