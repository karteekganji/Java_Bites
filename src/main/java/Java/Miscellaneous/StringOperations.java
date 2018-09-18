package Java.Miscellaneous;

public class StringOperations {
	
	public static void reverseWordInMyString(String str) {
		/*
		 * The split() method of String class splits a string in several strings
		 * based on the delimiter passed as an argument to it
		 */
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				/*
				 * The charAt() function returns the character at the given
				 * position in a string
				 */
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}

	public static void main(String[] args) {

		// Convert String to int

		String str = "123";
		int num1 = 100;

		// converting the string to an int value
		int num2 = Integer.parseInt(str);
		// Convert Int to String

		String str2 = "-123";
		int num4 = 100;
		int num3 = Integer.valueOf(str2);
		int sum = num1 + num2;
		int sum2 = num4 + num3;
		System.out.println("String to int Result is: " + sum);
		System.out.println("Int to String Result is: " + sum2);

		// String vs StringBuffer

		/**
		 * String is immutable:
		 * 
		 * In first statement an object is created using string literal “Hello
		 * World”, in second statement when we assigned the new string literal
		 * “Hi World!” to str, the object itself didn’t change instead a new
		 * object got created in memory using string literal “Hi World!” and the
		 * reference to it is assigned to str. So basically both the objects
		 * “Hello World” and “Hi World!” exists in memory having different
		 * references(locations).
		 */
		// String is immutable:

		String Hello = "Hello World";
		Hello = "Hi World!";
		System.out.println(Hello);

		// StringBuffer is mutable:

		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
		
		reverseWordInMyString("Welcome to BeginnersBook");
		reverseWordInMyString("This is an easy Java Program");

	}
	
	public static class SplitExample {
		public static void main(String args[]) {
			String str = new String("28/12/2013");
			System.out.println("split(String regex):");
			String array1[] = str.split("/");
			for (String temp : array1) {
				System.out.println(temp);
			}
			System.out.println("split(String regex, int limit) with limit=2:");
			String array2[] = str.split("/", 2);
			for (String temp : array2) {
				System.out.println(temp);
			}
			System.out.println("split(String regex, int limit) with limit=0:");
			String array3[] = str.split("/", 0);
			for (String temp : array3) {
				System.out.println(temp);
			}
			System.out.println("split(String regex, int limit) with limit=-5:");
			String array4[] = str.split("/", -5);
			for (String temp : array4) {
				System.out.println(temp);
			}
		}
	}
	
	public static class ReverseString {

		public static void main(String[] args) {
			String str = "Welcome to Beginnersbook";
			String reversed = reverseString(str);
			System.out.println("The reversed string is: " + reversed);
		}

		public static String reverseString(String str) {
			if (str.isEmpty())
				return str;
			// Calling Function Recursively
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}
	
	

	
}
