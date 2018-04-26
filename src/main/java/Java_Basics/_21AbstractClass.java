package Java_Basics;

public class _21AbstractClass {
	
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
			System.out.println("overriding abstract method");
		}

		public static void main(String args[]) {
			Demo obj = new Demo();
			obj.disp2();
		}
	}

	
	public static void main(String[] args) {

	}

}
