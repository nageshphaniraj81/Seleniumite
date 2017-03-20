package SinglyLinkedList;

public class AppForSinglyLinkedList {

	public static void main(String[] args) {

		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		myList.insertLast(99999);
		myList.insertLast(88888);
		myList.displayList();
	}
}

// List (first -> last)
// { 88 }
// { 99 }
// { 50 }
// { 100 }
// { 99999 }
// { 88888 }
