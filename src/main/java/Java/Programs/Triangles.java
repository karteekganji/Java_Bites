package Java.Programs;

import java.util.Scanner;

public class Triangles {
	
	public static class FloydTriangle {
		
	 /**Floyd's triangle
		****************
		1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 
		16 17 18 19 20 21*/

		public static void main(String[] args) {
			int rows, number = 1, counter, j;
			// To get the user's input
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number of rows for floyd's triangle:");
			// Copying user input into an integer variable named rows
			rows = input.nextInt();
			input.close();
			System.out.println("Floyd's triangle");
			System.out.println("****************");
			for (counter = 1; counter <= rows; counter++) {
				for (j = 1; j <= counter; j++) {
					System.out.print(number + " ");
					// Incrementing the number value
					number++;
				}
				// For new line
				System.out.println();
			}
		}

		public static class FloydGK {
			public static void main(String[] args) {
				int rows, i, number = 1;
				// To get the user's input
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the number of rows for floyd's triangle:");
				// Copying user input into an integer variable named rows
				rows = input.nextInt();
				input.close();
				System.out.println("Floyd's triangle");
				System.out.println("****************");
				for (i = 1; i <= rows; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print(number + " ");
						number++;
					}
					System.out.println();
				}
			}
		}
	}
}
