package Java.Programs;

import java.util.Scanner;

public class ReverseNumber {

	// Program 1: Reverse a number using while Loop

	public static class ReverseNumberWhile {
		public static void main(String args[]) {
			int num = 0;
			int reversenum = 0;
			System.out.println("Input your number and press enter: ");
			// This statement will capture the user input
			Scanner in = new Scanner(System.in);
			// Captured input would be stored in number num
			num = in.nextInt();
			// While Loop: Logic to find out the reverse number
			while (num != 0) {
				reversenum = reversenum * 10;
				int per = num % 10;
				reversenum = reversenum + per;
				num = num / 10;
			}

			System.out.println("Reverse of input number is: " + reversenum);
		}
	}

	// Program 2: Reverse a number using for Loop

	public static class ForLoopReverseDemo {
		public static void main(String args[]) {
			int num = 0;
			int reversenum = 0;
			System.out.println("Input your number and press enter: ");
			// This statement will capture the user input
			Scanner in = new Scanner(System.in);
			// Captured input would be stored in number num
			num = in.nextInt();
			/*
			 * for loop: No initialization part as num is already initialized
			 * and no increment/decrement part as logic num = num/10 already
			 * decrements the value of num
			 */
			for (; num != 0;) {
				reversenum = reversenum * 10;
				reversenum = reversenum + num % 10;
				num = num / 10;
			}

			System.out.println("Reverse of specified number is: " + reversenum);
		}
	}

	// Program 3: Reverse a number using recursion

	public static class RecursionReverseDemo {
		// A method for reverse
		public static void reverseMethod(int number) {
			if (number < 10) {
				System.out.println(number);
				return;
			} else {
				System.out.print(number % 10);
				// Method is calling itself: recursion
				reverseMethod(number / 10);
			}
		}

		public static void main(String args[]) {
			int num = 0;
			System.out.println("Input your number and press enter: ");
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
			System.out.print("Reverse of the input number is:");
			reverseMethod(num);
			System.out.println();
		}
	}
}
