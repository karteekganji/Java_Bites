package Java.Programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the Year : ");
		// Scanner is used for reading user input
		Scanner scan = new Scanner(System.in);
		// nextInt() method reads integer entered by user
		int year = scan.nextInt();
		scan.close();
		boolean isLeap;
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				isLeap = true;
			} else {
				isLeap = false;
			}
		} else if (year % 4 == 0) {
			isLeap = true;
		} else {
			isLeap = false;
		}
		String result = (isLeap == true ? year + " Is a Leap Year" : year + " Is not a Leap Year");
		System.out.println(result);
	}

}
