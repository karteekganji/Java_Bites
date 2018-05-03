package Java.Exceptions;

public class _3NestedTryCatch {

	/*
	 * Nested Try Catch Example
	 * 
	 * Here we have deep (two level) nesting which
	 * means we have a try-catch block inside a nested try block. To make you
	 * understand better I have given the names to each try block in comments
	 * like try-block2, try-block3 etc.
	 * 
	 * This is how the structure is: try-block3 is inside try-block2 and
	 * try-block2 is inside main try-block, you can say that the main try-block
	 * is a grand parent of the try-block3. Refer the explanation which is given
	 * at the end of this code.
	 */
	
	public static class NestedTryCatchExample1 {
		public static void main(String args[]) {
			// main try-block
			try {
				// try-block2
				try {
					// try-block3
					try {
						int arr[] = { 1, 2, 3, 4 };
						/*
						 * I'm trying to display the value of an element which
						 * doesn't exist. The code should throw an exception
						 */
						System.out.println(arr[10]);
					} catch (ArithmeticException e) {
						System.out.print("Arithmetic Exception");
						System.out.println(" handled in try-block3");
					}
				} catch (ArithmeticException e) {
					System.out.print("Arithmetic Exception");
					System.out.println(" handled in try-block2");
				}
			} catch (ArithmeticException e3) {
				System.out.print("Arithmetic Exception");
				System.out.println(" handled in main try-block");
			} catch (ArrayIndexOutOfBoundsException e4) {
				System.out.print("ArrayIndexOutOfBoundsException");
				System.out.println(" handled in main try-block");
			} catch (Exception e5) {
				System.out.print("Exception");
				System.out.println(" handled in main try-block");
			}
		}
	}
	
	/*
	 * As you can see that the ArrayIndexOutOfBoundsException occurred in the
	 * grand child try-block3. Since try-block3 is not handling this exception,
	 * the control then gets transferred to the parent try-block2 and looked for
	 * the catch handlers in try-block2. Since the try-block2 is also not
	 * handling that exception, the control gets transferred to the main (grand
	 * parent) try-block where it found the appropriate catch block for
	 * exception. This is how the the nesting structure works.
	 */	
	
	// Example 2: Nested try block : 
	
	public static class NestedTryCatchExample2 {
		public static void main(String args[]) {
			// Parent try block
			try {
				// Child try block1
				try {
					System.out.println("Inside block1");
					int b = 45 / 0;
					System.out.println(b);
				} catch (ArithmeticException e1) {
					System.out.println("Exception: e1");
				}
				// Child try block2
				try {
					System.out.println("Inside block2");
					int b = 45 / 0;
					System.out.println(b);
				} catch (ArrayIndexOutOfBoundsException e2) {
					System.out.println("Exception: e2");
				}
				System.out.println("Just other statement");
			} catch (ArithmeticException e3) {
				System.out.println("Arithmetic Exception");
				System.out.println("Inside parent try catch block");
			} catch (ArrayIndexOutOfBoundsException e4) {
				System.out.println("ArrayIndexOutOfBoundsException");
				System.out.println("Inside parent try catch block");
			} catch (Exception e5) {
				System.out.println("Exception");
				System.out.println("Inside parent try catch block");
			}
			System.out.println("Next statement..");
		}
	}
	/**
	 * @NOTE :
	 * 
	 *       The important point to note here is that whenever the child catch
	 *       blocks are not handling any exception, the jumps to the parent
	 *       catch blocks, if the exception is not handled there as well then
	 *       the program will terminate abruptly showing system generated
	 *       message.
	 */
}
