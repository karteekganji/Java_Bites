package Java_Basics;

public class _21AbstractClassaAndMethods {
	
	/*
	 * A class that is declared using “abstract” keyword is known as abstract
	 * class. It can have abstract methods(methods without body) as well as
	 * concrete methods (regular methods with body). A normal class(non-abstract
	 * class) cannot have abstract methods. 
	 * 
	 * An abstract class can not be instantiated, which means you are not
	 * allowed to create an object of it.
	 * 
	 * Why we need an abstract class?
	 * 
	 * Lets say we have a class Animal that has a method sound() and the
	 * subclasses(see inheritance) of it like Dog, Lion, Horse, Cat etc. Since
	 * the animal sound differs from one animal to another, there is no point to
	 * implement this method in parent class. This is because every child class
	 * must override this method to give its own implementation details, like
	 * Lion class will say “Roar” in this method and Dog class will say “Woof”.
	 * 
	 * So when we know that all the animal child classes will and should
	 * override this method, then there is no point to implement this method in
	 * parent class. Thus, making this method abstract would be the good choice
	 * as by making this method abstract we force all the sub classes to
	 * implement this method( otherwise you will get compilation error), also we
	 * need not to give any implementation to this method in parent class.
	 * 
	 * Since the Animal class has an abstract method, you must need to declare
	 * this class abstract.
	 * 
	 * Now each animal must have a sound, by making this method abstract we made
	 * it compulsory to the child class to give implementation details to this
	 * method. This way we ensures that every animal has a sound.
	 * 
	 * Abstract class Example
	 */
	
	//abstract parent class
	abstract static class Animal{
	   //abstract method
	   public abstract void sound();
	}
	//Dog class extends Animal class
	public static class Dog extends Animal{

	   public void sound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		Animal obj = new Dog();
		obj.sound();
	   }
	}
	
	/*
	 * Why can’t we create the object of an abstract class?
	 * 
	 * Because these classes are incomplete, they have abstract methods that
	 * have no body so if java allows you to create object of this class then if
	 * someone calls the abstract method using that object then What would
	 * happen?There would be no actual implementation of the method to invoke.
	 * Also because an object is concrete. An abstract class is like a template,
	 * so you have to extend it and build on it before you can use it.
	 */
	
	/*
	 * Abstract class vs Concrete class
	 * 
	 * A class which is not abstract is referred as Concrete class. In the above
	 * example that we have seen in the beginning of this guide, Animal is a
	 * abstract class and Cat, Dog & Lion are concrete classes.
	 * 
	 * Key Points:
	 * 
	 * >>> An abstract class has no use until unless it is extended by some other
	 * class. 
	 * >>> If you declare an abstract method in a class then you must declare
	 * the class abstract as well. you can’t have abstract method in a concrete
	 * class. It’s vice versa is not always true: If a class is not having any
	 * abstract method then also it can be marked as abstract. 
	 * >>> It can have non-abstract method (concrete) as well. 
	 * 
	 * 1) Abstract method has no body. 
	 * 2) Always end the declaration with a semicolon(;). 
	 * 3) It must be overridden. An abstract class must be extended and in a same way abstract method must be
	 * overridden.
	 * 4) A class has to be declared abstract to have abstract methods.
	 * 
	 * Note: The class which is extending abstract class must override all the
	 * abstract methods.
	 */
	  
	//Example of Abstract class and method
	 

	static abstract class MyClass {
		public void disp() {
			System.out.println("Concrete method of parent class");
		}

		abstract public void disp2();
	}

	static class Demo extends MyClass {
		/*
		 * Must Override this method while extending MyClas
		 */
		public void disp2() {
			System.out.println("Overriding abstract method");
		}

		public static void main(String args[]) {
			Demo obj = new Demo();
			obj.disp2();
		}
	}
	
	/*
	 * A method without body (no implementation) is known as abstract method. A
	 * method must always be declared in an abstract class, or in other words
	 * you can say that if a class has an abstract method, it should be declared
	 * abstract as well. In the last tutorial we discussed Abstract class, if
	 * you have not yet checked it out read it here: Abstract class in Java,
	 * before reading this guide. This is how an abstract method looks in java:
	 * 
	 * public abstract int myMethod(int n1, int n2); 
	 * As you see this has no body.
	 * 
	 * Rules of Abstract Method
	 * 
	 * 1. Abstract methods don’t have body, they just have method signature as
	 * shown above. 
	 * 2. If a class has an abstract method it should be declared abstract, the vice versa is not true, 
	 * which means an abstract class doesn’t need to have an abstract method compulsory. 
	 * 3. If a regular class extends an abstract class, then the class must have to implement all the
	 * abstract methods of abstract parent class or it has to be declared abstract as well.
	 * 
	 * Example 1: abstract method in an abstract class
	 */
	// abstract class
	static abstract class Sum {
		/*
		 * These two are abstract methods, the child class must implement these
		 * methods
		 */
		public abstract int sumOfTwo(int n1, int n2);

		public abstract int sumOfThree(int n1, int n2, int n3);

		// Regular method
		public void disp() {
			System.out.println("Method of class Sum");
		}
	}

	// Regular class extends abstract class
	static class Demo1 extends Sum {

		/*
		 * If I don't provide the implementation of these two methods, the
		 * program will throw compilation error.
		 */
		public int sumOfTwo(int num1, int num2) {
			return num1 + num2;
		}

		public int sumOfThree(int num1, int num2, int num3) {
			return num1 + num2 + num3;
		}

		public static void main(String args[]) {
			Sum obj = new Demo1();
			System.out.println(obj.sumOfTwo(3, 7));
			System.out.println(obj.sumOfThree(4, 3, 19));
			obj.disp();
		}
	}

	
	/*
	 * Example 2: abstract method in interface
	 * 
	 * All the methods of an interface are public abstract by default. You
	 * cannot have concrete (regular methods with body) methods in an interface.
	 */
	// Interface
	interface Multiply {
		// abstract methods
		public abstract int multiplyTwo(int n1, int n2);

		/*
		 * We need not to mention public and abstract in interface as all the
		 * methods in interface are public and abstract by default so the
		 * compiler will treat this as public abstract multiplyThree(int n1, int
		 * n2, int n3);
		 */
		int multiplyThree(int n1, int n2, int n3);

		/*
		 * Regular (or concrete) methods are not allowed in an interface so if I
		 * uncomment this method, you will get compilation error 
		 * public void disp(){ 
		 * System.out.println("I will give error if u uncomment me"); 
		 * }
		 */
	}

	static class Demo2 implements Multiply {
		public int multiplyTwo(int num1, int num2) {
			return num1 * num2;
		}

		public int multiplyThree(int num1, int num2, int num3) {
			return num1 * num2 * num3;
		}

		public static void main(String args[]) {
			Multiply obj = new Demo2();
			System.out.println(obj.multiplyTwo(3, 7));
			System.out.println(obj.multiplyThree(1, 9, 0));
		}
	}

}
