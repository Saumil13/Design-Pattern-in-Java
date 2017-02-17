import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import org.xml.sax.Parser;

//Ask cupsize 25 50 75
//Ask number of person i.e 1
//One person allow to enter
// Person1 (Name) 19 (age) Height (7 0) 

public class CapSizeProblem {

	public static void main(String[] args) {

		String cupsizeStr;
		int cupsize1, cupsize2, cupsize3;
		int totalPerson;

		Scanner cupsize = new Scanner(System.in);
		cupsizeStr = cupsize.nextLine();

		String[] cupsizeArray = cupsizeStr.split(" ");
		cupsize1 = Integer.valueOf(cupsizeArray[0]);
		cupsize2 = Integer.valueOf(cupsizeArray[1]);
		cupsize3 = Integer.valueOf(cupsizeArray[2]);

		
		Scanner totalPersonRead = new Scanner(System.in);
		
		totalPerson = totalPersonRead.nextInt();
		Scanner personRead = new Scanner(System.in);

		ArrayList<Person> totalPersonDetails = new ArrayList<Person>();
		for (int index = 0; index < totalPerson; index++) {
			String personLine;
			Person person = new Person();
			personLine = personRead.nextLine();

			String[] personLineArray = personLine.split(" ");
			person.PersonName = personLineArray[0];
			person.age = Integer.valueOf(personLineArray[1]);
			person.HeightInch = Integer.valueOf(personLineArray[2]);
			person.HeightFeet = Integer.valueOf(personLineArray[3]);
			totalPersonDetails.add(person);
		}
		cupsize.close();
		personRead.close();
		
		System.out.println("CupSize: " + cupsize1 + " " + cupsize2 + " " + cupsize3);
		
		Collections.sort(totalPersonDetails,new Namesorting());

		for (Person person : totalPersonDetails) {
			System.out.println("Name: " + person.PersonName + ", Age: " + person.age + ", Height:" + person.HeightInch+" "+person.HeightFeet);
		}
		
	}
}

class Person {
	public String PersonName;
	public int age;
	public int HeightInch;
	public int HeightFeet;
}


class Namesorting implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.PersonName.compareTo(o2.PersonName);
	}

}
