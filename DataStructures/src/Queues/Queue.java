package Queues;

public class Queue {

	private int maxSize; // Set number of slots
	private long[] queueArray; // slots to maintain data
	private int front; // this is the index postition of front
	private int rear; // this is the index postition of rear
	private int nItems; // counter to maintain number of items

	public Queue(int size) {
		super();
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0; // Index position of the first slot of the array
		this.rear = -1; // There is no item in the array yet to be considered as
						// the last item
		this.nItems = 0; // we dont have elements in the array yet
	}

	public void insert(long j) {

		if (rear == maxSize - 1) {
			rear = -1;
		} else {
			rear++;
			queueArray[rear] = j;
			nItems++;
		}
	}

	public void view() {

		System.out.print("[ ");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}

	public long remove() {
		long temp = queueArray[front];
		front++;
		if (front == maxSize) {
			front = 0; // we can set the front to 0th index so that we can re
						// utilize the array
		}
		nItems--;
		return temp;
	}

	public long peekFront() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

}
