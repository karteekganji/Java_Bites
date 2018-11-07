package Java.Java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {

	/**
	 * A lambda expression is an anonymous function. A function that doesn’t
	 * have a name and doesn’t belong to any class.
	 */

	/*
	 * Java Lambda Expression Syntax :
	 */

	/*
	 * To create a lambda expression, we specify input parameters (if there are
	 * any) on the left side of the lambda operator ->, and place the expression
	 * or block of statements on the right side of lambda operator. For example,
	 * the lambda expression (x, y) -> x + y specifies that lambda expression
	 * takes two arguments x and y and returns the sum of these.
	 * 
	 * //Syntax of lambda expression (parameter_list) -> {function_body}
	 */

	/** Example 1: Java Lambda Expression with no parameter : */

	@FunctionalInterface //Optional
	interface MyFunctionalInterface1 {

		// A method with no parameter
		void sayHello();
	}

	public static class Example1 {

		public static void main(String args[]) {
			// lambda expression
			MyFunctionalInterface1 msg = () -> {
				System.out.println("Hello World !!");
			};
			msg.sayHello();
		}
	}

	/**
	 * Example 2: Java Lambda Expression with single parameter
	 */

	@FunctionalInterface
	interface MyFunctionalInterface2 {

		// A method with single parameter
		public int incrementByFive(int a);
	}

	public static class Example2 {

		public static void main(String args[]) {
			// lambda expression with single parameter num
			MyFunctionalInterface2 f = (num) -> num + 5;
			System.out.println(f.incrementByFive(22));
		}
	}

	/**
	 * Example 3: Java Lambda Expression with Multiple Parameters
	 */
	interface StringConcat {

		public String sconcat(String a, String b);
	}

	public static class Example3 {

		public static void main(String args[]) {
			// lambda expression with multiple arguments
			StringConcat s = (str1, str2) -> str1 + str2;
			System.out.println("Result: " + s.sconcat("Hello ", "World"));
		}
	}

	/**
	 * Example 4: Iterating collections using foreach loop
	 */

	public static class Example4 {
		public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			list.add("Rick");
			list.add("Negan");
			list.add("Daryl");
			list.add("Glenn");
			list.add("Carl");
			list.forEach(
					// lambda expression
					(names) -> System.out.println(names));
		}
	}

}
