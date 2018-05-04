package Java.Exceptions;

public class _8ExceptionsHandling {

	/*
	 * Example 1: Arithmetic exception 
	 * Class: Java.lang.ArithmeticException 
	 * This is a built-in-class present in java.lang package. This exception occurs
	 * when an integer is divided by zero.
	 */
	
	public static class arithmeticException {
		public static void main(String args[]) {
			try {
				int num1 = 30, num2 = 0;
				int output = num1 / num2;
				System.out.println("Result: " + output);
			} catch (ArithmeticException e) {
				System.out.println("You Shouldn't divide a number by zero");
			}
		}
	}

	/*
	 * Example 2: ArrayIndexOutOfBounds Exception 
	 * Class: Java.lang.ArrayIndexOutOfBoundsException 
	 * This exception occurs when you try to access the array index which
	 * does not exist. For example, If array is having only 5 elements and we 
	 * are trying to display 7th element then it would throw this exception.
	 */
	
	public static class arrayIndexOutOfBoundsException {
		public static void main(String args[]) {
			try {
				int a[] = new int[10];
				// Array has only 10 elements
				a[11] = 9;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBounds");
			}
		}
	}

	/*
	 * Example 3: NumberFormat Exception 
	 * Class: Java.lang.NumberFormatException
	 * This exception occurs when a string is parsed to any numeric variable.
	 * For example, the statement int num=Integer.parseInt ("XYZ"); would throw
	 * NumberFormatException because String “XYZ” cannot be parsed to int.
	 */
	
	public static class numberFormatException {
		public static void main(String args[]) {
			try {
				int num = Integer.parseInt("XYZ");
				System.out.println(num);
			} catch (NumberFormatException e) {
				System.out.println("Number format exception occurred");
			}
		}
	}
	
	/*
	 * Example 4: StringIndexOutOfBound Exception 
	 * Class:cJava.lang.StringIndexOutOfBoundsException
	 * 
	 * An object of this class gets created whenever an index is invoked of a
	 * string, which is not in the range. Each character of a string object is
	 * stored in a particular index starting from 0. To get a character present
	 * in a particular index of a string we can use a method charAt(int) of
	 * java.lang.String where int argument is the index.
	 */

	public static class stringIndexOutOfBoundException {
		public static void main(String args[]) {
			try {
				String str = "beginnersbook";
				System.out.println(str.length());
				char c = str.charAt(0);
				c = str.charAt(40);
				System.out.println(c);
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException!!");
			}
		}
	}
	
	/*
	 * Example 5: NullPointer Exception 
	 * Class: Java.lang.NullPointer Exception
	 * An object of this class gets created whenever a member is invoked with a
	 * “null” object.
	 */

	public static class nullPointerException {
		public static void main(String args[]) {
			try {
				String str = null;
				System.out.println(str.length());
			} catch (NullPointerException e) {
				System.out.println("NullPointerException..");
			}
		}
	}
}
