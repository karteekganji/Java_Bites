//Using Switch_Case_Break_Default instead of IF_ELSE conditions
package Java.Practice;

import java.util.Scanner;

public class Switch_Case_Break {

	public static void main(String[] args) {
		Scanner Do=new Scanner(System.in);
		int age;
		System.out.println("Enter age: ");
		age=Do.nextInt();
		
		switch (age){
		case 18:
			System.out.println("You can vote");
			break;
		
		case 25:
			System.out.println("You can marry");
			break;
		
		case 60:
			System.out.println("You can retire");
			break;

		default:
			System.out.println("You have to wait");
			}
		}
		
	}
	

