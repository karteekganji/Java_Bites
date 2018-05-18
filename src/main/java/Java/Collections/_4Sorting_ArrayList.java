package Java.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class _4Sorting_ArrayList {

	/*
	 * Example 1: Sorting of ArrayList<String>
	 
	  
	 * Here we are sorting the ArrayList of String type. We are doing it
	 * by simply calling the Collections.sort(arraylist) method. 
	 * The output List will be sorted alphabetically.
	 */
	
	public static class Sorting_Of_ArrayListString {

		public static void main(String args[]) {
			ArrayList<String> listofcountries = new ArrayList<String>();
			listofcountries.add("India");
			listofcountries.add("US");
			listofcountries.add("China");
			listofcountries.add("Denmark");
			/* Unsorted List */
			System.out.println("Before Sorting:");
			for (String counter : listofcountries) {
				System.out.println(counter);
			}
			System.out.println();
			/* Sort statement */
			Collections.sort(listofcountries);
			/* Sorted List */
			System.out.println("After Sorting:");
			for (String counter : listofcountries) {
				System.out.println(counter);
			}
		}
	}

	/*
	 * Example 2: Sorting of ArrayList<Integer> 
	 * The same Collections.sort() method can be used for sorting the Integer ArrayList as well.
	 */
	
	public static class Sorting_Of_ArrayListInteger {

		public static void main(String args[]) {
			ArrayList<Integer> arraylist = new ArrayList<Integer>();
			arraylist.add(11);
			arraylist.add(2);
			arraylist.add(7);
			arraylist.add(3);
			/* ArrayList before the sorting */
			System.out.println("Before Sorting:");
			for (int counter : arraylist) {
				System.out.println(counter);
			}
			System.out.println();
			/* Sorting of arraylist using Collections.sort */
			Collections.sort(arraylist);

			/* ArrayList after sorting */
			System.out.println("After Sorting:");
			for (int counter : arraylist) {
				System.out.println(counter);
			}
		}
	}
	
	/*
	 * Example: Sorting in Descending order 
	 * We are using Collections.reverseOrder() method along with Collections.sort() in order
	 * to sort the list in decreasing order. In the below example we have used
	 * the following statement for sorting in reverse order.
	 * 
	 * Collections.sort(arraylist, Collections.reverseOrder());
	 * 
	 * However the reverse order sorting can also be done as following – This
	 * way the list will be sorted in ascending order first and then it will be
	 * reversed.
	 * 
	 * Collections.sort(list);
	 * Collections.reverse(list);
	 */

	public static class Sorting_Of_ArrayListDescendingOrder {

		public static void main(String args[]) {
			ArrayList<String> arraylist = new ArrayList<String>();
			arraylist.add("AA");
			arraylist.add("ZZ");
			arraylist.add("CC");
			arraylist.add("FF");

			/* Unsorted List: ArrayList content before sorting */
			System.out.println("Before Sorting:");
			for (String str : arraylist) {
				System.out.println(str);
			}
			System.out.println();
			/* Sorting in decreasing order */
			Collections.sort(arraylist, Collections.reverseOrder());

			/* Sorted List in reverse order */
			System.out.println("ArrayList in descending order:");
			for (String str : arraylist) {
				System.out.println(str);
			}
		}
	}

}
