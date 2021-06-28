package Java.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class _8ArrayList_Conversions {

	public static class linkedListToArrayList {
		public static void main(String[] args) {
			LinkedList<String> linkedlist = new LinkedList<String>();
			linkedlist.add("Harry");
			linkedlist.add("Jack");
			linkedlist.add("Tim");
			linkedlist.add("Rick");
			linkedlist.add("Rock");

			List<String> list = new ArrayList<String>(linkedlist);

			for (String str : list) {
				System.out.println(str);
			}
		}
	}
	
	public static class VectorToArrayList {

		public static void main(String[] args) {

			// Creating a Vector of String elements
			Vector<String> vector = new Vector<String>();

			// Populate Vector
			vector.add("Rahul");
			vector.add("Steve");
			vector.add("Jude");
			vector.add("Locke");
			vector.add("Mike");
			vector.add("Robert");
			System.out.println("Vector Elements :");
			// Displaying Vector elements
			for (String str : vector) {
				System.out.println(str);
			}

			// Converting Vector to ArrayList
			ArrayList<String> arraylist = new ArrayList<String>(vector);

			// Displaying ArrayList Elements
			System.out.println("\nArrayList Elements :");
			for (String s : arraylist) {
				System.out.println(s);
			}
		}
	}
	
	public static class ArrayListTOArrayManually {
		public static void main(String[] args) {

			/* ArrayList declaration and initialization */
			ArrayList<String> arrlist = new ArrayList<String>();
			arrlist.add("String1");
			arrlist.add("String2");
			arrlist.add("String3");
			arrlist.add("String4");

			/* ArrayList to Array Conversion */
			String array[] = new String[arrlist.size()];
			for (int j = 0; j < arrlist.size(); j++) {
				array[j] = arrlist.get(j);
			}

			/* Displaying Array elements */
			for (String k : array) {
				System.out.println(k);
			}
		}
	}
	
	public static class ArrayListTOArray {
		public static void main(String[] args) {

			/* ArrayList declaration and initialization */
			ArrayList<String> friendsnames = new ArrayList<String>();
			friendsnames.add("Ankur");
			friendsnames.add("Ajeet");
			friendsnames.add("Harsh");
			friendsnames.add("John");

			/* ArrayList to Array Conversion */
			String frnames[] = friendsnames.toArray(new String[friendsnames.size()]);

			/* Displaying Array elements */
			for (String k : frnames) {
				System.out.println(k);
			}
		}
	}
	
	public static class HashSetToArrayList {
		public static void main(String[] args) {
			// Create a HashSet
			HashSet<String> hset = new HashSet<String>();

			// add elements to HashSet
			hset.add("Steve");
			hset.add("Matt");
			hset.add("Govinda");
			hset.add("John");
			hset.add("Tommy");

			// Displaying HashSet elements
			System.out.println("HashSet contains: " + hset);

			// Creating a List of HashSet elements
			List<String> list = new ArrayList<String>(hset);

			// Displaying ArrayList elements
			System.out.println("ArrayList contains: " + list);
		}
	}
}
