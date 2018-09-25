package Java.Programs;

import java.util.Scanner;

public class Sum {
	public static class SumOfNUsingFor {
		public static void main(String[] args) {
			System.out.println("Enter the value of n:");
			// Scanner is used for reading user input
			Scanner scan = new Scanner(System.in);
			// nextInt() method reads integer entered by user
			int num = scan.nextInt();
			// closing scanner after use
			scan.close();
			int sum = 0;
			for (int i = 0; i <= num; i++) {
				sum = sum + i;
			}
			System.out.println("Sum of numbers upto " + num + "is : " + sum);
		}
	}

	public static class SumOfNUsingWhile {
		public static void main(String[] args) {
			System.out.println("Enter the value of n:");
			// Scanner is used for reading user input
			Scanner scan = new Scanner(System.in);
			// nextInt() method reads integer entered by user
			int num = scan.nextInt();
			// closing scanner after use
			scan.close();
			int sum = 0;
			int i = 0;
			while (i <= num) {
				sum = sum + i;
				i++;
			}
			System.out.println("Sum of numbers upto " + num + "is : " + sum);
		}
	}
	
//	Finding Sum of numbers between given range
	
	public static class SumOfRange {
		public static void main(String[] args) {
			
			// Scanner is used for reading user input
			Scanner scan = new Scanner(System.in);
			// nextInt() method reads integer entered by user
			System.out.println("Enter the From value : ");
			int from = scan.nextInt();
			// closing scanner after use
			System.out.println("Enter the To value : ");
			int to = scan.nextInt();
			// closing scanner after use
			scan.close();
			int sum = 0;
			for (int i = from; i <= to; i++) {
				sum = sum+i;
			}
			
			System.out.println("Sum of numbers From " + from+" To "+to+" is : "+sum);
		}}
}
