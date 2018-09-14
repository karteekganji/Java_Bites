package Java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _14ComparableInterface {

	public static class SortingArraysAndWrapperClass {

		public static void main(String[] args) {
			/*
			 * Integer class implements Comparable Interface so we can use the
			 * sort method
			 */
			int[] arr = { 11, 55, 22, 0, 89 };
			Arrays.sort(arr);
			System.out.print("Sorted Int Array: ");
			System.out.println(Arrays.toString(arr));

			/*
			 * String class implements Comparable Interface so we can use the
			 * sort method
			 */
			System.out.print("Sorted String Array: ");
			String[] names = { "Steve", "Ajeet", "Kyle" };
			Arrays.sort(names);
			System.out.println(Arrays.toString(names));

			/*
			 * String class implements Comparable Interface so we can use the
			 * sort method
			 */
			System.out.print("Sorted List: ");
			List<String> fruits = new ArrayList<String>();
			fruits.add("Orange");
			fruits.add("Banana");
			fruits.add("Apple");
			fruits.add("Guava");
			fruits.add("Grapes");
			Collections.sort(fruits);
			for (String s : fruits)
				System.out.print(s + ", ");
		}

	}

	public static class Author implements Comparable<Author> {

		String firstName;
		String lastName;
		String bookName;

		Author(String first, String last, String book) {
			this.firstName = first;
			this.lastName = last;
			this.bookName = book;
		}

		@Override
		/*
		 * This is where we write the logic to sort. This method sort
		 * automatically by the first name in case that the last name is the
		 * same.
		 */
		public int compareTo(Author au) {
			/*
			 * Sorting by last name. compareTo should return < 0 if
			 * this(keyword) is supposed to be less than au, > 0 if this is
			 * supposed to be greater than object au and 0 if they are supposed
			 * to be equal.
			 */
			int last = this.lastName.compareTo(au.lastName);
			// Sorting by first name if last name is same d
			return last == 0 ? this.firstName.compareTo(au.firstName) : last;
		}
	}

	public static class SortAuthByNames {
		public static void main(String args[]) {
			// List of objects of Author class
			ArrayList<Author> al = new ArrayList<Author>();
			al.add(new Author("Henry", "Miller", "Tropic of Cancer"));
			al.add(new Author("Nalo", "Hopkinson", "Brown Girl in the Ring"));
			al.add(new Author("Frank", "Miller", "300"));
			al.add(new Author("Deborah", "Hopkinson", "Sky Boys"));
			al.add(new Author("George R. R.", "Martin", "Song of Ice and Fire"));

			/*
			 * Sorting the list using Collections.sort() method, we can use this
			 * method because we have implemented the Comparable interface in
			 * our user defined class Author
			 */
			Collections.sort(al);
			for (Author str : al) {
				System.out.println(str.firstName + " " + str.lastName + " " + "Book: " + str.bookName);
			}
		}
	}

}
