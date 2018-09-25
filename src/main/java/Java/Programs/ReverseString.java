package Java.Programs;

public class ReverseString {
	
	public static String str = "Welcome to Beginnersbook";
	
	public static class ReverseStringWithForWhile {
		public static void main(String[] args) {

			
			int init = str.length() - 1;
			for (int i = init; 0 <= i; i--) {
				System.out.print(str.charAt(i));
			}

			System.out.println();
			while (0 <= init) {
				System.out.print(str.charAt(init));
				init--;
			}
			System.out.println();
		}
	}
	
	public static class ReverseStringUsingRecursion {

		public static void main(String[] args) {
			String reversed = reverseString(str);
			System.out.println("The reversed string is: " + reversed);
		}

		public static String reverseString(String str) {
			if (str.isEmpty())
				return str;
			// Calling Function Recursively
			System.out.println(reverseString(str.substring(1)) + str.charAt(0));
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}
	
	// A Java program to demonstrate working of recursion
	
	public static class ReverseStringUsingRecursion2 {
		static void printFun(int test) {
			if (test < 1)
				return;
			else {
				System.out.printf("%d ", test);
				printFun(test - 1); // statement 2
				System.out.printf("%d ", test);
				return;
			}
		}

		public static void main(String[] args) {
			int test = 3;
			printFun(test);
		}
	}
	
	
	
	
}
