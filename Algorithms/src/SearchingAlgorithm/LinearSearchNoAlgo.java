package SearchingAlgorithm;

// Complexity : ( O (n))

public class LinearSearchNoAlgo {

	public static void main(String[] args) {

		int[] searchArray = { 1, 3, 5, 7, 9, 8, 8, 2, 8, 0 };
		System.out.println(linearSearch(searchArray, 2));
	}

	public static int linearSearch(int[] a, int x) {
		for (int i : a) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
