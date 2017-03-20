package Stacks;

public class AppStack {

	public static void main(String[] args) {

		Stack stack1 = new Stack(3);
		stack1.push(44);
		stack1.push(66);
		stack1.push(97);
		stack1.push(101);

		while (!stack1.isEmpty()) {
			long value = stack1.pop();
			System.out.println(value);
		}

	}

}

// OutPut
// Stack is full, Element : 101 cannot be pushed
// 97
// 66
// 44
