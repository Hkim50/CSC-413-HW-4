public class BST {
	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
		}
	}
	Node root;

	public boolean search(int key) {
		return search(root, key) != null;
	}
	private Node search(Node root, int key) {
		if (root == null || root.data == key) {
			return root;
		}
		if (root.data > key) {
			return search(root.left, key);
		}
			return search(root.right, key);
	}
	public void insert(int data) {
		root = insert(root, data);
	}
	private Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data) {
			root.left = insert(root.left, data);
		}
		else if (data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}
	public Node delete(int key) {
		root = delete(root, key);
		return root;
	}
	private Node delete(Node root, int key) {
		if (root == null) {
			return root;
		}
		if (key < root.data) {
			root.left = delete(root.left, key);
		}
		else if (key > root.data) {
			root.right = delete(root.right, key);
		}
		else {
			if (root.left == null && root.right == null) {
				return null;
			}
			else if (root.left == null) {
				return root.right;
			}
			else if (root.right == null) {
				return root.left;
			}
			root.data = findMin(root.right);
			root.right = delete(root.right, root.data);
		}
		return root;
	}
	int findMin(Node root) {
		int min = root.data;
		while (root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
	public void inorder() {
		inorder(root);
		System.out.println("");
	}
	private void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
        /*           5
         *         /   \
         *        3     9
         *       / \   / \
         *      1   4 8   10  
         */
	public void preorder() {
		preorder(root);
		System.out.println("");
	}
	private void preorder(Node node) {
		if (node == null)   										
		return;
   
	  System.out.print(node.data + " ");
	  preorder(node.left);
	  preorder(node.right);
	}
	public void postorder() {
		postorder(root);
		System.out.println("");
	}
	private void postorder(Node node) {
		if (node == null) {
			return;
		}

		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");

	}
        /*           5
         *         /   \
         *        3     9
         *       / \   / \
         *      1   4 8   10  
         */
}
