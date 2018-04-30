package Java.Practice;

import java.util.Scanner;

public class Switch_Default {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks ==>> ");
		int grade = scan.nextInt();
		System.out.println("Your grade is : " + grade);
		switch (grade) {
		case 34:
			System.out.println("FAIL!!");
			break;
		case 35:
			System.out.println("Just PASS!!");
			break;
		case 50:
			System.out.println("Well done!!");
			break;
		case 60:
			System.out.println("More than Average !!");
			break;
		case 75:
			System.out.println("Distinction");
			break;
		default:
			System.out.println("You Lost !!");
		}
		
	}

}
