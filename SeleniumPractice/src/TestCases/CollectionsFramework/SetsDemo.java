package TestCases.CollectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {

	  System.out.println("Hash Set : No order maintained");
      Set<String> set = new HashSet<String>();
      
      set.add("Audi");
      set.add("BMW");
      set.add("Toyota");
      set.add("Toyota");
		
      System.out.println(set);
      
      for(String item:set){
    	  System.out.println("Item in Hash Set :"+item);
      }
      
      set.remove("Toyota");
      
      for(String item:set){
    	  System.out.println("Item in Hash Set after removing Toyota :"+item);
      }
      
      System.out.println("*************************************************");
      System.out.println("Linked Hash Set :  Order IS maintained");
      
      Set<String> hashSet = new LinkedHashSet<String>();
      
      hashSet.add("Audi");
      hashSet.add("BMW");
      hashSet.add("Toyota");
      hashSet.add("Toyota");
		
      System.out.println(hashSet);
      
      for(String item:hashSet){
    	  System.out.println("Item in Linked Hash Set :"+item);
      }
      
      System.out.println("*************************************************");
      System.out.println("Tree Set :  Natural Order IS maintained");
      Set<String> treeSet = new TreeSet<String>();
      
      treeSet.add("Toyota");
      treeSet.add("BMW");
      treeSet.add("Audi");
      treeSet.add("Merc");
		
      System.out.println(treeSet);
      
      for(String item:treeSet){
    	  System.out.println("Item in Tree Set :"+item);
      }
      
      System.out.println("*************************************************");
      
      
      List<String> list = new ArrayList<String>();
      
      list.add("Audi");
      list.add("BMW");
      list.add("Toyota");
      list.add("Toyota");
		
      System.out.println(list);
      
      for(String item:list){
    	  System.out.println("Item in ArrayList :"+item);
      }
		
      System.out.println("*************************************************");
	}

}
