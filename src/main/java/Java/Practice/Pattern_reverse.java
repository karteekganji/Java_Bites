package Java.Practice;

import java.util.Scanner;

public class Pattern_reverse {

	public static void main(String[] args) {

		Scanner ab = new Scanner(System.in);
		System.out.println("Enter row value : ");

		int row = ab.nextInt();

		for (int i = row; i >= 1; i--)

		{
			for (int j = row; j > i; j--) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

}
