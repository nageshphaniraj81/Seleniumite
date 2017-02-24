package TestCases.CollectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIteration {

	public static void main(String[] args) {
		// Stores in Pairs (key -> value : Entry)
		Map<Integer, String> cars = new HashMap<Integer, String>();

		cars.put(1, "BMW");
		cars.put(4, "Audi");
		cars.put(3, "Toyota");
		cars.put(2, "Hyundai");

		// Iteration using entrySet

		for (Map.Entry<Integer, String> eachCar : cars.entrySet()) {
			int key = eachCar.getKey();
			String values = cars.get(key);
			System.out.println("Iteration using Enter Set $$ For HashMap $$ Key :" + key + " Value :" + values);
		}

		// Iteration using key set

		for (int eachKey : cars.keySet()) {
			int key = eachKey;
			String values = cars.get(key);
			System.out.println("Iteration using Key Set $$ For HashMap $$ Key :" + key + " Value :" + values);
		}

		System.out.println("************************************************************************");
		// Stores in Pairs (key -> value : Entry)
		Map<Integer, String> cars2 = new LinkedHashMap<Integer, String>();

		cars2.put(1, "BMW");
		cars2.put(4, "Audi");
		cars2.put(3, "Toyota");
		cars2.put(2, "Hyundai");

		// Iteration using entrySet

		for (Map.Entry<Integer, String> eachCar : cars2.entrySet()) {
			int key = eachCar.getKey();
			String values = cars2.get(key);
			System.out.println("Iteration using Enter Set $$ For LinkedHashMap $$ Key :" + key + " Value :" + values);
		}

		// Iteration using key set

		for (int eachKey : cars2.keySet()) {
			int key = eachKey;
			String values = cars2.get(key);
			System.out.println("Iteration using Key Set $$ For LinkedHashMap $$ Key :" + key + " Value :" + values);
		}

		System.out.println("************************************************************************");
		// Stores in Pairs (key -> value : Entry)
		Map<Integer, String> cars3 = new TreeMap<Integer, String>();

		cars3.put(1, "BMW");
		cars3.put(4, "Audi");
		cars3.put(3, "Toyota");
		cars3.put(2, "Hyundai");

		// Iteration using entrySet

		for (Map.Entry<Integer, String> eachCar : cars3.entrySet()) {
			int key = eachCar.getKey();
			String values = cars3.get(key);
			System.out.println("Iteration using Enter Set $$ For Treemap $$ Key :" + key + " Value :" + values);
		}

		// Iteration using key set

		for (int eachKey : cars3.keySet()) {
			int key = eachKey;
			String values = cars3.get(key);
			System.out.println("Iteration using Key Set $$ For TreeMap $$ Key :" + key + " Value :" + values);
		}

	}

}
