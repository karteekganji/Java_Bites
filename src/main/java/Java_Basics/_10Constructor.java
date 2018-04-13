package Java_Basics;

public class _10Constructor {
	
	/**
	 * Constructor is a block of code that initializes the newly created object.
	 * A constructor resembles an instance method in java but it’s not a method
	 * as it doesn’t have a return type.
	 * 
	 * Constructor has same name as the class.
	 * 
	 * public class MyClass{
	 *  //This is the constructor 
	 *  MyClass(){ 
	 *  
	 *  } .. 
	 *  
	 * }
	 * 
	 */	
	
	 public static class Hello {
		   String name;
		   //Constructor
		   Hello(){
		      this.name = "BeginnersBook.com";
		   }
		   public static void main(String[] args) {
		      Hello obj = new Hello();
		      System.out.println(obj.name);
		   }
		}
	
	
	/** There are three types of constructors: 
	 * 1). Default
	 * 2). No-arg constructor and
	 * 3). Parameterized.
	 */
	 
	/** Default constructor :
	 * 
	 * If you do not implement any constructor in your class, Java compiler
	 * inserts a default constructor into your code on your behalf. This
	 * constructor is known as default constructor
	 * 
	 * If you implement any constructor then you no longer receive a default constructor from Java compiler.
	 */
	 
	
	public static class ConstructorExample {

		int age;
		String name;

		// Default constructor
		ConstructorExample() {
			this.name = "Chaitanya";
			this.age = 30;
		}

		// Parameterized constructor
		ConstructorExample(String n, int a) {
			this.name = n;
			this.age = a;
		}

		public static void main(String[] args) {

			ConstructorExample obj1 = new ConstructorExample();
			ConstructorExample obj2 = new ConstructorExample("Steve", 56);
			System.out.println(obj1.name + " " + obj1.age);
			System.out.println(obj2.name + " " + obj2.age);

		}

	}

}
