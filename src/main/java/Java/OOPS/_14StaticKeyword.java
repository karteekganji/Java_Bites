package Java.OOPS;

public class _14StaticKeyword {
	
	/**
	 * Static keyword can be used with class, variable, method and block. Static
	 * members belong to the class instead of a specific instance, this means if
	 * you make a member static, you can access it without object.
	 * 
	 * Static members are common for all the instances(objects) of the class but
	 * non-static members are separate for each instance of class.
	 */
		
	public static class SimpleStaticExample {
		// This is a static method
		static void myMethod() {
			System.out.println("myMethod");
		}

		public static void main(String[] args) {
			/*
			 * You can see that we are calling this method without creating any object.
			 */
			myMethod();
		}
	}
	
	/**
	 * Static Block
	 * 
	 * Static block is used for initializing the static variables.This block
	 * gets executed when the class is loaded in the memory. A class can have
	 * multiple Static blocks, which will execute in the same sequence in which
	 * they have been written into the program.
	 * 
	 * As you can see that both the static variables were initialized before we
	 * accessed them in the main method.
	 
		>>>> Example 1: Single static block
	 *
	 */
	static class Static_BlockExample{
	   static int num;
	   static String mystr;
	   static{
	      num = 97;
	      mystr = "Static keyword in Java";
	   }
	   public static void main(String args[])
	   {
	      System.out.println("Value of num: "+num);
	      System.out.println("Value of mystr: "+mystr);
	   }
	}
	
	/**
	 * 
	 * >>>> Example 2: Multiple Static blocks
	 *
	 * Lets see how multiple static blocks work in Java. They execute in the
	 * given order which means the first static block executes before second
	 * static block. That’s the reason, values initialized by first block are
	 * overwritten by second block.
	 *
	 */
	
	static class Static_Block_Multiple_Example{
		   static int num;
		   static String mystr;
		   //First Static block
		   static{
		      System.out.println("Static Block 1");
		      num = 68;
		      mystr = "Block1";
		  } 
		  //Second static block
		  static{
		      System.out.println("Static Block 2");
		      num = 98;
		      mystr = "Block2";
		  }
		  public static void main(String args[])
		  {
		      System.out.println("Value of num: "+num);
		      System.out.println("Value of mystr: "+mystr);
		   }
		}
	
	/**
	 *   >>> Example 3: Static variables are shared among all the instances of class
	 * 
	 * In this example, String variable is non-static and integer variable is
	 * Static. As you can see in the output that the non-static variable is
	 * different for both the objects but the static variable is shared among
	 * them, thats the reason the changes made to the static variable by object
	 * ob2 reflects in both the objects.
	 */
	static class Static_VariableExample {
		// Static integer variable
		static int var1 = 77;
		// non-static string variable
		String var2;

		@SuppressWarnings("static-access")
		public static void main(String args[]) {
			Static_VariableExample ob1 = new Static_VariableExample();
			Static_VariableExample ob2 = new Static_VariableExample();
			/*
			 * static variables can be accessed directly without any instances.
			 * Just to demonstrate that static variables are shared, I am
			 * accessing them using objects so that we can check that the
			 * changes made to static variables by one object, reflects when we
			 * access them using other objects
			 */
			// Assigning the value to static variable using object ob1
			ob1.var1 = 88;
			ob1.var2 = "I'm Object1";
			/*
			 * This will overwrite the value of var1 because var1 has a single
			 * copy shared among both the objects.
			 */
			ob2.var1 = 99;
			ob2.var2 = "I'm Object2";
			System.out.println("ob1 integer:" + ob1.var1);
			System.out.println("ob1 String:" + ob1.var2);
			System.out.println("ob2 integer:" + ob2.var1);
			System.out.println("ob2 STring:" + ob2.var2);
		}
	}

	/**
	 * >>> Example 4: Static method accessed directly in static and non-static
	 * method
	 */

	static class Static_MethodExample {
		static int i = 100;
		static String s = "Beginnersbook";

		// Static method
		static void display() {
			System.out.println("i:" + i);
			System.out.println("i:" + s);
		}

		// non-static method
		void function() {
			// Static method called in non-static method
			display();
		}

		// static method
		public static void main(String args[]) {
			Static_MethodExample obj = new Static_MethodExample();
			// You need to have an object to call this non-static method
			obj.function();

			// Static method called in another static method
			display();
		}
	}
	
	/**
	 * Static Class
	 * 
	 * A class can be made static only if it is a nested class.
	 * 
	 * Nested static class doesn’t need reference of Outer class A static class
	 * cannot access non-static members of the Outer class We will see these two
	 * points with the help of an example:
	 * 
	 * >>> Example 5: Static class Example
	 */

	private static  String str = "BeginnersBook";

	// Static class
	static class MyNestedClass {
		// non-static method
		public void disp() {

			/*
			 * If you make the str variable of outer class non-static then you
			 * will get compilation error because: a nested static class cannot
			 * access non- static members of the outer class.
			 */
			System.out.println(str);
		}

	}
	
	public static void main(String args[]) {
		/*
		 * To create instance of nested class we didn't need the outer class
		 * instance but for a regular nested class you would need to create an
		 * instance of outer class first
		 */
		_14StaticKeyword.MyNestedClass obj = new _14StaticKeyword.MyNestedClass();
		obj.disp();
	}

}
