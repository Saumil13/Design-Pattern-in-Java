package Advance;

public class BST {

	BSTNode root;

	public BST() {
		root = null;
	}

	void insert(int key) {
		 root = insert(root, key);
	}

	BSTNode insert(BSTNode root, int value) {

		if (root == null) {
			root = new BSTNode(value);
			return root;
		}

		
		 if (value < root.value)
	            root.left = insert(root.left, value);
	        else if (value > root.value)
	            root.right = insert(root.right, value);
		
		return root;
	}

	
	  void inorder()  {
	       inorderRec(root);
	    }
	  
	void inorderRec(BSTNode root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.value);
			inorderRec(root.right);
		}
	}

	public static void main(String[] args) {
		BST tree = new BST();

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		// print inorder traversal of the BST
		tree.inorder();
	}
}

class BSTNode {
	int value;
	BSTNode left, right;

	public BSTNode(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}
