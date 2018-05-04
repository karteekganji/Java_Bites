package Java.Exceptions;

public class _7ThrowsVsThrow {

	/*
	 * Throw vs Throws in java ::
	 * 
	 * 1. Throws clause is used to declare an exception,
	 * which means it works similar to the try-catch block. On the other hand
	 * throw keyword is used to throw an exception explicitly.
	 * 
	 * 2. If we see syntax wise than throw is followed by an instance of
	 * Exception class and throws is followed by exception class names.
	 */	
	
	/*Syntaxes;
	
	 THROW;  throw new ArithmeticException("Arithmetic Exception");
	 THROWS; throws ArithmeticException;
	 
	 */
	
	// Throw Example :
	
	public static class ThrowExample {
		void checkAge(int age) {
			if (age < 18)
				throw new ArithmeticException("Not Eligible for voting");
			else
				System.out.println("Eligible for voting");
		}

		public static void main(String args[]) {
			ThrowExample obj = new ThrowExample();
			obj.checkAge(13);
			System.out.println("End Of Program");
		}
	}

	// Throws Example :

	public static class ThrowsExample {
		int division(int a, int b) throws ArithmeticException {
			int t = a / b;
			return t;
		}

		public static void main(String args[]) {
			ThrowsExample obj = new ThrowsExample();
			try {
				System.out.println(obj.division(15, 0));
			} catch (ArithmeticException e) {
				System.out.println("You shouldn't divide number by zero");
			}
		}
	}

	
}
