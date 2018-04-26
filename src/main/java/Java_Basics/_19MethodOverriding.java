package Java_Basics;

public class _19MethodOverriding {

	/*
	 * Declaring a method in sub class which is already present in parent class
	 * is known as method overriding. Overriding is done so that a child class
	 * can give its own implementation to a method which is already provided by
	 * the parent class. In this case the method in parent class is called
	 * overridden method and the method in child class is called overriding
	 * method. In this guide, we will see what is method overriding in Java and
	 * why we use it.
	 */
	
	/*
	 * Method Overriding Example
	 * 
	 * Lets take a simple example to understand this. We have two classes: A
	 * child class Boy and a parent class Human. The Boy class extends Human
	 * class. Both the classes have a common method void eat(). Boy class is
	 * giving its own implementation to the eat() method or in other words it is
	 * overriding the eat() method.
	 * 
	 * The purpose of Method Overriding is clear here. Child class wants to give
	 * its own implementation so that when it calls this method, it prints Boy
	 * is eating instead of Human is eating.
	 */
	
	static class Human {
		// Overridden method
		public void eat() {
			System.out.println("Human is eating");
		}
	}

	static class Boy extends Human {
		// Overriding method
		public void eat() {
			System.out.println("Boy is eating");
		}

		public static void main(String args[]) {
			Boy obj = new Boy();
			// This will call the child class version of eat()
			obj.eat();
		}
	}	
	
	
	/*
	 * Method Overriding and Dynamic Method Dispatch
	 * 
	 * Method Overriding is an example of runtime polymorphism. When a parent
	 * class reference points to the child class object then the call to the
	 * overridden method is determined at runtime, because during method call
	 * which method(parent class or child class) is to be executed is determined
	 * by the type of object. This process in which call to the overridden
	 * method is resolved at runtime is known as dynamic method dispatch. Lets
	 * see an example to understand this:
	 */
	static class ABC {
		// Overridden method
		public void disp() {
			System.out.println("disp() method of parent class");
		}
	}

	static class Demo extends ABC {
		// Overriding method
		public void disp() {
			System.out.println("disp() method of Child class");
		}

		public void newMethod() {
			System.out.println("new method of child class");
		}

		public static void main(String args[]) {
			/*
			 * When Parent class reference refers to the parent class object
			 * then in this case overridden method (the method of parent class)
			 * is called.
			 */
			ABC obj = new ABC();
			obj.disp();

			/*
			 * When parent class reference refers to the child class object then
			 * the overriding method (method of child class) is called. This is
			 * called dynamic method dispatch and runtime polymorphism
			 */
			ABC obj2 = new Demo();
			obj2.disp();
		}
	}

	/*
	 * Super keyword in Method Overriding
	 * 
	 * The super keyword is used for calling the parent class
	 * method/constructor. super.myMethod() calls the myMethod() method of base
	 * class while super() calls the constructor of base class. Let’s see the
	 * use of super in method Overriding. As we know that we we override a
	 * method in child class, then call to the method using child class object
	 * calls the overridden method. By using super we can call the overridden
	 * method as shown in the example below:
	 */
	static class ABCD {
		public void myMethod() {
			System.out.println("Overridden method");
		}
	}

	static class Demo1 extends ABCD {
		public void myMethod() {
			// This will call the myMethod() of parent class
			super.myMethod();
			System.out.println("Overriding method");
		}

		public static void main(String args[]) {
			Demo1 obj = new Demo1();
			obj.myMethod();
		}
	}
	
	public static void main(String[] args) {

		
		
	}

}
