package SearchingAlgorithm;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int[] searchArray = { 1, 3, 5, 7, 9, 15, 19, 20, 28, 30 }; // array should be sorted
		System.out.println(recursiveBinarySearch(searchArray,0,searchArray.length-1, 19));

	}
	
	public static int recursiveBinarySearch(int[] a,int p,int r, int x){
		  if (p>r) {
			  return -1;
		  }
		  else{
			  int q = (p+r)/2;
			 if (a[q]== x) return q;
			 else if (a[q] > x) return recursiveBinarySearch(a,p,q-1,x);
			 else if (a[q] < x) return recursiveBinarySearch(a,q+1,r,x);
		  }
		  return -1;
	}
	

}
