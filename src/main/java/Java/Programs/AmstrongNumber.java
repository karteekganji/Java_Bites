package Java.Programs;

import java.util.Scanner;

public class AmstrongNumber {
	
	/* xy..z = xn + yn+.....+ zn
	 * where n denotes the number of digits in the number
	 * 370 = 33 + 73 + o3
	         = 27 + 343 + 0
	         = 370 */

	// Example 2: Program to check whether the input number is Armstrong or not

	public static class JavaExample {

		public static void main(String[] args) {

			int num, number, temp, total = 0;
			System.out.println("Ënter 3 Digit Number");
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
			scanner.close();
			number = num;

			for (; number != 0; number /= 10) {
				temp = number % 10;
				total = total + temp * temp * temp;
			}

			if (total == num)
				System.out.println(num + " is an Armstrong number");
			else
				System.out.println(num + " is not an Armstrong number");
		}
	}
}
