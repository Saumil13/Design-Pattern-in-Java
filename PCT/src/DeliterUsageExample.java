import java.util.Scanner;

public class DeliterUsageExample {
	
	public static void main(String[] args){
	
		String firstName,familyName, dateOfBirth;
		String song1,song2,song3;
		
		System.out.println("Please Enter Your First Name, Your Family Name, and Your DOB");
		System.out.println("All three entries MUST be separated by \"Space\" character, and a \"#\" at the end as well: Mike#Simon# January 19, 1985#");
		
		Scanner scanner1= new Scanner(System.in);
		scanner1.useDelimiter(" ");
		
		firstName = scanner1.next();
		familyName= scanner1.next();
		dateOfBirth = scanner1.next();
		
		
		System.out.println("Please Enter the Name of Three Songs that You Like.");
		System.out.println("\n All names must be separated by \"@@@\"; do not forget to place \"@@@\" at the end as well: ");
		System.out.println("First We Take Manhattan, By Leonard Cohen@@@Ugly, By Bon Jovi@@@November Rain, By Guns N' Roses@@@");
		
		Scanner scanner2= new Scanner(System.in);
		scanner2.useDelimiter("@@@");
		
		song1 = scanner2.next();
		song2 = scanner2.next();
		song3 = scanner2.next();
		
		System.out.println("\nThanks " +firstName +" "+ familyName + " " + dateOfBirth+" for your entries. You Songs are as follows: ");
		
		System.out.println();
		System.out.println("First song1: "+song1);
		System.out.println("Second song2: "+song2);
		System.out.println("Third song3: "+song3);
		
		scanner1.close();
		scanner2.close();
	}

}
