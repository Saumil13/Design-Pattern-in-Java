
public class CallByReference {
	public static void main(String[] args) {

		// This program attempt to swap two variables using the swap function
		// which is defined below

		Number numberObj =new Number();
		numberObj.Number1 = 30;
		numberObj.Number2 = 80;
		
		
		System.out.println("Before calling the swap function , val1 is is: " + numberObj.Number1);
		System.out.println("Before calling the swap function , val2 is is: " + numberObj.Number2);

		// Call the swap function to swap the values of val1 & val2
		// Will this work? Why?

		swap(numberObj);

		System.out.println("\nAfter calling the swap function , val1 is is: " + numberObj.Number1);
		System.out.println("After calling the swap function , val2 is is: " + numberObj.Number2);

	}

	public static void swap(Number numberObj ) {
		System.out.println("\nInside Swap function. Before swapping, x is: " + numberObj.Number1);
		System.out.println("Inside Swap function. Before swapping, y is: " + numberObj.Number2);

		int temp = numberObj.Number2;
		numberObj.Number2 = numberObj.Number1;
		numberObj.Number1 = temp;

		System.out.println("Inside Swap function. After swapping, x is: " + numberObj.Number1);
		System.out.println("Inside Swap function. After swapping, y is: " + numberObj.Number2);
	}
}

 class Number{
	public int Number1;
	public int Number2;
}


