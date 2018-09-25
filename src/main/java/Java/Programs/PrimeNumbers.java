package Java.Programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static class PrimeNumberChecking {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int num = scan.nextInt();
			scan.close();
			int count = 0;
			if (num > 1) {
				for (int i = 1; i < num; i++) {
					if (num % i == 0) {
						count++;
					}
				}
				if (num == 2 || count <= 1) {
					System.err.println("Is a prime");
				} else {
					System.out.println("Not a prime");
				}
			} else {
				System.err.println("Prime numbers starts from 2");
			}
		}
	}
	
	public static class PrimeNumberCheckingWithWhileLoop {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int num = scan.nextInt();
			scan.close();
			int count = 0;
			int i = 1;
			if (num > 1) {
				while (i < num) {
					if (num % i == 0) {
						count++;
					}
					i++;
				}
				if (num == 2 || count <= 1) {
					System.err.println("Is a prime");
				} else {
					System.out.println("Not a prime");
				}
			} else {
				System.err.println("Prime numbers starts from 2");
			}
		}
	}
	
	public static class FirstNPrimeNumbers {
		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a range : ");
			int range = scan.nextInt();
			scan.close();
			System.out.println(2);
			int count = 0;
			int total = 1;
			int i;
			for (i = 3; total != range; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count < 1) {
					System.out.println(i);
					total++;
				}
				if (count != 0) {
					count = 0;
				}
			}

		}
	}

	public static class PrimeNumbersFromTo {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter From Value : ");
			int from = scan.nextInt();
			System.out.println("Enter To Value : ");
			int to = scan.nextInt();
			scan.close();
			int count = 0;
			for (int i = from; i < to;i++) {
				for (int j = 1; j < i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count < 2 && i != 1) {
					System.out.println(i);
				}
				if (count != 0) {
					count = 0;
				}
			}
		}
	}
}