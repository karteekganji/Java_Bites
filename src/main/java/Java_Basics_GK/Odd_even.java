//Checking a number is ODD or EVEN
package Java_Basics_GK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		
		/*Scanner obj=new Scanner(System.in);
		int a;
		System.out.println("Enter a number: ");
		a=obj.nextInt();*/
		
		int count = 50;
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();
		for (int i = 1; i <= count; i++) {
			if (i%2 == 0) {
				evenNumbers.add(i);
				
				}else{
					oddNumbers.add(i);
				}
		}
		System.out.println("Even numbers between 1 to "+count+"are >> "+evenNumbers);
		System.out.println("Odd numbers between 1 to "+count+"are >> "+oddNumbers);
	}

}
