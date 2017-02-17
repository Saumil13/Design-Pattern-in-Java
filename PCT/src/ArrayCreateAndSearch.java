import java.util.Collections;
import java.util.Scanner;

public class ArrayCreateAndSearch {

	public static void main(String[] args) {

		int sz, searchItem;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size you want for your array: ");
		sz = sc.nextInt();

		int[] arrayValue = new int[sz];

		for (int i = 0; i < arrayValue.length; i++) {
			arrayValue[i] = i * 5;
		}
		// Show the contents of the array
		System.out.println("Here are the values in the array: ");
		for (int i = 0; i < arrayValue.length; i++) {
			System.out.print(arrayValue[i] + " ");
		}


		System.out.println();
		System.out.print("Enter the value you would like search: ");
		searchItem = sc.nextInt();

		 
		int index = 0;
		for (int i = 0; i < arrayValue.length; i++) {

			
			if (arrayValue[i] == searchItem) {
				index = i;
				break;
			}
		}


		System.out.println();
		if (index > 0)
			System.out.print("Value of search found at this position: " + index);
		else
			System.out.println("Enter value not found");
	}

}
