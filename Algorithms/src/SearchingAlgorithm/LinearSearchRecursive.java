package SearchingAlgorithm;

public class LinearSearchRecursive {

	public static void main(String[] args) {
	
		int[] searchArray = { 1, 3, 5, 7, 9, 8, 8, 2, 8, 0 };
		System.out.println(recursiveLinearSearch(searchArray,0,2));
	}
	
	public static int recursiveLinearSearch(int [] a,int i,int x){
		int n = a.length-1;
		if (i>n)return -1;
		else if (a[i]==x) return i;
		else return recursiveLinearSearch(a,i+1,2);
	}

}
