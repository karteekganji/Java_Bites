package Java_Basics_GK;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter row value : ");
		
		int row=ab.nextInt();
		
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}

}
