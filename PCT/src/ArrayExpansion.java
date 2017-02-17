
import java.util.Scanner;

class ArrayExpander {
	public static int[] expandArray(int[] ar, int exp) {
		// This method will expect an array of integers,as well as
		// an integer value. The method will create a new array that
		// is bigger than the passed array by the "exp" value, copy
		// all existing values form that passed array to new array
		// then return that new array.

		int i;

		int[] expandedArray = new int[ar.length + exp];

		for (i = 0; i < ar.length; i++) {
			expandedArray[i] = ar[i];
		}

		return expandedArray;
	}
}

public class ArrayExpansion {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int i, sz, incr;

		System.out.print("Please enter the size of the array you wish to create: ");
		sz = kb.nextInt();

		int[] arr1 = new int[sz];

		for (i = 0; i < arr1.length; i++) {
			arr1[i] = i * 5;
		}

		System.out.println("Here are the contents of arr1: ");
		System.out.println("=============================");

		for (i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.print("\n\nDo you like to expand this array? If so, enter an expansion value; otherwise enter 0: ");

		incr = kb.nextInt();

		if (incr > 0) {
			arr1 = ArrayExpander.expandArray(arr1, incr);

			System.out.println("Array has been expanded by " + incr + " elements.");

			System.out.println("\nHere are the contents of the array after expansion: ");
			System.out.println("===================================================");

			for (i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}
		}
		kb.close();
	}
}
