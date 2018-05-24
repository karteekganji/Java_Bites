package Java.Collections;

import java.util.ArrayList;
import java.util.List;

public class _6GetORSearchArrayListOperations {

	public static class SublistExample {

		/** Get sublist of an ArrayList with example */

		/** Syntax : List subList(int fromIndex, int toIndex) */

		/*
		 * The subList method returns a list therefore to store the sublist in
		 * another ArrayList we must need to type cast the returned value in
		 * same way as I did in the below example. On the other side if we are
		 * storing the returned sublist into a list then there is no need to
		 * type cast (Refer the example).
		 */

		public static void main(String a[]) {
			ArrayList<String> al = new ArrayList<String>();

			// Addition of elements in ArrayList
			al.add("Steve");
			al.add("Justin");
			al.add("Ajeet");
			al.add("John");
			al.add("Arnold");
			al.add("Chaitanya");

			System.out.println("Original ArrayList Content: " + al);

			// Sublist to ArrayList
			ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
			System.out.println("SubList stored in ArrayList: " + al2);

			// Sublist to List
			List<String> list = al.subList(1, 4);
			System.out.println("SubList stored in List: " + list);
		}
	}

	public static class LastIndexOfExample {
		public static void main(String args[]) {
			// ArrayList of Integer Type
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(1);
			al.add(88);
			al.add(9);
			al.add(17);
			al.add(17);
			al.add(9);
			al.add(17);
			al.add(91);
			al.add(27);
			al.add(1);
			al.add(17);
			System.out.println(al);
			System.out.println("Last occurrence of element 1: " + al.lastIndexOf(1));
			System.out.println("Last occurrence of element 9: " + al.lastIndexOf(9));
			System.out.println("Last occurrence of element 17: " + al.lastIndexOf(17));
			System.out.println("Last occurrence of element 91: " + al.lastIndexOf(91));
			System.out.println("Last occurrence of element 88: " + al.lastIndexOf(88));
		}
	}
}
