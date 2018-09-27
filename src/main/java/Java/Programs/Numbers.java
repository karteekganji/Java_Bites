package Java.Programs;

import java.util.Scanner;

public class Numbers {

	public static class FindingMaxNumber {
		public static void main(String[] arg) {

			int marks[] = { 34, 56, 65, 104, 78, 99, 67, 54 };

			int maxint = marks[0];

			for (int maxint1 : marks) {
				if (maxint1 > maxint) {
					maxint = maxint1;
				}

			}
			System.out.println("Highest number : " + maxint);
		}
	}

	public static class FindingMinNumber {
		public static void main(String[] arg) {

			int marks[] = { 34, 56, 65, 104, 78, 99, 67, 54 };

			int maxint = marks[0];

			for (int maxint1 : marks) {
				if (maxint1 < maxint) {
					maxint = maxint1;
				}

			}
			System.out.println("Lowest number : " + maxint);
		}
	}

	/*
	 * A bitwise XOR operator: A bitwise XOR compares corresponding bits of two
	 * operands and returns 1 if they are equal and 0 if they are not equal.
	 * 
	 * 
	 * num1 = 11; //equal to 00001011 num2 = 22; // equal to 00010110
	 * 
	 * num1 ^ num2 compares corresponding bits of num1 and num2 and generates 1
	 * if they are not equal, else it returns 0. In our example it would return
	 * 29 which is equivalent to 00011101
	 */
	
	// Example: Swapping two numbers using bitwise operator

	public static class SwappingTwoNumbers {
		public static void main(String args[]) {
			int num1, num2;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter first number:");
			num1 = scanner.nextInt();
			System.out.print("Enter second number:");
			num2 = scanner.nextInt();
			/*
			 * To make you understand, lets assume I am going to enter value of
			 * first number as 10 and second as 5. Binary equivalent of 10 is
			 * 1010 and 5 is 0101
			 */

			// num1 becomes 1111 = 15
			num1 = num1 ^ num2;
			// num2 becomes 1010 = 10
			num2 = num1 ^ num2;
			// num1 becomes 0101 = 5
			num1 = num1 ^ num2;
			scanner.close();
			System.out.println("The First number after swapping:" + num1);
			System.out.println("The Second number after swapping:" + num2);
		}
	}
}
