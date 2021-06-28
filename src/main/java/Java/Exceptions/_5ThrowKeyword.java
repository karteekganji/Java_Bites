package Java.Exceptions;

public class _5ThrowKeyword {

	/*
	 * We can define our own set of conditions or rules and throw an exception
	 * explicitly using throw keyword. For example, we can throw
	 * ArithmeticException when we divide number by 5, or any other numbers,
	 * what we need to do is just set the condition and throw any exception
	 * using throw keyword. Throw keyword can also be used for throwing custom
	 * exceptions, I have covered that in a separate tutorial, see Custom
	 * Exceptions in Java.
	 */

	/*
	 * In this program we are checking the Student age if the student age<12 and
	 * weight <40 then our program should return that the student is not
	 * eligible for registration.
	 */
	
	public static class ThrowExample {
		static void checkEligibilty(int stuage, int stuweight) {
			if (stuage < 12 && stuweight < 40) {
				throw new ArithmeticException("Student is not eligible for registration");
			} else {
				System.out.println("Student Entry is Valid!!");
			}
		}

		public static void main(String args[]) {
			System.out.println("Welcome to the Registration process!!");
			checkEligibilty(10, 39);
			System.out.println("Have a nice day..");
		}
	}

	// Example of User defined exception in Java

	/*
	 * This is my Exception class, I have named it MyException you can give any
	 * name, just remember that it should extend Exception class
	 */
	@SuppressWarnings("serial")
	public static class UserDefinedException extends Exception {
		String str1;

		/*
		 * Constructor of custom exception class here I am copying the message
		 * that we are passing while throwing the exception to a string and then
		 * displaying that string along with the message.
		 */
		UserDefinedException(String str2) {
			str1 = str2;
		}

		public String toString() {
			return ("UserDefinedException Occurred: " + str1);
		}
	}

	public static class Example1 {
		public static void main(String args[]) {
			try {
				System.out.println("Starting of try block");
				// I'm throwing the custom exception using throw
				throw new UserDefinedException("This is My error Message");
			} catch (UserDefinedException exp) {
				System.out.println("Catch Block");
				System.out.println(exp);
			}
		}
	}
	
	/**
	 * @Note: 
	 * 1. User-defined exception must extend Exception class. 
	 * 2. The exception is thrown using throw keyword.
	 */
	
	/*
	 * Another Example of Custom Exception ::
	 * 
	 * In this example we are throwing an
	 * exception from a method. In this case we should use throws clause in the
	 * method signature otherwise you will get compilation error saying that
	 * “unhandled exception in method”. To understand how throws clause works,
	 * refer this guide: throws keyword in java.
	 */
	
	@SuppressWarnings("serial")
	public static class InvalidProductException extends Exception {
		public InvalidProductException(String s) {
			// Call constructor of parent Exception
			super(s);
		}
	}

	public static class Example2 {
		void productCheck(int weight) throws InvalidProductException {
			if (weight < 100) {
				throw new InvalidProductException("Product Invalid");
			}
		}

		public static void main(String args[]) {
			Example2 obj = new Example2();
			try {
				obj.productCheck(60);
			} catch (InvalidProductException ex) {
				System.out.println("Caught the exception");
				System.out.println(ex.getMessage());
			}
		}
	}
}
