package Java.OOPS;

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
	
	 // A simple constructor program :
	
	 public static class Simple_constructor {
		   String name;
		   //Constructor
		   Simple_constructor(){
		      this.name = "BeginnersBook.com";
		   }
		   public static void main(String[] args) {
			   Simple_constructor obj = new Simple_constructor();
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
	 
	
	/**
	 * No-arg constructor:
	 * 
	 * Constructor with no arguments is known as no-arg constructor. The
	 * signature is same as default constructor, however body can have any code
	 * unlike default constructor where the body of the constructor is empty.
	 * 
	 * Although you may see some people claim that that default and no-arg
	 * constructor is same but in fact they are not, even if you write public
	 * Demo() { } in your class Demo it cannot be called default constructor
	 * since you have written the code of it.
	 * 
	 * Example: No-arg constructor
	 */

	static class NoArg_constructor {
		public NoArg_constructor() {
			System.out.println("This is a no argument constructor");
		}

		public static void main(String args[]) {
			new NoArg_constructor();
		}
	}
	 
	/**
	 * Parameterized constructor
	 * 
	 * Constructor with arguments(or you can say parameters) is known as
	 * Parameterized constructor.
	 * 
	 * Example: parameterized constructor
	 * 
	 * In this example we have a parameterized constructor with two parameters
	 * id and name. While creating the objects obj1 and obj2 I have passed two
	 * arguments so that this constructor gets invoked after creation of obj1
	 * and obj2.
	 */
	static class parameterized_Constructor {

		int empId;
		String empName;

		// parameterized constructor with two parameters
		parameterized_Constructor(int id, String name) {
			this.empId = id;
			this.empName = name;
		}

		void info() {
			System.out.println("Id: " + empId + " Name: " + empName);
		}

		public static void main(String args[]) {
			parameterized_Constructor obj1 = new parameterized_Constructor(10245, "Chaitanya");
			parameterized_Constructor obj2 = new parameterized_Constructor(92232, "Negan");
			obj1.info();
			obj2.info();
		}
	}
	 
	/**
	 * Example2: parameterized constructor
	 * 
	 * In this example, we have two constructors, a default constructor and a
	 * parameterized constructor. When we do not pass any parameter while
	 * creating the object using new keyword then default constructor is
	 * invoked, however when you pass a parameter then parameterized constructor
	 * that matches with the passed parameters list gets invoked.
	 */
	static class parameterized_Constructor2 {
		private int var;

		// default constructor
		public parameterized_Constructor2() {
			this.var = 10;
		}

		// parameterized constructor
		public parameterized_Constructor2(int num) {
			this.var = num;
		}

		public int getValue() {
			return var;
		}

		public static void main(String args[]) {
			parameterized_Constructor2 obj = new parameterized_Constructor2();
			parameterized_Constructor2 obj2 = new parameterized_Constructor2(100);
			System.out.println("var is: " + obj.getValue());
			System.out.println("var is: " + obj2.getValue());
		}
	}
	
	/**
	 * Calling a constructor from the another constructor of same class is known
	 * as Constructor chaining.
	 * 
	 * The real purpose of Constructor Chaining is that you can pass parameters
	 * through a bunch of different constructors, but only have the
	 * initialization done in a single place.
	 */
	
	static class constructor_Chaining {
		public String empName;
		public int empSalary;
		public String address;

		// default constructor of the class
		public constructor_Chaining() {
			// this will call the constructor with String param
			this("Chaitanya");
		}

		public constructor_Chaining(String name) {
			// call the constructor with (String, int) param
			this(name, 120035);
		}

		public constructor_Chaining(String name, int sal) {
			// call the constructor with (String, int, String) param
			this(name, sal, "Gurgaon");
		}

		public constructor_Chaining(String name, int sal, String addr) {
			this.empName = name;
			this.empSalary = sal;
			this.address = addr;
		}

		void disp() {
			System.out.println("Employee Name: " + empName);
			System.out.println("Employee Salary: " + empSalary);
			System.out.println("Employee Address: " + address);
		}

		public static void main(String[] args) {
			constructor_Chaining obj = new constructor_Chaining();
			obj.disp();
		}
	}
	
	/**
	 * Java Copy Constructor
	 * 
	 * A copy constructor is used for copying the values of one object to
	 * another object.
	 */
	
	static class copy_Constructor {
		String web;

		copy_Constructor(String w) {
			web = w;
		}

		/*
		 * This is the Copy Constructor, it copies the values of one object to
		 * the another object (the object that invokes this constructor)
		 */
		copy_Constructor(copy_Constructor je) {
			web = je.web;
		}

		void disp() {
			System.out.println("Website: " + web);
		}

		public static void main(String args[]) {
			copy_Constructor obj1 = new copy_Constructor("BeginnersBook");

			/*
			 * Passing the object as an argument to the constructor This will
			 * invoke the copy constructor
			 */
			copy_Constructor obj2 = new copy_Constructor(obj1);
			obj1.disp();
			obj2.disp();
		}
	}
	
	
	/**
	 * Super()
	 * 
	 * Whenever a child class constructor gets invoked it implicitly invokes the
	 * constructor of parent class. You can also say that the compiler inserts a
	 * super(); statement at the beginning of child class constructor.
	 */
	
	static class MyParentClass {
		MyParentClass() {
			System.out.println("MyParentClass Constructor");
		}
	}

	static class MyChildClass extends MyParentClass {
		MyChildClass() {
			System.out.println("MyChildClass Constructor");
		}

		public static void main(String args[]) {
			new MyChildClass();
		}
	}
	
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
	
	/**
	 * Quick Recap
	 * 
	 * 1). Every class has a constructor whether it’s a normal class or a abstract class. 
	 * 2). Constructors are not methods and they don’t have any return type.
	 * 3). Constructor name should match with class name . 
	 * 4). Constructor can use any access specifier, they can be declared as private also. Private
	 * constructors are possible in java but there scope is within the class only. 
	 * 5). Like constructors method can also have name same as class name, but
	 * still they have return type, though which we can identify them that they
	 * are methods not constructors. 
	 * 6). If you don’t implement any constructor within the class, compiler will do it for. 
	 * 7). this() and super() should be the first statement in the constructor code. If you don’t mention them,
	 * compiler does it for you accordingly. 
	 * 8). Constructor overloading is possible but overriding is not possible. Which means we can have overloaded
	 * constructor in our class but we can’t override a constructor.
	 * 9). Constructors can not be inherited. 
	 * 10). If Super class doesn’t have a no-arg(default) constructor then compiler would not insert a default
	 * constructor in child class as it does in normal scenario. 
	 * 11). Interfaces do not have constructors.
	 * 12). Abstract class can have constructor and it gets
	 * invoked when a class, which implements interface, is instantiated. (i.e.
	 * object creation of concrete class). 
	 * 13). A constructor can also invoke another constructor of the same class – 
	 * By using this(). If you want to invoke an parameterized constructor then do it like this: this(parameter list).
	 */
}
