package DSClasses;

public class Queue {
	
	private int maxSize;
	private long [] queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		super();
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void insert(long j){
		
		if(rear == maxSize-1){
			rear = -1;
		}else{
		rear++;
		queueArray[rear] = j;
		nItems++;
		}
	}
	
	public void view(){
		
		System.out.print("[ ");
		for(int i=0;i<queueArray.length;i++){
			System.out.print(queueArray[i]+ " ");
		}
		System.out.print("]");
	}
	
	public long remove(){
		long temp = queueArray[front];
		front++;
		if(front == maxSize){
			front=0; // we can set the front to 0th index so that we can re utilize the array
		}
		nItems--;	
		return temp;
	}
	
	public long peekFront(){
		return queueArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems==0);
	}
	
	public boolean isFull(){
		return (nItems==maxSize);
	}

}
