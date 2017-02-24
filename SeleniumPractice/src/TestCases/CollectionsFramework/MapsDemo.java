package TestCases.CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {

     //Stores in Pairs (key -> value : Entry)
	Map<Integer,String> cars = new HashMap<Integer,String>();
	
	cars.put(1, "BMW");
	cars.put(3, "Audi");
	cars.put(6, "Toyota");
	cars.put(9, "Hyundai");
	
	String myCar = cars.get(6);
	System.out.println("My car is : "+myCar);
	
	cars.put(10, "Hyundai");
	String myCar2 = cars.get(3);
	System.out.println("My second car is : "+myCar2);
	}

}
