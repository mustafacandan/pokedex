
public class Test {
	public static void main(String[] args) {

	}

	public class DoublyLinkedList {
		private Node first;
		private Node last;
	}

	public DoublyLinkedList( )
	{
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertAtBack(String itemName) {
		if (isEmpty())
			first = last = new Node(itemName, first);
		else {
			Node a = new Node(itemName);
			a.setPrev(last);
			a.setNext(null);
			last.setNext(a);
			last = last.getNext();
		}
	}

	public void outputList() {
		Node current = first;
		while (current != null) {
			System.out.println(current.getItem());
			current = current.getNext();
		}
	}

	////////////////////////////////////////////////////////////////////////////////////////
	//https://www.geeksforgeeks.org/given-linked-list-representation-of-complete-tree-convert-it-to-linked-representation/
	///////////////////////////////////////////////////////////////////////////////////////
	public class TreeNode {
		private int element;
		private TreeNode left;
		private TreeNode right;
	}

	public TreeNode(int newElement)
	{
		element = newElement;
		left = null;
		right = null;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int newElement) {
		element = newElement;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode newLeft) {
		left = newLeft;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode newRight) {
		right = newRight;
	}

	public class BinarySearchTree {
		private TreeNode root;
		private int size;

		/** Create a default binary tree */

		public BinarySearchTree() {
			root = null;
			size = 0;
		}

		private TreeNode createNewNode(int e) {
			return new TreeNode(e);
		}

		/** Get the number of nodes in the tree */

		public int getSize() {
			return size;
		}

		/** Returns the root of the tree */

		public TreeNode getRoot() {
			return root;
		}

	/** Insert element o into the binary tree
	* Return true if the element is inserted
	successfully
	*/
	public boolean insert(int e) 
	{
		if (root == null)
			root = createNewNode(e); // Create a new root
		else 
		{
		// Locate the parent node
			TreeNode parent = null;
			TreeNode current = root;
			while (current != null)
				if (e < current.getElement()) 
				{
					parent = current;
					current = current.getLeft();
				}
				else if (e > current.getElement()) 
				{
					parent = current;
					current = current.getRight();
				}
				else
					return false; // Duplicate node not inserted
		// Create the new node and attach it to the parent node
		
			if (e < parent.getElement())
				parent.setLeft(createNewNode(e));
			else
				parent.setRight(createNewNode(e));
			}
			size++;
			return true; // Element inserted

	/** Returns true if the element is in the tree */
	public boolean search(int e) 
	{
		TreeNode current = root; // Start from the root
		while (current != null)
		{
			if (e < current.getElement())
				current = current.getLeft();
			else if (e > current.getElement())
				current = current.getRight();
			else // element matches current.getElement()
				return true; // Element is found
		}
			return false;
		}
}