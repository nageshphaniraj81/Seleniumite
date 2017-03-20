package SinglyLinkedList;

public class SinglyLinkedList {

	private Node first;

	public SinglyLinkedList() {
		first = null;
	}

	// To check if the linked list is empty
	public boolean isEmpty() {
		return (first == null);
	}

	// To insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}

	// To insert at the end of the list
	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

	// To delete first node
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}

	// To display linked list
	public void displayList() {
		System.out.println("List (first -> last)");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}

}
