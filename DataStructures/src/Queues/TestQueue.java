package Queues;

public class TestQueue {

	public static void main(String[] args) {
            
         Queue myQueue = new Queue(5);
         myQueue.insert(100);
         myQueue.insert(900);
         myQueue.insert(20);
         myQueue.insert(1511);
         myQueue.insert(6);
         myQueue.insert(12);
         myQueue.insert(2);
         myQueue.insert(2);
         myQueue.insert(2);
         myQueue.view();
	}

}
