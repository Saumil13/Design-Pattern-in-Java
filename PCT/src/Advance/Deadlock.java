package Advance;


import java.util.ArrayList;
import java.util.Scanner;

public class Deadlock {

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int count = Integer.parseInt(sc.nextLine());

		DeadNode[] nodeArray = new DeadNode[count];

		DeadNode DeadNode = null;
		String input = "";
		for (int i = 0; i < count; i++) {
			nodeArray[i] = new DeadNode();
			input = sc.nextLine();
			String triplet[] = input.split(" ");

			nodeArray[i].process = Integer.parseInt(triplet[0]);
			nodeArray[i].holdingResource.add(Integer.parseInt(triplet[1]));
			nodeArray[i].neededResources.add(Integer.parseInt(triplet[2]));

		}

		int deadlock = 0;
		DeadNode[] uniqueNodes = new DeadNode[50];
		count = 0;
		for (int i = 0; i < nodeArray.length; i++) {
			if (nodeArray[i] != null) {
				for (int j = i + 1; j < nodeArray.length; j++) {
					if (nodeArray[j] != null) {
						if (nodeArray[i].process != nodeArray[j].process) {
							for (Integer holded : nodeArray[i].holdingResource) {
								for (Integer required : nodeArray[j].neededResources) {
									if (holded == required && holded != -1) {
										deadlock++;
									}
								}
							}
						}
					}
				}
			}

		}
		
		System.out.println("Count: "+deadlock);

		if (deadlock > 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}


class DeadNode {

	public ArrayList<Integer> holdingResource = new ArrayList<Integer>();

	public ArrayList<Integer> neededResources = new ArrayList<Integer>();;

	public int process;

}