package Java.Programs;

import java.util.Scanner;

class IsDivisible {
	static void check(String str) {
		long num = Long.parseLong(str);
		long reminder = (num % 11);
		long finalValue = 0;
		if ( reminder == 0){
			finalValue = num;
		}else if (reminder > 0) {
			finalValue = num-reminder;
		}
		System.out.println(finalValue);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year : ");
		String year = scanner.nextLine();
		System.out.println("Enter a month : ");
		String month = scanner.nextLine();
		System.out.println("Enter a day : ");
		String day = scanner.nextLine();
		System.out.println("Enter a 4 digit number : ");
		String RandomNum = scanner.nextLine();
		String str = year + month + day + RandomNum;
		
		check(str);
	}
}
