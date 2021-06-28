package Java.Exceptions;

public class _9UserDefinedException extends Exception {

	public _9UserDefinedException(String s) {
		super(s);
	}


public static class throwException {
	public static void main(String args[]) {
		try {
			throw new _9UserDefinedException("throw Exception");
		} catch (_9UserDefinedException ex) {
			System.out.println("caught exception");
			System.out.println(ex.getMessage());
		}
	}
}

	static class InvalidAgeException extends Exception {
		InvalidAgeException(String s) {
			super(s);
		}
	}

	static class TestCustomException1 {

		static void validate(int age) throws InvalidAgeException {
			if (age < 18)
				throw new InvalidAgeException("not valid");
			else
				System.out.println("welcome to vote");
		}

		public static void main(String args[]) {
			try {
				validate(13);
			} catch (InvalidAgeException m) {
				System.out.println("Exception occured: " + m);
			}

			System.out.println("rest of the code...");
		}
	}
}