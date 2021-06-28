package Java.OOPS;

public class _18MethodOverLoading {
	
	/*
	 * Method Overloading is a feature that allows a class to have more than one
	 * method having the same name, if their argument lists are different. It is
	 * similar to constructor overloading in Java, that allows a class to have
	 * more than one constructor having different argument lists.
	 * 
	 * let’s get back to the point, when I say argument list it means the
	 * parameters that a method has: For example the argument list of a method
	 * add(int a, int b) having two parameters is different from the argument
	 * list of the method add(int a, int b, int c) having three parameters.
	 */
	
	/*
	 * Example 1: Overloading – Different Number of parameters in argument list
	 * 
	 * This example shows how method overloading is done by having different
	 * number of parameters
	 */

	static class DisplayOverloading {
		public void disp(char c) {
			System.out.println(c);
		}

		public void disp(char c, int num) {
			System.out.println(c + " " + num);
		}
	}

	static class Sample {
		public static void main(String args[]) {
			DisplayOverloading obj = new DisplayOverloading();
			obj.disp('a');
			obj.disp('a', 10);
		}
	}
	
	/*
	 * Example 2: Overloading – Difference in data type of parameters
	 * 
	 * In this example, method disp() is overloaded based on the data type of
	 * parameters – We have two methods with the name disp(), one with parameter
	 * of char type and another method with the parameter of int type.
	 */
	static class DisplayOverloading2 {
		public void disp(char c) {
			System.out.println(c);
		}

		public void disp(int c) {
			System.out.println(c);
		}
	}

	static class Sample2 {
		public static void main(String args[]) {
			DisplayOverloading2 obj = new DisplayOverloading2();
			obj.disp('a');
			obj.disp(5);
		}
	}
	
	/*
	 * Example3: Overloading – Sequence of data type of arguments
	 * 
	 * Here method disp() is overloaded based on sequence of data type of
	 * parameters – Both the methods have different sequence of data type in
	 * argument list. First method is having argument list as (char, int) and
	 * second is having (int, char). Since the sequence is different, the method
	 * can be overloaded without any issues.
	 */
	static class DisplayOverloading3 {
		public void disp(char c, int num) {
			System.out.println("I’m the first definition of method disp");
		}

		public void disp(int num, char c) {
			System.out.println("I’m the second definition of method disp");
		}
	}

	static class Sample3 {
		public static void main(String args[]) {
			DisplayOverloading3 obj = new DisplayOverloading3();
			obj.disp('x', 51);
			obj.disp(52, 'y');
		}
	}

	/*
	 * Method Overloading and Type Promotion
	 * 
	 * When a data type of smaller size is promoted to the data type of bigger
	 * size than this is called type promotion, for example: byte data type can
	 * be promoted to short, a short data type can be promoted to int, long,
	 * double etc.
	 * 
	 * What it has to do with method overloading? Well, it is very important to
	 * understand type promotion else you will think that the program will throw
	 * compilation error but in fact that program will run fine because of type
	 * promotion. Lets take an example to see what I am talking here:
	 */
	static class Demo {
		void disp(int a, double b) {
			System.out.println("Method A");
		}

		void disp(int a, double b, double c) {
			System.out.println("Method B");
		}

		public static void main(String args[]) {
			Demo obj = new Demo();
			/*
			 * I am passing float value as a second argument but it got promoted
			 * to the type double, because there wasn't any method having arg
			 * list as (int, float)
			 */
			obj.disp(100, 20.67f);
		}
	}
	
	/*
	 * As you can see that I have passed the float value while calling the
	 * disp() method but it got promoted to the double type as there wasn’t any
	 * method with argument list as (int, float)
	 * 
	 * But this type promotion doesn’t always happen, lets see another example:
	 */
	static class Demo1 {
		void disp(int a, double b) {
			System.out.println("Method A");
		}

		void disp(int a, double b, double c) {
			System.out.println("Method B");
		}

		void disp(int a, float b) {
			System.out.println("Method C");
		}

		public static void main(String args[]) {
			Demo1 obj = new Demo1();
			/*
			 * This time promotion won't happen as there is a method with arg
			 * list as (int, float)
			 */
			obj.disp(100, 20.67f);
		}
	}
	
	// Type Promotion table: 
	
	// byte → short → int → long
	// short → int → long
	// int → long → float → double
	// float → double
	// long → float → double
	
	/**
	 * More than one method with same name and argument list cannot be given in
	 * a class even though their return type is different. Method return type
	 * doesn’t matter in case of overloading.
	 */
	public static void main(String[] args) {

	}

}
