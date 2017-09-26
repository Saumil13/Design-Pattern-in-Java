package Advance;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PCTExam1 {

	FamilyTree root;
	static List<String> input = new ArrayList<String>();

	public FamilyTree findNode(String input) {

		FamilyTree findNodevalue;
		if (root == null) {
			return null;
		}

		findNodevalue = findNodeUntil(root, input);
		if (findNodevalue != null)
			return findNodevalue;
		else
			System.out.println("Paraent not found" + input);

		/*
		 * findNodevalue = findNodeUntil(root.leftchild, input); if (findNodevalue !=
		 * null) return findNodevalue;
		 * 
		 * findNodevalue = findNodeUntil(root.rightchild, input); if (findNodevalue !=
		 * null) return findNodevalue;
		 */

		return findNodevalue;
	}

	public void insert(String parent, String input) {

		if (root == null) {
			root = new FamilyTree(parent);
		}

		FamilyTree findNodeFromParent = findNode(parent);

		if (findNodeFromParent != null) {
			insertNodeUntil(findNodeFromParent, input);
		}
	}

	public void traversal() {
		traversal(root);
	}

	public void traversal(FamilyTree root) {

		if (root == null) {
			return;
		}

		System.out.print(root.name + " ");
		traversal(root.leftchild);
		traversal(root.rightchild);
	}

	public void insertNodeUntil(FamilyTree node, String input) {

		if (node.leftchild == null) {
			node.leftchild = new FamilyTree(input);
		} else {
			node.rightchild = new FamilyTree(input);
		}
	}

	public FamilyTree findNodeUntil(FamilyTree node, String input) {
		FamilyTree findNodevalue;

		while (node != null) {
			if (node.name.toLowerCase().equals(input.toLowerCase())) {
				return node;
			} else {
				findNodevalue = findNodeUntil(node.leftchild, input);
				if (findNodevalue == null) {
					findNodevalue = findNodeUntil(node.rightchild, input);
					return findNodevalue;
				} else {
					return findNodevalue;
				}
			}
		}

		return null;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		List<String> op2 = new ArrayList<String>();

		sc.nextLine();

		PCTExam1 obj = new PCTExam1();
		for (int i = 0; i < value; i++) {
			input.add(sc.nextLine());
		}

		for (String valueinLoop : input) {

			String[] values = valueinLoop.split(" ");
			obj.insert(values[0], values[1]);
		}

		value = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < value; i++) {
			String[] values = sc.nextLine().split(" ");

			if (values[1].toLowerCase().contains("child")) {
				boolean valueop = (obj.findChildRelationship(values[2], values[0]));
				op2.add(valueop ? "T" : "F");
			}

			if (values[1].toLowerCase().contains("sibling")) {
				boolean valueop = (obj.isSibling(values[0], values[2]));
				op2.add(valueop ? "T" : "F");
			}

			if (values[1].toLowerCase().contains("ancestor")) {

				boolean valueop = (obj.isAncestor(values[0], values[2]));
				op2.add(valueop ? "T" : "F");
			}
			
			if (values[1].toLowerCase().contains("descendant")) {

				boolean valueop = (obj.isDecent(values[0], values[2]));
				op2.add(valueop ? "T" : "F");
			}

		}

		for (String string : op2) {
			System.out.print(string + " ");
		}

		System.out.println();

		obj.traversal();
	}

	public boolean isSibling(String ip1, String ip2) {

		FamilyTree ip1Parent = findParent( ip1);

		FamilyTree ip2Parent = findParent( ip2);

		return ip1Parent.name.toLowerCase().equals(ip2Parent.name.toLowerCase());
	}

	public boolean isAncestor(String input1, String input2) {

		FamilyTree ip1Node = findNode(input1);
		FamilyTree familyTree = findNodeUntil(ip1Node, input2);
		return familyTree != null ? true : false;

	}

	public FamilyTree findParent(String value) {

		if (root == null) {
			return null;
		} else {
			FamilyTree nodeFound = findParentUntil(root, value);
			return nodeFound;
		}
	}
	
	
	public FamilyTree findParentUntil(FamilyTree root, String value) {

		if (root == null) {
			return null;
		} else if (root.rightchild != null && root.rightchild.name.toLowerCase().equals(value.toLowerCase())
				|| root.leftchild != null && root.leftchild.name.toLowerCase().equals(value.toLowerCase())) {
			return root;
		} else {
			FamilyTree nodeFound = findParentUntil(root.leftchild, value);
			if (nodeFound == null) {
				nodeFound = findParentUntil(root.rightchild, value);
			}

			return nodeFound;
		}
	}

	public boolean findChildRelationship(String parent, String child) {

		boolean isFound = false;

		FamilyTree node = findNode(parent);

		if (node == null)
			isFound = false;
		else if (node != null
				&& (node.leftchild != null && node.leftchild.name.toLowerCase().equals(child.toLowerCase()))
				|| (node.rightchild != null && node.rightchild.name.toLowerCase().equals(child.toLowerCase())))
			isFound = true;

		return isFound;

	}
	
	public boolean isDecent(String ip1,String ip2) {
		FamilyTree parent = findParent(ip1);
		
		
		if(parent == null)
			return false;
		
		return findChildRelationship(ip2, parent.name) || parent.name.equals(ip2);
	}
	
}

class FamilyTree {
	String name;
	FamilyTree leftchild;
	FamilyTree rightchild;

	public FamilyTree(String value) {
		this.name = value;
		leftchild = null;
		rightchild = null;
	}

}