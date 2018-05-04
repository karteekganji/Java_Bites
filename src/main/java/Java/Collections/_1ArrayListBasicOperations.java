package Java.Collections;

import java.util.ArrayList;

public class _1ArrayListBasicOperations {

	/**
	 * Arraylist class implements List interface. It is widely used because of
	 * the functionality and flexibility it offers. Most of the developers
	 * choose Arraylist over Array as it’s a very good alternative of
	 * traditional java arrays. ArrayList is a resizable-array implementation of
	 * the List interface. It implements all optional list operations, and
	 * permits all elements, including null.
	 * 
	 * 
	 * The issue with arrays is that they are of fixed length so if it is full
	 * you cannot add any more elements to it, likewise if there are number of
	 * elements gets removed from it the memory consumption would be the same as
	 * it doesn’t shrink. On the other ArrayList can dynamically grow and shrink
	 * after addition and removal of elements. Apart from these benefits
	 * ArrayList class enables us to use predefined methods of it which makes
	 * our task easy.
	 */

	// ArrayList Example in Java

	public static class ArrayListExample {
		public static void main(String args[]) {

			/*
			 * Creation of ArrayList: I'm going to add String elements so I made
			 * it of string type
			 */
			ArrayList<String> obj = new ArrayList<String>();

			/* This is how elements should be added to the array list */
			obj.add("Ajeet");
			obj.add("Harry");
			obj.add("Chaitanya");
			obj.add("Steve");
			obj.add("Anuj");

			/* Displaying array list elements */
			System.out.println("Currently the array list has following elements:" + obj);

			/* Add element at the given index */
			obj.add(0, "Rahul");
			obj.add(1, "Justin");

			/* Remove elements from array list like this */
			obj.remove("Chaitanya");
			obj.remove("Harry");

			System.out.println("Current array list is:" + obj);

			/* Remove element from the given index */
			obj.remove(1);

			System.out.println("Current array list is:" + obj);
		}
	}
	
	@SuppressWarnings("unused")
	public static class ArrayListMethods {
		public static void main(String args[]) {

			ArrayList<String> obj = new ArrayList<String>();

			obj.add("Ajeet");
			obj.add("Harry");
			obj.add("Chaitanya");
			obj.add("Steve");
			obj.add("Anuj");

			// 1) add( Object o): This method adds an object o to the arraylist.

			obj.add("hello");
			// This statement would add a string hello in the arraylist at last
			// position.

			// 2) add(int index, Object o): It adds the object o to the array
			// list at the given index.

			obj.add(2, "bye");
			// It will add the string bye to the 2nd index (3rd position as the
			// array list starts with index 0) of array list.

			// 3) remove(Object o): Removes the object o from the ArrayList.

			obj.remove("Chaitanya");
			// This statement will remove the string “Chaitanya” from the
			// ArrayList.

			// 4) remove(int index): Removes element from a given index.

			obj.remove(3);
			// It would remove the element of index 3 (4th element of the list –
			// List starts with o).

			// 5) set(int index, Object o): Used for updating an element. It
			// replaces the element present at the specified index with the
			// object o.

			obj.set(2, "Tom");
			// It would replace the 3rd element (index =2 is 3rd element) with
			// the value Tom.

			// 6) int indexOf(Object o): Gives the index of the object o. If the
			// element is not found in the list then this method returns the
			// value -1.

			int pos = obj.indexOf("Tom");
			// This would give the index (position) of the string Tom in the
			// list.

			// 7) Object get(int index): It returns the object of list which is
			// present at the specified index.

			String str = obj.get(2);
			
			/*
			 * Function get would return the string stored at 3rd position
			 * (index 2) and would be assigned to the string “str”. We have
			 * stored the returned value in string variable because in our
			 * example we have defined the ArrayList is of String type. If you
			 * are having integer array list then the returned value should be
			 * stored in an integer variable.
			 */

			// 8) int size(): It gives the size of the ArrayList – Number of
			// elements of the list.

			
			int numberofitems = obj.size();
			/*
			 * 9) boolean contains(Object o): It checks whether the given object
			 * o is present in the array list if its there then it returns true
			 * else it returns false.
			 */

			obj.contains("Steve");
			
			/*
			 * It would return true if the string “Steve” is present in the list
			 * else we would get false.
			 */

			/*
			 * 10) clear(): It is used for removing all the elements of the
			 * array list in one go. The below code will remove all the elements
			 * of ArrayList whose object is obj.
			 */

			obj.clear();

		}
	}
}