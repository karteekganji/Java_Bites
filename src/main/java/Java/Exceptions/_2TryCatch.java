package Java.Exceptions;

public class _2TryCatch {
	
	
	/*
	 * Try block :
	 * 
	 * The try block contains set of statements where an exception can
	 * occur. A try block is always followed by a catch block, which handles the
	 * exception that occurs in associated try block. A try block must be
	 * followed by catch blocks or finally block or both.
	 * 
	 * Catch block :
	 *  
	 * A catch block is where you handle the exceptions, this block
	 * must follow the try block. A single try block can have several catch
	 * blocks associated with it. You can catch different exceptions in
	 * different catch blocks. When an exception occurs in try block, the
	 * corresponding catch block that handles that particular exception
	 * executes. For example if an arithmetic exception occurs in try block then
	 * the statements enclosed in catch block for arithmetic exception executes.
	 */
	
	
	/*Syntax of try catch in java :
		
	try
	{
	     //statements that may cause an exception
	}
	catch (exception(type) e(object))‏
	{
	     //error handling code
	}*/
		
	
	static class TryCatchBlock {
		public static void main(String args[]) {
			int num1, num2;
			try {
				/*
				 * We suspect that this block of statement can throw exception
				 * so we handled it by placing these statements inside try and
				 * handled the exception in catch block
				 */
				num1 = 0;
				num2 = 62 / num1;
				System.out.println(num2);
				System.out.println("Hey I'm at the end of try block");
			} catch (ArithmeticException e) {
				/*
				 * This block will only execute if any Arithmetic exception
				 * occurs in try block
				 */
				System.out.println("You should not divide a number by zero");
			} catch (Exception e) {
				/*
				 * This is a generic Exception handler which means it can handle
				 * all the exceptions. This will execute if the exception is not
				 * handled by previous catch blocks.
				 */
				System.out.println("Exception occurred");
			}
			System.out.println("I'm out of try-catch block in Java.");
		}
	}
	
	
	// Example of Multiple catch blocks :

	static class MultipleCatchBlocks {
		public static void main(String args[]) {
			try {
				int a[] = new int[7];
				a[4] = 30 / 0;
				System.out.println("First print statement in try block");
			} catch (ArithmeticException e) {
				System.out.println("Warning: ArithmeticException");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Warning: ArrayIndexOutOfBoundsException");
			} catch (Exception e) {
				System.out.println("Warning: Some Other exception");
			}
			System.out.println("Out of try-catch block...");
		}
	}

	
	
	public static void main(String[] args) {
		
		

	}

}
