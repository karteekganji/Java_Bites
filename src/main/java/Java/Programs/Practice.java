package Java.Programs;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		System.out.println("Enter from value : ");
		a = scanner.nextInt();
		System.out.println("Enter to value : ");
		b= scanner.nextInt();
		
		Operation(a, b);
	}
	
	public static void Operation(int a, int b) {
		int count = 0;
		if (a > 0 && b > 0) {
		for (int i = a; i <= b; i++) {
			for (int j = 1; j < b; j++) {
				if ((j*j) == i) {
					count++;
					System.out.print(j+"*"+j+"="+i);
					System.out.print(" | ");
				}
			}
		}
		System.out.println();
		System.out.println("Count is : " +count);
		}else{
			System.err.println("A & B Value should be positive");
		}
	}
	
	

}
