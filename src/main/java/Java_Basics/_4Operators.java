package Java_Basics;

public class _4Operators {
	
	/*
	 * OPERATORS IN JAVA :
	 * 
	 * An operator is a character that represents an action, for example + is an arithmetic operator that represents addition.
	 */
	
	
	public static void arithmeticOperators(){
		/*
		 * 1) Basic Arithmetic Operators : 
		 * Basic arithmetic operators are: +, -, *, /, %
		 */
		
		int num1 = 100;
		int num2 = 20;

		System.out.println("num1 + num2: " + (num1 + num2));
		System.out.println("num1 - num2: " + (num1 - num2));
		System.out.println("num1 * num2: " + (num1 * num2));
		System.out.println("num1 / num2: " + (num1 / num2));
		System.out.println("num1 % num2: " + (num1 % num2));
	}
	public static void assignmentsOperators() {
		
		/*
		 * 2) Assignment Operators :
		 * Assignments operators in java are: =, +=, -=, *=, /=, %=
		 */	
		
		int num1 = 10;
		int num2 = 20;
		
		num2 = num1;
		System.out.println("= Output: " + num2);
		num2 += num1;
		System.out.println("+= Output: " + num2);
		num2 -= num1;
		System.out.println("-= Output: " + num2);
		num2 *= num1;
		System.out.println("*= Output: " + num2);
		num2 /= num1;
		System.out.println("/= Output: " + num2);
		num2 %= num1;
		System.out.println("%= Output: " + num2);
	}
	
	public static void autoIncrementAndAutoDecrementOperators() {
		
		/*
		 * ++ and — 
		 * num++ is equivalent to num=num+1;
		 * num–- is equivalent to num=num
		 */
		
		int num1 = 100;
		int num2 = 200;
		num1++;
		num2--;
		System.out.println("num1++ is: " + num1);
		System.out.println("num2-- is: " + num2);
		
	}
	
	public static void logical_Operators() {
		/*
		 * 4) Logical Operators : Logical Operators are used with binary
		 * variables. They are mainly used in conditional statements and loops
		 * for evaluating a condition.
		 */
		
		boolean b1 = true;
		boolean b2 = false;

		System.out.println("b1 && b2: " + (b1 && b2));
		System.out.println("b1 || b2: " + (b1 || b2));
		System.out.println("!(b1 && b2): " + !(b1 && b2));

	}

	public static void main(String[] args) {
		logical_Operators();

	}

}
