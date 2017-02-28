package JavaPuzzelsModerate;

//You have got a range of numbers between 1 to N, where one of the number is repeated. 
//You need to write a program to find out the duplicate number. 
// Formula : duplicateValue = findSum(x) - (lastIndex * (lastIndex+1)/2);

public class DuplicateNumber {

	public static int findSum(int[] x) {

		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		System.out.println(sum);
		return sum;
	}
	
	public static int findDuplicate(int[] x){
		
		int duplicateValue =0;
		int lastIndex = x.length-1;
		duplicateValue = findSum(x) - (lastIndex * (lastIndex+1)/2);
		return duplicateValue;
	}

	public static void main(String[] args) {
		
		int [] myArray = {1,2,3,4,5,6,7,8,9,5};
		int duplicateValue = findDuplicate(myArray);
		System.out.println("Duplicate value in my array is :"+duplicateValue);

	}

}
