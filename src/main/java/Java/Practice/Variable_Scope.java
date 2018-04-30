package Java.Practice;

public class Variable_Scope {
	/* Java Variables Scope */
	public static void main(String[] args) {

		int x; // known to all code within main
		x = 10; // known only to this block
		
		if (x == 10) {
			int y = 20; /* x and y both known here */

			System.out.println(x + "\n" + y);
			x = y * 2;
		}

		/* y = 100; //error! 'y' not known here */

		System.out.println("x is " + x); /* x is still known here */
	}

}
