package TestCases.CoreJava;

public class ArrayPractice {

	public static void main(String[] args) {

		System.out.println(searchElement(new int[] {2,3,4,5,6,7}, 5)); //3
		System.out.println(searchElement(new int[] {2,3,4,5,6,7}, 9)); //-1

	}
	
	public static int searchElement(int[] nums,int target){
		
		int index = 0;
		for(int i : nums){
			if(i==target){
				return index;
			}
			index++;
		}
		
		return -1;
	}

}
