
public class Test {
	public static void main(String[] args) {

	}

	public class DoublyLinkedList 
	{	
		private Node first;
		private Node last;
	}	
	public DoublyLinkedList( )
	{
		first = null;
		last = null;
	}
	public boolean isEmpty()
	{
		return (first == null);
	}
	public void insertAtFront(String itemName)
	{
		if(isEmpty())
			first = last = new Node(itemName, first);
		else
		{
			Node a = new Node(itemName);
			a.setNext(first);
			first.setPrev(a);
			first = a;
		}
	}
}
