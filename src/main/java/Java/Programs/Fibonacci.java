package Java.Programs;

public class Fibonacci {
		
	/*
	 * The Fibonacci sequence is a series of numbers where a number is the sum
	 * of previous two numbers. Starting with 0 and 1, the sequence goes
	 * 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on
	 */	
//	Example 1: Program to print fibonacci series using for loop
	
	public static class FibonacciWithFor {

	    public static void main(String[] args) {

	        int count = 7, num1 = 0, num2 = 1;
	        System.out.print("Fibonacci Series of "+count+" numbers:");

	        for (int i = 1; i <= count; ++i)
	        {
	            System.out.print(num1+" ");

	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
	            int sumOfPrevTwo = num1 + num2;
	            num1 = num2;
	            num2 = sumOfPrevTwo;
	        }
	    }
	}
	
//	Example 2: Displaying Fibonacci Sequence using while loop
	
	public static class FibonacciWithWhile {

		public static void main(String[] args) {

			int count = 7, num1 = 0, num2 = 1;
			System.out.print("Fibonacci Series of " + count + " numbers:");

			int i = 1;
			while (i <= count) {
				System.out.print(num1 + " ");
				int sumOfPrevTwo = num1 + num2;
				num1 = num2;
				num2 = sumOfPrevTwo;
				i++;
			}
		}
	}
}
