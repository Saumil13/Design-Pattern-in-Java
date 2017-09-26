package Advance;


import java.util.Stack;

public class StackDemo {

	static void showpush(Stack st, int data) {
		st.push(data);
		System.out.println("push(" + data + ")");
		System.out.println("stack: " + st);
	}

	static void showpop(Stack st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println("Statck: " + st);

		for (int i = 0; i < 5; i++) {
			showpush(st, i);
		}

		for (int i = 0; i < 6; i++) {
			if (!st.isEmpty())
				showpop(st);
		}

	}

}
