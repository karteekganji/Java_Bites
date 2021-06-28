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
	
	// A Java program to demonstrate working of recursion
	
	public static class ReverseStringUsingRecursion {

		public static void main(String[] args) {
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
	
	public static void main(String[] args) {
		String string = "balakrishna";
//		int num = 5;
		/*for (int i = string.length()-1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println();
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
		}
		for (int i = num; i >=1; i--) {
			System.out.print(i);
		}*/
	   
		int num = 5;
		
		/*for(int i = 1; i <= num; i++) {
            if (i==4) {
				System.out.println("Hi Bala");
			}else if(i == 5) {
				System.out.println("Hello Bala");
			}else {
				System.out.println(i);
			}
		}*/
		
		
	}
}
	
	
