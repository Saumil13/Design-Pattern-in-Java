package Advance;

public class LinkedListSample {

	public static void main(String[] args) {

		Node n1 = new Node();

		for (int i = 0; i < 10; i++) {
			n1.addNode(i);
		}

		System.out.println("Find element");
		Node findElement = n1.findElement(5);
		System.out.println(findElement.data);
		
		n1.printData();
	}
}

class Node {
	int data;
	Node next;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		Node current = this;

		while (current.next != null) {
			current = current.next;
		}

		current.next = newNode;
	}

	public Node findElement(int data) {
		Node current = this;

		while (current.next != null) {
			if (current.data == data)
				return current;
			else
				current = current.next;
		}
		
		return current;
	}

	public void printData() {
		Node current = this;

		while (current.next != null) {
			current = current.next;
			System.out.println(current.data);
		}
	}
}