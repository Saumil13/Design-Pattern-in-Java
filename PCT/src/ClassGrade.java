import java.util.Scanner;

public class ClassGrade {

	public static void main(String[] args) {

		double marks;
		String grade;

		System.out.println("Please enter your marks: ");

		Scanner scanner = new Scanner(System.in);
		marks = scanner.nextDouble();

		if (marks >= 90)
			grade = "A";
		else if (marks >= 80)
			grade = "B";
		else if (marks >= 70)
			grade = "C";
		else if (marks >= 60)
			grade = "D";
		else if (marks >= 50)
			grade = "E";
		else 
			grade = "F";
		
		
		System.out.println("You have entered marks: "+marks);
		System.out.println("Based on that your grade: "+grade);

	}

}
