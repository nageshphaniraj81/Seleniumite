package CircularLinkedList;

public class AppForCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		myList.insertLast(99999);
		myList.insertLast(88888);
		myList.displayList();

	}
}

// OutPut:
// List (first -> last)
// { 88 }
// { 99 }
// { 50 }
// { 100 }
// { 99999 }
// { 88888 }
