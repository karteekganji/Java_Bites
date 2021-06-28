package Java.Java8;

import java.util.Arrays;
import java.util.function.BiFunction;

public class MethodReferences {

	/*
	 * If your lambda expression is like this:
	 * 
	 * str -> System.out.println(str) 
	 * then you can replace it with a method reference like this:
	 *
	 * System.out::println
	 */
	
	
	/**
	Four types of method references
	1. Method reference to an instance method of an object – object::instanceMethod
	2. Method reference to a static method of a class – Class::staticMethod
	3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod
	4. Method reference to a constructor – Class::new
	*/
	
	/*
	 * 1. Method reference to an instance method of an object
	 */
	@FunctionalInterface 
	interface MyInterface{  
	    void display();  
	}  
	public static class Example1 {  
	    public void myMethod(){  
		System.out.println("Instance Method");  
	    }  
	    public static void main(String[] args) {  
		Example1 obj = new Example1();   
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;  
		// Calling the method of functional interface  
		ref.display();  
	    }  
	}
	
	/*
	 * 2. Method reference to a static method of a class
	 */
	public static class Multiplication {
		public static int multiply(int a, int b) {
			return a * b;
		}
	}

	public static class Example2 {
		public static void main(String[] args) {
			BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
			int pr = product.apply(11, 5);
			System.out.println("Product of given number is: " + pr);
		}
	}
	
	/*
	 * 3. Method reference to an instance method of an arbitrary object of a
	 * particular type
	 */
	public static class Example3 {

		public static void main(String[] args) {
			String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon" };
			/*
			 * Method reference to an instance method of an arbitrary object of
			 * a particular type
			 */
			Arrays.sort(stringArray, String::compareToIgnoreCase);
			for (String str : stringArray) {
				System.out.println(str);
			}
		}
	}
	
	/*
	 * 4. Method reference to a constructor
	 */
	@FunctionalInterface
	interface MyInterface2 {
		Hello display(String say);
	}

	public static class Hello {
		public Hello(String say) {
			System.out.print(say);
		}
	}

	public static class Example4 {
		public static void main(String[] args) {
			// Method reference to a constructor
			MyInterface2 ref = Hello::new;
			ref.display("Hello World!");
		}
	}

	
}
