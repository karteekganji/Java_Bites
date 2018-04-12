package Java_Basics;

public class _7Loops {

	/*
	 * Syntax of for loop:
	 * 
	 * for(initialization; condition ; increment/decrement) {
	 * statement(s); 
	 * }
	 */

	public static void ForLoopExample() {
		for (int i = 10; i > 0; i--) {
			System.out.println("The value of i is: " + i);
		}

	}

	// For loop example to iterate an array:
	public static void ForLoop_WithArray() {
		int arr[] = { 2, 11, 45, 9 };
		// i starts with 0 as array index starts with 0 too
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	/*
	 * Enhanced For loop :
	 * 
	 * Enhanced for loop is useful when you want to iterate Array/Collections
	 */
	public static void enhanced_For_Loop() {

		int intArr[] = { 2, 11, 45, 9 }; // Integers
		for (int num : intArr) {
			System.out.println(num);
		}

		String strArr[] = { "hi", "hello", "bye" }; // Strings
		for (String str : strArr) {
			System.out.println(str);
		}

	}
	
/****************************************************************************************************************/
	
	/*
	 * while(condition) { 
	 * statement(s); 
	 * }
	 */
	
	/*
	 * In while loop, condition is evaluated first and if it returns true then
	 * the statements inside while loop execute. When condition returns false,
	 * the control comes out of loop and jumps to the next statement after while
	 * loop.
	 */
	
	public static void while_Loop() {
		
		int i=10;
        while(i>0){
             System.out.println(i);
             i--;
        }
	}	

	public static void while_Loop_With_Array() {
		int arr[] = { 2, 11, 45, 9 };
		// i starts with 0 as array index starts with 0 too
		int j = 0;
		while (j < arr.length) {
			System.out.println(arr[j]);
			j++;
		}
	}

/****************************************************************************************************************/	
	
	/*
	 * Syntax of do-while loop:
	 * 
	 * do {
	 *  statement(s); 
	 *  } while(condition);
	 */
	
	public static void do_While_Loop() {

		int i = 10;
		do {
			System.out.println(i);
			i--;
		} while (i > 1);
	}
		
	public static void do_While_Loop_With_Array() {

		int arr[] = { 2, 11, 45, 9 };
		int i = 0;
		do {
			System.out.println(arr[i]);
			i++;
		} while (i < 4);
	}
		
	
	public static void main(String[] args) {
		
		do_While_Loop_With_Array();

	}

}
