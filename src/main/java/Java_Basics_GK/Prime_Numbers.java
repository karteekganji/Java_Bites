package Java_Basics_GK;

import java.util.Scanner;

public class Prime_Numbers {

	public static void CheckPrime1() {

		int num = 6;
		int count = 0;
		String result = "";
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count = count + 1;
			}
			if (count > 2) {
				result = (num + " not a prime");
				break;
			} else {
				result = (num + " is a prime");

			}

		}
		System.out.println(result);
	}

	public static void CheckPrime2() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number >> ");
		int num;
		num = scan.nextInt();
		int value=0,flag=0;
		value = num/2;
		for (int i = 2; i <= value; i++) {
			if (num%i==0) {
				System.out.println("Number is not prime");
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println("Number is prime");
		}
	
	}

	public static void main(String[] args) {
		CheckPrime2();
		
	}

}
