package Java.Programs;

import java.util.Scanner;

import org.apache.poi.hssf.record.FooterRecord;
import org.apache.tools.ant.types.resources.Sort;

public class Practice {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		int a, b;
		System.out.println("Enter from value : ");
		a = scanner.nextInt();
		System.out.println("Enter to value : ");
		b = scanner.nextInt();

		Operation(a, b);*/
		
//		fibonacci();
		BubbleSort();
	}

	public static void Operation(int a, int b) {
		int count = 0;
		if (a > 0 && b > 0) {
			for (int i = a; i <= b; i++) {
				for (int j = 1; j < b; j++) {
					if ((j * j) == i) {
						count++;
						System.out.print(j + "*" + j + "=" + i);
						System.out.print(" | ");
					}
				}
			}
			System.out.println();
			System.out.println("Count is : " + count);
		} else {
			System.err.println("A & B Value should be positive");
		}
	}

	public static class StaticKeyword {

		static int x;
		static int y;

		public void value() {
			x = x + 1;
			y = y + 1;
		}

		public void show() {
			System.out.println("X >>> " + x);
			System.out.println("Y >>> " + y);
		}

	}
	// 0,1,1,2,3,5,8
	public static void fibonacci() {
		
		int n = 6;
		int num1 = 0; int num2=1;
		for (int i = 0; i < n; i++) {
			System.out.print(num1+" ");
			int sum = num1+num2;
			num1=num2;
			num2 = sum;
		}
	}
	
	public static void BubbleSort() {
//	Scanner scanner = new Scanner(System.in);

		int[] ab = {1,4,6,3,2};
		int a;
		for (int i = 0; i < ab.length; i++) {
			a = ab[i];
			int[] ba;
			
			
		}
	}
}
