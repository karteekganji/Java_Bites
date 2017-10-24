//Checking a number is ODD or EVEN
package Java_Basics_GK;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a;
		System.out.println("Enter a number: ");
		a=obj.nextInt();
		if (a%2 == 0) {
		System.out.println("Even number");
			
		}else{
			System.out.println("Odd number");
		}
	}

}
