package Java.Miscellaneous;

import java.util.Arrays;
import java.util.Collections;

public class SortingOperations {

//	 Sort an Array in Descending (Reverse) Order
	
	public static void main(String[] args) {
		
		 // int Array
	    Integer[] intArray = new Integer[] {
	        new Integer(15),
	        new Integer(9),
	        new Integer(16),
	        new Integer(2),
	        new Integer(30)
	    };

	    // Sorting int Array in descending order
	    Arrays.sort(intArray, Collections.reverseOrder());
	 
	    // Displaying elements of int Array
	    System.out.println("Int Array Elements in reverse order:");
	    for (int i = 0; i < intArray.length; i++)
	       System.out.println(intArray[i]);
	 
	    // String Array
	    String[] stringArray = 
	       new String[] { "FF", "PP", "AA", "OO", "DD" };

	    // Sorting String Array in descending order
	    Arrays.sort(stringArray, Collections.reverseOrder());

	    // Displaying elements of String Array
	    System.out.println("String Array Elements in reverse order:");
	    for (int i = 0; i < stringArray.length; i++)
	       System.out.println(stringArray[i]);
	  }

}
