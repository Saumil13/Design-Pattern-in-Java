package Advance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TreeIdenticalOrNot {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int n = Integer.parseInt(br.readLine());
			String[] s = new String[n];
			String[] result = new String[n - 1];
			Tree[] t = new Tree[n];
			for (int i = 0; i < n; i++) {
				s[i] = br.readLine();
				t[i] = new Tree();

				String[] treeElem = s[i].split(" ");
				int[] intTreeElem = new int[treeElem.length - 1];
				for (int j = 0; j < treeElem.length - 1; j++) {
					intTreeElem[j] = Integer.parseInt(treeElem[j]);
					t[i].add(intTreeElem[j]);
				}
				t[i].depth = t[0].preOrder(0, t[i].root);
			}

			for (int i = 1; i < t.length; i++) {
				int diff = (t[0].depth - t[i].depth);
				if (diff < 0)
					diff *= -1;
				if (t[0].matchWith(t[i]))
					result[i - 1] = "YES " + diff;
				else
					result[i - 1] = "NO " + diff;
			}

			for (int i=0; i<result.length; i++)
				System.out.print((i==0?"":"\n") + result[i]);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}

class Tree {
	TNode root = null;
	int depth = 0;
	int temp = 0;

	public void add(int n) {
		addData(n);
	}

	private void addData(int n) {
		if (root == null) {
			root = new TNode(n, null, null);
		} else
			add(root, n);

	}

	private void add(TNode root, int n) {
		if (root.data < n) {
			if (root.right == null)
				root.right = new TNode(n, null, null);
			else
				add(root.right, n);
		} else {
			if (root.left == null)
				root.left = new TNode(n, null, null);
			else
				add(root.left, n);
		}
	}

	public boolean matchWith(Tree t) {
		return m(root, t.root);
	}

	private static boolean m(TNode curRoot, TNode newRoot) {
		if (curRoot == null && newRoot == null) {
			return true;
		} else if ((curRoot == null && newRoot != null) || (curRoot != null && newRoot == null))
			return false;
		else {
			if (m(curRoot.left, newRoot.left) && m(curRoot.right, newRoot.right))
				return true;
			return false;
		}
	}

	public int preOrder(int height, TNode root) {
		int lh = 0, rh = 0;
		if (root != null) {
			height++;
			//System.out.print(root.data+", ");
			lh = preOrder(height, root.left);
			rh = preOrder(height, root.right);
			return lh > rh ? lh : rh;
		}
		return height;
	}
}

class TNode {
	int data;
	TNode left = null, right = null;

	TNode(int data, TNode left, TNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
