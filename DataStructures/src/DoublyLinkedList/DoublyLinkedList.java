package DoublyLinkedList;

public class DoublyLinkedList {
	
	private NodeAdvanced first;
	private NodeAdvanced last;
	
	// add a constructur the class (Optional)
	public DoublyLinkedList(){
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void insertFirst(int data){
		NodeAdvanced newNodeAdvanced = new NodeAdvanced();
		newNodeAdvanced.data = data;
		if(isEmpty()){
			last = newNodeAdvanced;
		}else{
			first.previous = newNodeAdvanced;
		}
		this.first = newNodeAdvanced;
	}
	
	public void insertLast(int data){
		NodeAdvanced newNodeAdvanced = new NodeAdvanced();
		newNodeAdvanced.data = data;
		
		if(isEmpty()){
			first = newNodeAdvanced;
		}else{
			last.next = newNodeAdvanced;
			newNodeAdvanced.previous = last;
		}
		this.last = newNodeAdvanced;
	}
	
	
	

}
