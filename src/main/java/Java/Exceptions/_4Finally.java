package Java.Exceptions;

public class _4Finally {

	/**  @Java_Finally_Block :
	 * 
	 * A finally block contains all the crucial statements that must be executed
	 * whether exception occurs or not. The statements present in this block
	 * will always execute regardless of whether exception occurs in try block
	 * or not such as closing a connection, stream etc.
	 */

	public static class FinallyBlockExample1 {
		public static void main(String args[]) {
			try {
				int num = 121 / 0;
				System.out.println(num);
			} catch (ArithmeticException e) {
				System.out.println("Number should not be divided by zero");
			}
			/*
			 * Finally block will always execute even if there is no exception
			 * in try block
			 */
			finally {
				System.out.println("This is finally block");
			}
			System.out.println("Out of try-catch-finally");
		}
	}
	
	// Example of finally block and return statement :

	public static class FinallyBlockWithReturn {
		public static void main(String args[]) {
			System.out.println(myMethod());
		}

		public static int myMethod() {
			try {
				return 112;
			} finally {
				System.out.println("This is Finally block");
				System.out.println("Finally block ran even after return statement");
			}
		}
	}
	
	/*
	 * Example 1: The following example demonstrate the working of finally 
	 * block when no exception occurs in try block
	 */
	
	public static class Example1 {
		public static void main(String args[]) {
			try {
				System.out.println("First statement of try block");
				int num = 45 / 3;
				System.out.println(num);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException");
			} finally {
				System.out.println("finally block");
			}
			System.out.println("Out of try-catch-finally block");
		}
	}

	/*
	 * Example 2: This example shows the working of finally block when an
	 * exception occurs in try block but is not handled in the catch block:
	 */
	
	public static class Example2 {
		public static void main(String args[]) {
			try {
				System.out.println("First statement of try block");
				int num = 45 / 0;
				System.out.println(num);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException");
			} finally {
				System.out.println("finally block");
			}
			System.out.println("Out of try-catch-finally block");
		}
	}
	
	/*Output:

	First statement of try block
	finally block
	Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Java.Exceptions._Finally$Example2.main(_Finally.java:78)
	
	As you can see that the system generated exception message is shown but before that the finally block successfully executed.*/

	/*
	 * Example 3: When exception occurs in try block and handled properly in
	 * catch block
	 */

	public static class Example3 {
		public static void main(String args[]) {
			try {
				System.out.println("First statement of try block");
				int num = 45 / 0;
				System.out.println(num);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException");
			} finally {
				System.out.println("finally block");
			}
			System.out.println("Out of try-catch-finally block");
		}
	}

}
