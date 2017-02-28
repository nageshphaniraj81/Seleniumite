package JavaPuzzelsEasy;

// In mathematics, the Fibonacci numbers or Fibonacci series or Fibonacci sequence are the numbers in the

// following integer sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... By definition,
// the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum 
// of the previous two. Below example shows how to create fibonacci series. 

public class Fibonacci {

	public static void main(String[] args) {

		int maxSize = 20;
		Integer[] febo = new Integer[maxSize];

		febo[0] = 0;
		febo[1] = 1;

		for (int i = 2; i < febo.length; i++) {
			febo[i] = febo[i - 1] + febo[i - 2];
		}

		for (int x : febo) {
			System.out.print(x + " ");
		}

	}

}
