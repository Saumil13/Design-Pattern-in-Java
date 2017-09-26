//Java implementation to find lowest common ancestor of
// n1 and n2 using one traversal of binary tree

/* Class containing left and right child of current
 BTNode and key value*/

package Advance;


class BTNode {
	int data;
	BTNode left, right;

	public BTNode(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree {
	// Root of the Binary Tree
	BTNode root;

	BTNode findLCA(int n1, int n2) {
		return findLCA(root, n1, n2);
	}

	// This function returns pointer to LCA of two given
	// values n1 and n2. This function assumes that n1 and
	// n2 are present in Binary Tree
	BTNode findLCA(BTNode BTNode, int n1, int n2) {
		// Base case
		if (BTNode == null)
			return null;

		// If either n1 or n2 matches with root's key, report
		// the presence by returning root (Note that if a key is
		// ancestor of other, then the ancestor key becomes LCA
		if (BTNode.data == n1 || BTNode.data == n2)
			return BTNode;

		// Look for keys in left and right subtrees
		BTNode left_lca = findLCA(BTNode.left, n1, n2);
		BTNode right_lca = findLCA(BTNode.right, n1, n2);

		// If both of the above calls return Non-NULL, then one key
		// is present in once subtree and other is present in other,
		// So this BTNode is the LCA
		if (left_lca != null && right_lca != null)
			return BTNode;

		// Otherwise check if left subtree or right subtree is LCA
		return (left_lca != null) ? left_lca : right_lca;
	}

	BTNode findLeft(int n1, int n2) {
		return findLeft(root, n1, n2);
	}

	BTNode findLeft(BTNode BTNode, int n1, int n2) {
		// Base case

		if (BTNode == null)
			return null;

		// If either n1 or n2 matches with root's key, report
		// the presence by returning root (Note that if a key is
		// ancestor of other, then the ancestor key becomes LCA
		if (BTNode.data == n1 || BTNode.data == n2)
			return BTNode;

		// Look for keys in left and right subtrees
		BTNode left_lca = findLCA(BTNode.left, n1, n2);

		if (left_lca != null)
			return left_lca;

		return null;

	}

	void preOrderTraverse(BTNode BTNode) {

		if (BTNode == null)
			return;

		System.out.print(BTNode.data);
		preOrderTraverse(BTNode.left);
		preOrderTraverse(BTNode.right);
	}

	void inOrderTraverse(BTNode BTNode) {

		if (BTNode == null)
			return;

		inOrderTraverse(BTNode.left);
		System.out.print(BTNode.data);
		inOrderTraverse(BTNode.right);

	}

	void postOrderTraverse(BTNode BTNode) {
		if (BTNode == null)
			return;

		postOrderTraverse(BTNode.left);
		postOrderTraverse(BTNode.right);
		System.out.print(BTNode.data);
	}

	void printLevelOrder() {
		int h = height(root);

		int i = 0;
		for (i = 1; i <= h; i++) {
			printGivenLevel(root, i);
		}
	}

	void printGivenLevel(BTNode root, int level) {

		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	int height(BTNode root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	public void insertNode(int data) {
		root = insertNode(root, data);
	}

	private BTNode insertNode(BTNode BTNode, int data) {

		if (BTNode == null) {
			BTNode = new BTNode(data);
			return BTNode;
		}

		else {

			if (BTNode.right == null)
				BTNode.right = insertNode(BTNode.right, data);
			else
				BTNode.left = insertNode(BTNode.left, data);
		}
		return BTNode;
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {

		BinaryTree tree = new BinaryTree();

		/*
		 * tree.root = new BTNode(1); tree.root.left = new BTNode(2); tree.root.right =
		 * new BTNode(3);
		 * 
		 * tree.root.left.left = new BTNode(4); tree.root.left.right = new BTNode(5);
		 * 
		 * tree.root.right.left = new BTNode(6); tree.root.right.right = new BTNode(7);
		 */

		
		  tree.root = new BTNode(1); tree.root.left = new BTNode(2); tree.root.right =
		  new BTNode(3);
		  
		  tree.root.left.left = new BTNode(4); tree.root.left.right = new BTNode(5);
		  tree.root.right.left = new BTNode(6); tree.root.right.right = new BTNode(7);
		 

		/*for (int i = 1; i <= 7; i++)
			tree.insertNode(i);*/

		System.out.println("Pre Order");
		tree.preOrderTraverse(tree.root);

		System.out.println();
		System.out.println("Post Order");
		tree.postOrderTraverse(tree.root);

		System.out.println();
		System.out.println("In Order");
		tree.inOrderTraverse(tree.root);

		System.out.println();
		System.out.println("Level order");
		tree.printLevelOrder();

		System.out.println();

		System.out.println("LCA(4, 5) = " + tree.findLCA(4, 5).data);
		System.out.println("LCA(5, 4) = " + tree.findLCA(5, 4).data);

		System.out.println("LCA(4, 6) = " + tree.findLCA(4, 6).data);

		System.out.println("LCA Left(4, 2) = " + tree.findLeft(4, 1).data);

		System.out.println("LCA(3, 4) = " + tree.findLCA(3, 4).data);
		System.out.println("LCA(2, 4) = " + tree.findLCA(2, 4).data);

	}
}