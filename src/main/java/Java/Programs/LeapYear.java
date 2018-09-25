package Java.Programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the Year : ");
		// Scanner is used for reading user input
		Scanner scan = new Scanner(System.in);
		// nextInt() method reads integer entered by user
		int year = scan.nextInt();
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.err.println(year + " Is a Leap Year");
			} else {
				System.out.println(year + " Is not a Leap Year");
			}
		} else if (year % 4 == 0) {
			System.out.println(year + " Is a Leap Year");
		} else {
			System.out.println(year + " Is not a Leap Year");
		}
	}

}
