package Java.Programs;

import java.util.Scanner;

public class Average {

	// Example 1: Program to find the average of numbers using array
	public static class AverageOfStaticArray {
		public static void main(String[] args) {
			double[] arr = { 19, 12.89, 16.5, 200, 13.7 };
			double total = 0;

			for (int i = 0; i < arr.length; i++) {
				total = total + arr[i];
			}

			/*
			 * arr.length returns the number of elements present in the array
			 */
			double average = total / arr.length;

			/*
			 * This is used for displaying the formatted output if you give %.4f
			 * then the output would have 4 digits after decimal point.
			 */
			System.out.format("The average is: %.3f", average);
		}
	}

	public static class AverageOfDynamicArray {
		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.print("Enter n value : ");
			int n = scan.nextInt();

			// Declaring array of n elements, the value of n is provided by the user

			double[] arr = new double[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Enter array value : ");
				arr[i] = scan.nextDouble();
			}
			scan.close();
			double total = 0;
			for (int i = 0; i < arr.length; i++) {
				total = total + arr[i];
			}
			System.out.format("Average is : %.3f" , total / n);
		}

	}

}
