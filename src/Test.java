
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
}