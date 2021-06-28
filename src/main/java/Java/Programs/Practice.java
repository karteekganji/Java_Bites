package Java.Programs;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
//		LinearSearch();
		int nums[] = {1, 2, 3, 4,5,8,9};

		int newArr[] = new int[3];
		  int mid = (nums.length-1)/2;
		  System.out.println(nums.length-1);
		  System.out.println(mid);
		  newArr[0] = nums[mid-1];
		  newArr[1] = nums[mid];
		  newArr[2] = nums[mid+1];

	}

	public static void LinearSearch() {
		// Searching a given number in array, result is index of element
		int[] intArray = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };
		int targetNum = 2, i;
		boolean result = false;
		for (i = 0; i < intArray.length; i++) {
			result = (intArray[i] == targetNum) ? true : false;
			if (result) {
				break;
			}
		}
		String str = result ? "Given number is found in the array at index position: " + i
				: "Given number is not found in the array";
		System.out.println(str);

	}

	public static void Operation(int a, int b) {
		int count = 0;
		if (a > 0 && b > 0) {
			for (int i = a; i <= b; i++) {
				for (int j = 1; j < b; j++) {
					if ((j * j) == i) {
						count++;
						System.out.print(j + "*" + j + "=" + i);
						System.out.print(" | ");
					}
				}
			}
			System.out.println();
			System.out.println("Count is : " + count);
		} else {
			System.err.println("A & B Value should be positive");
		}
	}

	public static class StaticKeyword {

		static int x;
		static int y;

		public void value() {
			x = x + 1;
			y = y + 1;
		}

		public void show() {
			System.out.println("X >>> " + x);
			System.out.println("Y >>> " + y);
		}

	}

	// 0,1,1,2,3,5,8
	public static void fibonacci() {

		int n = 6;
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}

	public static void Pyramid() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void NumberSeparator() {
		int arr[] = { 1, -3, 5, -6, -4, 7, 8 };
		Arrays.sort(arr);

	}

	public static void swapping() {
		int a = 10;
		int b = 6;

		a = a + b; // 16
		b = a - b; // 16-6 = 10
		a = a - b; // 16-10 = 6
		System.out.println(a + " " + b);

	}

	public static void ReverseString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = scanner.nextLine();
		System.out.println(input.length());
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
	}

	public static boolean ReverseStringRecursion(String string) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = scanner.nextLine();
		if (string.length() == 0 || string.length() == 1)
			return true;
		else {

		}
		return false;
	}

	public static void Duplicates() {
		int[] crr_array = { 1, 3, 5, 2, 1, 3, 4, 6, 3, 5 };

		// The solution itself
		HashMap<Integer, Integer> repetitions = new HashMap<Integer, Integer>();

		for (int i = 0; i < crr_array.length; ++i) {
			int item = crr_array[i];

			if (repetitions.containsKey(item))
				repetitions.put(item, repetitions.get(item) + 1);
			else
				repetitions.put(item, 1);
		}

		// Now let's print the repetitions out
		StringBuilder sb = new StringBuilder();

		int overAllCount = 0;

		for (Map.Entry<Integer, Integer> e : repetitions.entrySet()) {
			if (e.getValue() > 1) {
				overAllCount += 1;

				sb.append("\n");
				sb.append(e.getKey());
				sb.append(": ");
				sb.append(e.getValue());
				sb.append(" times");
			}
		}

		if (overAllCount > 0) {
			sb.insert(0, " repeated numbers:");
			sb.insert(0, overAllCount);
			sb.insert(0, "There are ");
		}

		System.out.print(sb.toString());

	}

	public static void AddingTwoBigIntegers() {
		String str1 = "12445454545454545465656565654545454590094344545";
		String str2 = "1981115454546566566565656545454545499900004545454334434";
		BigInteger a = new BigInteger(str1);
		BigInteger b = new BigInteger(str2);

		System.out.println(a.add(b));

	}

	public static void recursion() {
		// Duplicates();
	}

}
