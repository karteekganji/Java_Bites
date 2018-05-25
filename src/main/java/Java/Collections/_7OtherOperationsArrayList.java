package Java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class _7OtherOperationsArrayList {

	public static class ComparingTwoArrayLists {
		public static void main(String[] args) {
			ArrayList<String> al1 = new ArrayList<String>();
			al1.add("hi");
			al1.add("How are you");
			al1.add("Good Morning");
			al1.add("bye");
			al1.add("Good night");

			ArrayList<String> al2 = new ArrayList<String>();
			al2.add("Howdy");
			al2.add("Good Evening");
			al2.add("bye");
			al2.add("Good night");

			// Storing the comparison output in ArrayList<String>
			ArrayList<String> al3 = new ArrayList<String>();
			for (String temp : al1)
				al3.add(al2.contains(temp) ? "Yes" : "No");
			System.out.println(al3);

			// Storing the comparison output in ArrayList<Integer>
			ArrayList<Integer> al4 = new ArrayList<Integer>();
			for (String temp2 : al1)
				al4.add(al2.contains(temp2) ? 1 : 0);
			System.out.println(al4);
		}
	}

	/**
	 * Example 1: Collections.synchronizedList() method for Synchronizing
	 * ArrayList
	 */
	public static class Synchronize_ArrayList {

		public static void main(String a[]) {
			List<String> syncal = Collections.synchronizedList(new ArrayList<String>());

			// Adding elements to synchronized ArrayList
			syncal.add("Pen");
			syncal.add("NoteBook");
			syncal.add("Ink");

			System.out.println("Iterating synchronized ArrayList:");
			synchronized (syncal) {
				Iterator<String> iterator = syncal.iterator();
				while (iterator.hasNext())
					System.out.println(iterator.next());
			}
		}
	}

	/**
	 * Method 2: Using CopyOnWriteArrayList
	 * 
	 * CopyOnWriteArrayList is a thread-safe variant of ArrayList.
	 */

	public static class Synchronize_ArrayList2 {

		public static void main(String a[]) {
			CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();

			// Adding elements to synchronized ArrayList
			al.add("Pen");
			al.add("NoteBook");
			al.add("Ink");

			System.out.println("Displaying synchronized ArrayList Elements:");
			// Synchronized block is not required in this method
			Iterator<String> iterator = al.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}
	}

	/**
	 * Example of swapping two elements in ArrayList
	 * 
	 * @Syntax : swap(List list, int i1, int i2)
	 */

	public static class SwappingExample {

		public static void main(String a[]) {
			ArrayList<String> al = new ArrayList<String>();
			al.add("Sachin");
			al.add("Rahul");
			al.add("Saurav");
			al.add("Sunil");
			al.add("Kapil");
			al.add("Vinod");

			System.out.println("ArrayList before Swap:");
			for (String temp : al) {
				System.out.println(temp);
			}

			// Swapping 2nd(index 1) element with the 5th(index 4) element
			Collections.swap(al, 1, 4);

			System.out.println("ArrayList after swap:");
			for (String temp : al) {
				System.out.println(temp);
			}
		}
	}

	/**
	 * @Example : override toString method for ArrayList in Java
	 */

	public static class Student {
		private String studentname;
		private int studentage;

		Student(String name, int age) {
			this.studentname = name;
			this.studentage = age;
		}

		@Override
		public String toString() {
			return "Name is: " + this.studentname + " & Age is: " + this.studentage;
		}
	}
	
	public static class Override_toStringo_ArrayList {
		public static void main(String[] args) {
			ArrayList<Student> al = new ArrayList<Student>();
			al.add(new Student("Chaitanya", 26));
			al.add(new Student("Ajeet", 25));
			al.add(new Student("Steve", 55));
			al.add(new Student("Mary", 18));
			al.add(new Student("Dawn", 22));
			for (Student tmp : al) {
				System.out.println(tmp);
			}
		}
	}
}