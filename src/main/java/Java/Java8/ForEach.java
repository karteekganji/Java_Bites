package Java.Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {
	
	public static class IterateMap {
		public static void main(String[] args) {
			Map<Integer, String> hmap = new HashMap<Integer, String>();
			hmap.put(1, "Monkey");
			hmap.put(2, "Dog");
			hmap.put(3, "Cat");
			hmap.put(4, "Lion");
			hmap.put(5, "Tiger");
			hmap.put(6, "Bear");
			/*
			 * forEach to iterate and display each key and value pair of
			 * HashMap.
			 */
			hmap.forEach((key, value) -> System.out.println(key + " - " + value));
			/*
			 * forEach to iterate a Map and display the value of a particular
			 * key
			 */
			hmap.forEach((key, value) -> {
				if (key == 4) {
					System.out.println("Value associated with key 4 is: " + value);
				}
			});
			/*
			 * forEach to iterate a Map and display the key associated with a
			 * particular value
			 */
			hmap.forEach((key, value) -> {
				if ("Cat".equals(value)) {
					System.out.println("Key associated with Value Cat is: " + key);
				}
			});
		}
	}
	
	public static class IterateList {
		public static void main(String[] args) {
			List<String> fruits = new ArrayList<String>();
			fruits.add("Apple");
			fruits.add("Orange");
			fruits.add("Banana");
			fruits.add("Pear");
			fruits.add("Mango");
			// lambda expression in forEach Method
			fruits.forEach(str -> System.out.println(str));
		}
	}
	
	public static class IterateStream {
		   public static void main(String[] args) {
		      List<String> names = new ArrayList<String>();
		      names.add("Maggie");
		      names.add("Michonne");
		      names.add("Rick");
		      names.add("Merle");
		      names.add("Governor");
		      names.stream() //creating stream 
		     .filter(f->f.startsWith("M")) //filtering names that starts with M 
		     .forEach(System.out::println); //displaying the stream using forEach
		}
	}
	
	public static class  ForEachOrderedMethod {
		public static void main(String[] args) {
			List<String> names = new ArrayList<String>();
			names.add("Maggie");
			names.add("Michonne");
			names.add("Rick");
			names.add("Merle");
			names.add("Governor");
			// forEach - the output would be in any order
			System.out.println("Print using forEach");
			names.stream().filter(f -> f.startsWith("M")).parallel().forEach(n -> System.out.println(n));

			/*
			 * forEachOrdered - the output would always be in this order:
			 * Maggie, Michonne, Merle
			 */
			System.out.println("Print using forEachOrdered");
			names.stream().filter(f -> f.startsWith("M")).parallel().forEachOrdered(n -> System.out.println(n));
		}
	}

}
