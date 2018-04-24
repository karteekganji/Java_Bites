package Java_Basics;

import org.apache.maven.model.License;

public class _13Polymorphism {
	
	/*
	 * Polymorphism in java is a concept by which we can perform a single action
	 * by different ways.
	 * 
	 * Example of Java Runtime Polymorphism
	 * 
	 * In this example, we are creating two classes Bike and Splendar. Splendar
	 * class extends Bike class and overrides its run() method. We are calling
	 * the run method by the reference variable of Parent class. Since it refers
	 * to the subclass object and subclass method overrides the Parent class
	 * method, subclass method is invoked at runtime.
	 * 
	 * Since method invocation is determined by the JVM not compiler, it is
	 * known as runtime polymorphism.
	 */

	/*
	 * Upcasting
	 * 
	 * When reference variable of Parent class refers to the object of Child
	 * class, it is known as upcasting.
	 */
		
	static class Bike {
		void run() {
			System.out.println("running");
		}
	}

	static class Splender extends Bike {
		void run() {
			System.out.println("running safely with 60km");
		}

		public static void main(String args[]) {
			Bike b = new Splender();// upcasting
			b.run();
		}
	}
	
	/*
	 * Types of Polymorphism 1) Static Polymorphism 2) Dynamic Polymorphism
	 * 
	 * Static Polymorphism:
	 * 
	 * Polymorphism that is resolved during compiler time is known as static
	 * polymorphism. Method overloading can be considered as static polymorphism example. 
	 * 
	 * Method Overloading: This allows us to have more than one methods
	 * with same name in a class that differs in signature.
	 */

	static class DisplayOverloading {
		public void disp(char c) {
			System.out.println(c);
		}

		public void disp(char c, int num) {
			System.out.println(c + " " + num);
		}
	}

	public static class ExampleOverloading {
		public static void main(String args[]) {
			DisplayOverloading obj = new DisplayOverloading();
			obj.disp('a');
			obj.disp('a', 10);
		}
	}
	
	/*
	 * Dynamic Polymorphism
	 * 
	 * It is also known as Dynamic Method Dispatch. Dynamic polymorphism is a
	 * process in which a call to an overridden method is resolved at runtime
	 * rather, thats why it is called runtime polymorphism.
	 */

	static class Animal {
		public void animalSound() {
			System.out.println("Default Sound");
		}
	}

	public static class Dog extends Animal {

		public void animalSound() {
			System.out.println("Woof");
		}

		public static void main(String args[]) {
			Animal obj = new Dog();
			obj.animalSound();
		}
	}
	
	/*
	 * IS-A & HAS-A Relationships
	 * 
	 * A Car IS-A Vehicle and HAS-A License then the code would look like this:
	 */

	public class Vehicle{ }
	public class Car extends Vehicle{
	   @SuppressWarnings("unused")
	private License myCarLicense;
	}
	
	/*
	 * Java Runtime Polymorphism with Multilevel Inheritance
	 */
	static class Animal2 {
		void eat() {
			System.out.println("eating");
		}
	}

	static class Dog2 extends Animal2 {
		void eat() {
			System.out.println("eating fruits");
		}
	}

	static class BabyDog extends Dog2 {
		void eat() {
			System.out.println("drinking milk");
		}

		public static void main(String args[]) {
			Animal2 a1, a2, a3;
			a1 = new Animal2();
			a2 = new Dog2();
			a3 = new BabyDog();
			a1.eat();
			a2.eat();
			a3.eat();
		}
	}

}
