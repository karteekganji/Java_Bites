package Dummy;

public class Practice {

	static int x;
	static int y;

	public void value() {
		x = x + 1;
		y = y + 1;
	}

	public void show() {
		System.out.println("X >>> " + x);
		System.out.println("Y >>> " + y);
	}

	public static void main(String[] args) {

		/*
		 * Practice object = new Practice(); 
		 * Practice object2 = new Practice();
		 * object.value(); object.show(); 
		 * System.out.println("------------");
		 * object2.value(); object2.show();
		 */
		// printingStarsDescending();
//		printingStarsAscending();
		printingStarsAscendingReverse();
	}

	/*
	 ****
	 ***
	 **
	 *
	 */
	public static void printingStarsDescending() {
		int limit = 5;
		for (int i = limit; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
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
	public static void printingStarsAscending() {
		int limit = 5;
		for (int i = 1; i <= limit; i++) {
			for (int j = i; j >= 1; j--) {
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
	public static void printingStarsAscendingReverse() {
		int value = 1;
		int limit = 4;
		for (int i = limit; i >= value; i--) {
			System.out.print(".");
			if (i == value) {
				for (int j = value; j <= value ; j++) {
					System.out.print("*");
				}
				value ++;
				System.out.println();
			}
			
		}
	}

}
