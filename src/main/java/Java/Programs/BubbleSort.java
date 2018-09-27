package Java.Programs;

import java.util.Scanner;

@SuppressWarnings("resource")
public class BubbleSort {

	// Bubble sort program for sorting in ascending Order

	public static class BubbleSortAscendingOrder {
		public static void main(String[] args) {
			int num, i, j, temp;
			Scanner input = new Scanner(System.in);

			System.out.println("Enter the number of integers to sort:");
			num = input.nextInt();

			int array[] = new int[num];

			System.out.println("Enter " + num + " integers: ");

			for (i = 0; i < num; i++)
				array[i] = input.nextInt();

			for (i = 0; i < (num - 1); i++) {
				for (j = 0; j < num - i - 1; j++) {
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}

			System.out.println("Sorted list of integers:");

			for (i = 0; i < num; i++)
				System.out.println(array[i]);
		}
	}

	// Bubble sort program for sorting in descending Order

	public static class BubbleSortDescendingOrder {
		public static void main(String[] args) {
			int num, i, j, temp;
			Scanner input = new Scanner(System.in);

			System.out.println("Enter the number of integers to sort:");
			num = input.nextInt();

			int array[] = new int[num];

			System.out.println("Enter " + num + " integers: ");

			for (i = 0; i < num; i++)
				array[i] = input.nextInt();

			for (i = 0; i < (num - 1); i++) {
				for (j = 0; j < num - i - 1; j++) {
					if (array[j] < array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}

			System.out.println("Sorted list of integers:");

			for (i = 0; i < num; i++)
				System.out.println(array[i]);
		}
	}
}
