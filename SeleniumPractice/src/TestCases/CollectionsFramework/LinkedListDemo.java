package TestCases.CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

	     LinkedList <String> cars = new LinkedList<String>();
	     cars.add("BMW");
	     cars.add("Honda");
	     cars.add("Audi");
	     
	     // Size
	     System.out.println("Size of arraylist is :"+cars.size());

	     //Get
	     System.out.println("Item on Index 1 :"+cars.get(0));
	     
	     //Iteration
	     for(int i = 0;i<cars.size();i++){
	    	 System.out.println("Item on index : "+i+" is "+cars.get(i));
	     }
	     
	     //Iteration 2
	     for(String car: cars){
	    	 System.out.println("Item on list :"+car); 
	     }
	     
	     //Remove items
	     cars.remove(1);
	     for(String car: cars){
	    	 System.out.println("Item on list this time :"+car); 
	     }
		}

	    List <Integer> lList = new LinkedList<Integer>();
	    List <Integer> aList = new ArrayList<Integer>();
	    
	    
	    
	    
}
