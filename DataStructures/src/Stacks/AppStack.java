package Stacks;

import Queues.Queue;

public class AppStack {

	public static void main(String[] args) {
		
		Stack stack1 = new Stack(3);
		stack1.push(44);
		stack1.push(66);
		stack1.push(97);
		stack1.push(101);
		
		//System.out.println(stack1.peak());
		
		while(!stack1.isEmpty()){
			long value = stack1.pop();
			System.out.println(value);
		}
		
//		Queue queue = new Queue(7);
//		queue.insert(200);
//		queue.insert(500);
//		queue.insert(100);
//		queue.insert(20);
//		queue.insert(2);
//		queue.insert(1);
//		queue.insert(1);
//		queue.insert(1);
//		queue.insert(1);
//		queue.insert(1);
//		queue.insert(1);
//		queue.insert(1);
//		queue.insert(1);
//		
//		queue.view();
		
		

	}

}
