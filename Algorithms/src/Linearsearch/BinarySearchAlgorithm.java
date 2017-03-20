package Linearsearch;

public class BinarySearchAlgorithm {

	public static void main(String [] args){
	int[] searchArray = { 1, 3, 5, 7, 9, 15, 19, 20, 28, 30 }; // array should be sorted
	System.out.println(binarySearch(searchArray, 19));
	}

	public static int binarySearch(int []  a, int x){
		int p = 0;
		int r = a.length-1;
		
		while (p <= r){
			int q = (p+r)/2;
			if(x<a[q])r = q-1;
			else if(x>a[q]) p = q+1;
			else return q;
		}
	return -1;
}
}
