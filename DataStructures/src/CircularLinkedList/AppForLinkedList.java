package CircularLinkedList;
import SinglyLinkedList.Node;

public class AppForLinkedList {

	public static void main(String[] args) {
		
		
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		Node nodeC = new Node();
		nodeB.data = 7;

		Node nodeD = new Node();
		nodeB.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
	
		System.out.println("Length is: "+listLength(nodeA)); //4
		System.out.println("Length is: "+listLength(nodeB)); //3
		

	}
	
	public static int listLength(Node aNode){
		
		int length = 0;
		Node currentNode = aNode;
		
		while(currentNode!=null){	
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}

}
