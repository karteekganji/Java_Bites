package Java.Java8;

import java.util.function.IntBinaryOperator;

@FunctionalInterface
interface MyFunctionalInterface {

	public int addMethod(int a, int b);
}

public class FunctionalInterface1 {

	public static void main(String args[]) {
		// lambda expression
		MyFunctionalInterface sum = (a, b) -> a + b;
		System.out.println("Result: " + sum.addMethod(12, 100));
	}

	public static class FunctionalInterface2 {

		public static void main(String args[]) {
			// lambda expression
			IntBinaryOperator sum = (a, b) -> a + b;
			System.out.println("Result: " + sum.applyAsInt(12, 100));
		}
	}

}
