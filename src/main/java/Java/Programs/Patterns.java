package Java.Programs;

import java.util.Iterator;

public class Patterns {

	public static void main(String[] args) {

		/*
		 * Practice object = new Practice(); 
		 * Practice object2 = new Practice();
		 * object.value(); object.show(); 
		 * System.out.println("------------");
		 * object2.value(); object2.show();
		 */
//		printingStarsDescending(5);
//		printingStarsAscending(5);
//		printingStarsAscendingReverse(5);
//		printingStarsTriangle(5);
	}

	/*
	 ****
	 ***
	 **
	 *
	 */
	public static void printingStarsDescending(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	 * 
	 **
	 ***
	 ****
	 */
	public static void printingStarsAscending(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
 	 * 
 	**
   ***
  ****
  	*/
	public static void printingStarsAscendingReverse(int n) {
		int i;
		for (i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	  * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * *
   	*/
	public static void printingStarsTriangle(int n) {
		int i;
		for (i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
}
