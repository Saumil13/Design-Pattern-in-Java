import java.util.Scanner;

public class SwitchCaseWeek {
	
	public static void main(String[] args){
		
		int dayNumber;
		String dayName;
		System.out.println("Enter the day number to know day name.");
		
		Scanner sc =new Scanner(System.in);
		dayNumber = sc.nextInt();
		
		switch(dayNumber){
		
		case 0:
			dayName = "Sunday";
			break;
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		default:
			dayName ="Please enter the day number between 0 to 6";
			break;
		}
		
		System.out.println("Your request day name is: "+dayName);
				
	}
	

}
