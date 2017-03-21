package SortingAlgorithm;

import java.util.Arrays;

public class QuickSort {
	
    public static void main(String []  args){
    	int [] inputArray = {12,81,74,43,1098,0,8,92,17,754,912,0,6,4};
    	quickSort(inputArray,0,inputArray.length-1);
    	System.out.println(Arrays.toString(inputArray));
    }
    
    public static void quickSort(int [] inputArray,int start, int end){
    	
    	if(start<end){
    		int q = partition(inputArray,start,end);
    		quickSort(inputArray,start,q-1);
    		quickSort(inputArray,q+1,end);
    	}   	
    }
    
    public static int partition(int [] inputArray,int start, int end){
    	
    	int x = inputArray[end];
    	int i = start-1;
    	
    	for(int j=start;j <= end-1;j++){
    		if (inputArray[j]<=x){
    			i = i+1;
    			
    			int temp = inputArray[j];
    			inputArray[j] = inputArray[i];
    			inputArray[i] = temp;
    		}
    	}
    	
		int temp = inputArray[i+1];
		inputArray[i+1] = inputArray[end];
		inputArray[end] = temp;
    	
    	return i+1;
    }

}
