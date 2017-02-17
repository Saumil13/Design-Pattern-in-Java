import java.util.Scanner;

public class ArrayOperartion {
	public static void main (String[] args)
	{
		
		int i, v, sz1, sz2;
		int count = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter the sizes you want for your arrays ar1 & ar2, respectively: ");
		sz1 = kb.nextInt();
		sz2 = kb.nextInt();
		
		int[] ar1 = new int[sz1];
		int[] ar2 = new int[sz2];

		
		// Just initialize the first arrays with some values
		for (i = 0; i < ar1.length; i++)
		{
			ar1[i] = i * 5;
			
		}
		
		
		// Now copy the ar1 to ar2. Must make sure that no out-of-boundary problem is there
		if (ar1.length == ar2.length)
		{
			for (i = 0; i < ar2.length; i++)	 									
			{									 
				ar2[i] = ar1[i];				
				
			}			
		}
		else if (ar1.length > ar2.length)
		{
			// copy only what ar2 can hold
			System.out.println("\nThe length of ar2 is smaller than the length of ar1.");
			System.out.println("\nOnly partial copy will be made. ");
			for (i = 0; i < ar2.length; i++)	 									
			{									 
				ar2[i] = ar1[i];				
				
			}
			
		}
		else
		{
			// copy ar1 to ar2. ar2 will have other un-initialized elements; more accurately 
			// initialized to zeros.  
			System.out.println("\nThe length of ar1 is smaller than the length of ar2.");
			System.out.println("\nOnly partial copy will be made. ");
			for (i = 0; i < ar1.length; i++)	 	// notice that we cannot use ar2.length here								
			{									 
				ar2[i] = ar1[i];				
				
			}
			
			
		}
		
		
		
		// Show the contents of the arrays
		System.out.println("Here are the values in the array ar1: ");
		for (i = 0; i < ar1.length; i++)
		{
			System.out.print(ar1[i] + " ");
		}
		
		System.out.println("\nHere are the values in the array ar2: ");
		for (i = 0; i < ar2.length; i++)
		{
			System.out.print(ar2[i] + " ");
		}
		kb.close();
		
	}

}
