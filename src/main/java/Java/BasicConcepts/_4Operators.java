package Java.BasicConcepts;

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
		int num3 = 300;
		int num4 = 400;
		num1++;
		num2--;
		++num3;
		--num4;
		System.out.println("num1++ is: " + num1);
		System.out.println("num2-- is: " + num2);
		System.out.println("++num3 is: " + num3);
		System.out.println("--num4 is: " + num4);
		
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

	public static void comparison_operators() {
		/*
		 * 5) Comparison(Relational) operators : 
		 * 
		 * We have six relational operators in Java: ==, !=, >, <, >=, <=
		 * 
		 * == returns true if both the left side and right side are equal
		 * 
		 * != returns true if left side is not equal to the right side of
		 * operator.
		 * 
		 * > returns true if left side is greater than right.
		 * 
		 * < returns true if left side is less than right side.
		 * 
		 * >= returns true if left side is greater than or equal to right side.
		 * 
		 * <= returns true if left side is less than or equal to right side.
		 */
		

	}
	
	public static void ternary_Operator() {
		/*
		 * 7) Ternary Operator : 
		 * Syntax:
		 * variable num1 = (expression) ? value if true : value if false 
		 * 
		 * If the expression results true then the first value before the colon (:) is
		 * assigned to the variable num1 else the second value is assigned to
		 * the num1.
		 */
		
		int num1, num2;
		num1 = 25;
		/*
		 * num1 is not equal to 10 that's why the second value after colon is
		 * assigned to the variable num2
		 */
		num2 = (num1 == 10) ? 100 : 200;
		System.out.println("num2: " + num2);

		/*
		 * num1 is equal to 25 that's why the first value is assigned to the
		 * variable num2
		 */
		num2 = (num1 == 25) ? 100 : 200;
		System.out.println("num2: " + num2);
	}
	
	public static void main(String[] args) {
		assignmentsOperators();

	}

}
