package TestCases.CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListCompare {

	public static void main(String[] args) {

	    List <Integer> lList = new LinkedList<Integer>();
	    List <Integer> aList = new ArrayList<Integer>();
	    durationCheck(aList,"Array List");
	    durationCheck(lList,"Linked List");
	   
		
	}

	public static void durationCheck(List<Integer> list,String listType){
		
		System.out.println("\n Beginning the duration method of type :"+listType);
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++){
			list.add(i);
		}
		
		int size = list.size();
		int elementsToAdd = size + 200000;
		
		
//		for(int i = size;i<elementsToAdd;i++){
//			//list.add(i);
//			// Adding in the beginning
//			list.add(0,i);
//		}
		
		// Remove from end
	
//		for(int i=90000;i<92000;i++){
//			list.remove(i);
//		}
		
		// Remove from end
		
		for(int i=0;i<1000;i++){
			list.remove(i);
		}
		
		long endTime = System.currentTimeMillis();
		long duration = endTime-startTime;
		System.out.println("Time taken to execute the method for type --- "+listType+" --- is : "+duration+" MilliSeconds");
		
		
		
		
	}
	
}
