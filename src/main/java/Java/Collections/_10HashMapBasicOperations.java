package Java.Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings("rawtypes")
public class _10HashMapBasicOperations {

	// Iterate HashMap

	public static class HashMap_Iterate {

		public static void main(String[] args) {
			/* This is how to declare HashMap */
			HashMap<Integer, String> hmap = new HashMap<Integer, String>();

			/* Adding elements to HashMap */
			hmap.put(12, "Chaitanya");
			hmap.put(2, "Rahul");
			hmap.put(7, "Singh");
			hmap.put(49, "Ajeet");
			hmap.put(3, "Anuj");

			System.out.println(Collections.singletonList(hmap));
			hmap.forEach((key, value) -> System.out.println(key + " : " + value));
			System.out.println("\n#####Another Way of Printing#####\n");
			/* Display content using Iterator */
			Set set = hmap.entrySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				Map.Entry mentry = (Map.Entry) iterator.next();
				System.out.println(mentry.getKey() + " : " + mentry.getValue());
			}

			/* Get values based on key */
			String var = hmap.get(2);
			System.out.println("Value at index 2 is: " + var);

			/* Remove values based on key */
			hmap.remove(3);
		}

	}

	/*
	 * HashMap Sorting by Keys: In this example we are sorting the HashMap based
	 * on the keys using the TreeMap collection class.
	 */
	public static class HashMap_Sorting {

		public static void main(String[] args) {

			HashMap<Integer, String> hmap = new HashMap<Integer, String>();
			hmap.put(5, "A");
			hmap.put(11, "C");
			hmap.put(4, "Z");
			hmap.put(77, "Y");
			hmap.put(9, "P");
			hmap.put(66, "Q");
			hmap.put(0, "R");

			System.out.println("Before Sorting:");
			Set set = hmap.entrySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				Map.Entry me = (Map.Entry) iterator.next();
				System.out.print(me.getKey() + ": ");
				System.out.println(me.getValue());
			}
			Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
			//Another way to print map
			// map.forEach((key, value)->System.out.println(key+" : "+value));
			
			System.out.println("After Sorting:");
			Set set2 = map.entrySet();
			Iterator iterator2 = set2.iterator();
			while (iterator2.hasNext()) {
				Map.Entry me2 = (Map.Entry) iterator2.next();
				System.out.print(me2.getKey() + ": ");
				System.out.println(me2.getValue());
			}
		}
	}
	
	// ### Synchronize HashMap in Java with example

	public static class HashMapSyncExample {
		public static void main(String args[]) {
			HashMap<Integer, String> hmap = new HashMap<Integer, String>();
			hmap.put(2, "Anil");
			hmap.put(44, "Ajit");
			hmap.put(1, "Brad");
			hmap.put(4, "Sachin");
			hmap.put(88, "XYZ");

			Map map = Collections.synchronizedMap(hmap);
			Set set = map.entrySet();
			synchronized (map) {
				Iterator i = set.iterator();
				// Display elements
				while (i.hasNext()) {
					Map.Entry me = (Map.Entry) i.next();
					System.out.print(me.getKey() + ": ");
					System.out.println(me.getValue());
				}
			}
		}
	}

	public static class HashMap_Basicoperations {

		public static void main(String[] args) {
			// ### Get size of HashMap example

			// Creating a HashMap of int keys and String values
			HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
			// Adding Key and Value pairs to HashMap
			hashmap.put(5, "A");
			hashmap.put(11, "C");
			hashmap.put(4, "Z");
			hashmap.put(77, "Y");
			hashmap.put(9, "P");
			hashmap.put(66, "Q");
			hashmap.put(0, "R");
			System.out.println("Size of hashmap is : " + hashmap.size());

			// ### Remove mapping from HashMap example

			// Removing Key-Value pairs for key 33
			Object removedElement1 = hashmap.remove(66);
			System.out.println("Element removed is: " + removedElement1);

			// ### Remove all mappings from HashMap example

			// Displaying HashMap Elements
			System.out.println("HashMap Elements: " + hashmap);

			// Removing all Mapping
			hashmap.clear();

			// Displaying HashMap Elements after remove
			System.out.println("---------------------");
			System.out.println("After calling clear() HashMap Elements: " + hashmap);
			
			 System.out.println("---------------------");
			// ### Check if a HashMap is empty or not
			
			System.out.println("Is HashMap Empty? "+hashmap.isEmpty());
			
			// Adding few elements
			hashmap.put(11, "Jack");
		    hashmap.put(22, "Rock");
		    hashmap.put(77, "YOCk");
			hashmap.put(9, "PIck");
			hashmap.put(66, "QUick");
			hashmap.put(0, "Ride");
		    
		    System.out.println("Is HashMap Empty? "+hashmap.isEmpty());
		    
		    // ### Check if a particular key exists in HashMap example
		    
		    System.out.println("---------------------");
		    // Checking Key Existence
		    boolean flag = hashmap.containsKey(22);
		    System.out.println("Key 22 exists in HashMap? : " + flag);
		 
		    boolean flag2 = hashmap.containsKey(55);
		    System.out.println("Key 55 exists in HashMap? : " + flag2);
		    
		    System.out.println("---------------------");
		    // Checking Value Existence
		    boolean flag3 = hashmap.containsValue("Ride");
		    System.out.println("String Ride exists in HashMap? : " + flag3);
		    
		 // Checking Value Existence
		    boolean flag4 = hashmap.containsValue("RFSS");
		    System.out.println("String RFSS exists in HashMap? : " + flag4);
		    
		    System.out.println("---------------------");
		    // Getting values from HashMap
		     String val=hashmap.get(9);
		     System.out.println("The Value mapped to Key 4 is:"+ val);
		 
		     /* Here Key "5" is not mapped to any value so this 
		      * operation returns null.
		      */
		     String val2=hashmap.get(5);
		     System.out.println("The Value mapped to Key 5 is:"+ val2);
		     
		     System.out.println("---------------------");
		     
			// ### Getting Set of HashMap keys

			// Create a HashMap
			HashMap<String, String> hmap = new HashMap<String, String>();

			// Adding few elements
			hmap.put("Key1", "Jack");
			hmap.put("Key2", "Rock");
			hmap.put("Key3", "Rick");
			hmap.put("Key4", "Smith");
			hmap.put("Key5", "Will");

			// Getting Set of HashMap keys
			/*
			 * public Set<K> keySet(): Returns a Set view of the keys contained
			 * in this map. The set is backed by the map, so changes to the map
			 * are reflected in the set, and vice-versa.
			 */
			Set<String> keys = hmap.keySet();
			System.out.println("Set of Keys contains: ");

			/*
			 * If your HashMap has integer keys then specify the iterator like
			 * this: Iterator<Integer> it = keys.iterator();
			 */
			Iterator<String> it = keys.iterator();
			// Displaying keys. Output will not be in any particular order
			while (it.hasNext()) {
				System.out.println(it.next());
			}

		}
	}
}
