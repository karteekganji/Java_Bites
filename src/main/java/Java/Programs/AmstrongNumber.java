package Java.Programs;

import java.util.Scanner;

public class AmstrongNumber {
	
	/* xy..z = xn + yn+.....+ zn
	 * where n denotes the number of digits in the number
	 * 370 = 3^3 + 7^3 + o^3
	         = 27 + 343 + 0
	         = 370 */

	// Example 2: Program to check whether the input number is Armstrong or not

	public static class JavaExample {

		public static void main(String[] args) {

			int num, number, temp, total = 0;
			System.out.println("Enter 3 Digit Number");
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
			scanner.close();
			number = num;

			for (;number != 0; number /= 10) {
				temp = number % 10;
				total = total + temp * temp * temp;
			}

			if (total == num)
				System.out.println(num + " is an Armstrong number");
			else
				System.out.println(num + " is not an Armstrong number");
		}
	}
	
	
	public static void ArmstrongExample() {
		int c = 0, a, temp;
		int n = 153;// It is the number to check armstrong
		temp = n;
		while (n > 0) {
			a = n % 10; //reminder 153%10 - 3
			n = n / 10; // 153/10 - 15
			c = c + (a * a * a); // 0+3*3*3
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}
	
	public static void ArmstrongNumbers1To1000() {
		int num, temp, a, b = 0;
		for (int i = 1; i < 1000; i++) {
			temp = i;
			while (i>0) {
				a = i%10;
				i = i/10;
				b = b+(a*a*a);
			}
			i=temp;
			if (b==temp)
				System.out.println(temp);
			else
				b=0;
		}
	}
	
	public static void main(String[] args) {
		ArmstrongExample();
		
		System.out.println(153%10);
//		System.out.println(15/10);
		
		
		
		
		
	}
}
