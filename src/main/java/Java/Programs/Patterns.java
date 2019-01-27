package Java.Programs;

public class Patterns {

	public static void main(String[] args) {

		/*
		 * Practice object = new Practice(); 
		 * Practice object2 = new Practice();
		 * object.value(); object.show(); 
		 * System.out.println("------------");
		 * object2.value(); object2.show();
		 */
//		StarsAscending(5);
//		StarsDescending(5);
//		StarsAscendingReverse(5);
//		StarsDescendingReverse(5);
//		Pyramid(5);
//		Triangle(5);
//		ReverseTriangle(5);
//		TriangleAndReverseTriangle(5);
//		VerticalRectangle(7);

	}
	
	/*
	 * 
	 **
	 ***
	 ****
	 */
	public static void StarsAscending(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	 ****
	 ***
	 **
	 *
	 */
	public static void StarsDescending(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
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
	public static void StarsAscendingReverse(int n) {
		int i;
		for (i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	/*
 	 **** 
 	  ***
       **
        *
  	*/
	public static void StarsDescendingReverse(int n) {
		int i;
		for (i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < n; k++) {
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
   	*/
	public static void Pyramid(int n) {
		int i;
		for (i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
   /* 
    *
   ***
  *****
 *******
    */
	public static void Triangle(int n) {
		int i;
		for (i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 *******
	  *****
	   ***
	    *
	 */
	public static void ReverseTriangle(int n) {
		int i;
		for (i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = (2*n)-1; k > 2*i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	 /* 
    *
   ***
  *****
 *******
  *****
   ***
    *
    */
	
	public static void TriangleAndReverseTriangle(int n) {
	
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = (2*n)-1; k > 2*i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

 /* *******
	*     *
	*     *
	*     *
	*     *
	*     *
	*******
  */
	
	public static void VerticalRectangle(int n) {

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
			}
			else {
				for (int j = 0; j < n; j++) {
					if (j==0 || j==n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
	
}
