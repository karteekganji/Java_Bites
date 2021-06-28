package Java.OOPS;

public class _12Inheritance {
	
	/*
	 * Inheritance
	 * 
	 * The process by which one class acquires the properties and
	 * functionalities of another class is called inheritance. Inheritance
	 * provides the idea of re-usability of code and each sub class defines only
	 * those features that are unique to it, rest of the features can be
	 * inherited from the parent class.
	 * 
	 * 1). Inheritance is a process of defining a new class based on an existing
	 * class by extending its common data members and methods. 
	 * 2). Inheritance allows us to reuse of code, it improves reusability in your java
	 * application. 
	 * 3). The parent class is called the base class or super class.
	 * The child class that extends the base class is called the derived class
	 * or sub class or child class. 
	 * 
	 * Note: The biggest advantage of Inheritance is that the code in base class need not 
	 * be rewritten in the child class. The variables and methods of the base class can be 
	 * used in the child class as well.
	 * 
	 * Syntax: Inheritance in Java
	 * 
	 * To inherit a class we use extends keyword. Here class A is child class
	 * and class B is parent class.
	 * 
	 * class A extends B { 
	 * }
	 */
	
	/*
	 * Inheritance Example :
	 * 
	 * In this example, we have a parent class Teacher and a child class
	 * MathTeacher. In the MathTeacher class we need not to write the same code
	 * which is already present in the present class. Here we have college name,
	 * designation and does() method that is common for all the teachers, thus
	 * MathTeacher class does not need to write this code, the common data
	 * members and methods can inherited from the Teacher class.
	 */
	static class Teacher {
		String designation = "Teacher";
		String college = "Beginnersbook";

		void does() {
			System.out.println("Teaching");
		}
	}

	public static class MathTeacher extends Teacher {
		String mainSubject = "Maths";

		public static void main(String args[]) {
			MathTeacher obj = new MathTeacher();
			System.out.println(obj.college);
			System.out.println(obj.designation);
			System.out.println(obj.mainSubject);
			obj.does();
		}
	}
	
	
	/**
	 * The derived class inherits all the members and methods that are declared
	 * as public or protected. If the members or methods of super class are
	 * declared as private then the derived class cannot use them directly. The
	 * private members can be accessed only in its own class. Such private
	 * members can only be accessed using public or protected getter and setter
	 * methods of super class as shown in the example below.
	 */	
	static class Teacher1 {
		   private String designation = "Teacher";
		   private String collegeName = "Beginnersbook";
		   public String getDesignation() {
			return designation;
		   }
		   protected void setDesignation(String designation) {
			this.designation = designation;
		   }
		   protected String getCollegeName() {
			return collegeName;
		   }
		   protected void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		   }
		   void does(){
			System.out.println("Teaching");
		   }
		}

		public static class JavaExample extends Teacher1{
		   String mainSubject = "Physics";
		   public static void main(String args[]){
			JavaExample obj = new JavaExample();
			/* Note: we are not accessing the data members 
			 * directly we are using public getter method 
			 * to access the private members of parent class
			 */
			System.out.println(obj.getCollegeName());
			System.out.println(obj.getDesignation());
			System.out.println(obj.mainSubject);
			obj.does();
		   }
		}
	
	/*
	 * Constructors and Inheritance
	 * 
	 * constructor of sub class is invoked when we create the object of
	 * subclass, it by default invokes the default constructor of super class.
	 * Hence, in inheritance the objects are constructed top-down. The
	 * superclass constructor can be called explicitly using the super keyword,
	 * but it should be first statement in a constructor. The super keyword
	 * refers to the superclass, immediately above of the calling class in the
	 * hierarchy. The use of multiple super keywords to access an ancestor class
	 * other than the direct parent is not permitted.
	 */
	static class onstructors_And_Inheritance{
		// Parent class constructor
		onstructors_And_Inheritance() {
			System.out.println("Constructor of Parent");
		}
	}

	static class JavaExample1 extends onstructors_And_Inheritance {
		JavaExample1() {
			/*
			 * It by default invokes the constructor of parent class You can use
			 * super() to call the constructor of parent. It should be the first
			 * statement in the child class constructor, you can also call the
			 * parameterized constructor of parent class by using super like
			 * this: super(10), now this will invoke the parameterized
			 * constructor of int arg
			 */
			System.out.println("Constructor of Child");
		}

		public static void main(String args[]) {
			// Creating the object of child class
			new JavaExample1();
		}
	}
	
	/*
	 * Inheritance and Method Overriding
	 * 
	 * When we declare the same method in child class which is already present
	 * in the parent class this is called method overriding. In this case
	 * when we call the method from child class object, the child class version
	 * of the method is called. However we can call the parent class method
	 * using super keyword as I have shown in the example below:
	 */
	static class Inheritance_And_Method_Overriding {
		// Parent class constructor
		Inheritance_And_Method_Overriding() {
			System.out.println("Constructor of Parent");
		}

		void disp() {
			System.out.println("Parent Method");
		}
	}

	static class JavaExample2 extends Inheritance_And_Method_Overriding {
		JavaExample2() {
			System.out.println("Constructor of Child");
		}

		void disp() {
			System.out.println("Child Method");
			// Calling the disp() method of parent class
			super.disp();
		}

		public static void main(String args[]) {
			// Creating the object of child class
			JavaExample2 obj = new JavaExample2();
			obj.disp();
		}
	}
	
	
	/**
	 * Note: Multi-level inheritance is allowed in Java but not multiple
	 * inheritance
	 */
	
	
	/** Types of Inheritance:
	 * 
	 *  Single Inheritance: refers to a child and parent
	 * class relationship where a class extends the another class.
	 **/	
	
	// ###### Ex: Single Inheritance example program in Java

	static class A {

		public void methodA() {
			System.out.println("Base class method");
		}
	}

	static class Single_Inheritance extends M {

		public void methodB() {
			System.out.println("Child class method");
		}

		public static void main(String args[]) {
			Single_Inheritance obj = new Single_Inheritance();
			obj.methodA(); // calling super class method
			obj.methodB(); // calling local method
		}
	}
	
	/** Multilevel inheritance: refers to a child and parent class relationship
	 * where a class extends the child class. For example class A extends class
	 * B and class B extends class C.
	 **/
	
	// ###### Ex: Multilevel Inheritance example program in Java

	static class X {
		public void methodX() {
			System.out.println("Class X method");
		}
	}

	static class Y extends X {
		public void methodY() {
			System.out.println("class Y method");
		}
	}

	static class Multilevel_Inheritance extends Y {
		public void methodZ() {
			System.out.println("class Z method");
		}

		public static void main(String args[]) {
			Multilevel_Inheritance obj = new Multilevel_Inheritance();
			obj.methodX(); // calling grand parent class method
			obj.methodY(); // calling parent class method
			obj.methodZ(); // calling local method
		}
	}
	
	/* * Hierarchical inheritance: refers to a child and parent class relationship
	 * where more than one classes extends the same class. For example, class B
	 * extends class A and class C extends class A.
	 **/ 
	
	// ###### Ex: Example of Hierarchical Inheritance
	
	static class M {
		public void methodA() {
			System.out.println("method of Class M");
		}
	}

	static class N extends M {
		public void methodB() {
			System.out.println("method of Class N");
		}
	}

	static class O extends M {
		public void methodC() {
			System.out.println("method of Class O");
		}
	}

	static class Hierarchical_inheritance {
		public static void main(String args[]) {
			N obj1 = new N();
			O obj2 = new O();
			// All classes can access the method of class A
			obj1.methodA();
			obj2.methodA();
		}
	}
	
	/* * Multiple Inheritance: refers to the concept of one class extending more
	 * than one classes, which means a child class has two parent classes. Java
	 * doesn’t support multiple inheritance, read more about it here.
	 * */
	
	
	/** Hybrid inheritance: Combination of more than one types of inheritance
	 * in a single program. For example class A & B extends class C and another
	 * class D extends class A then this is a hybrid inheritance example because
	 * it is a combination of single and hierarchical inheritance.
	 **/
	
	static class E {
		public void disp() {
			System.out.println("E");
		}
	}

	static class F extends E {
		public void disp() {
			System.out.println("F");
		}
	}

	static class G extends E {
		public void disp() {
			System.out.println("G");
		}

	}

	static class Hybrid_inheritance extends F {
		public void disp() {
			System.out.println("Hybrid_inheritance");
		}

		public static void main(String args[]) {

			Hybrid_inheritance obj = new Hybrid_inheritance();
			obj.disp();
		}
	}
	
	
	public static class AB {

		void sum(int a, int b) {
			System.out.println("Parent Class --> " + (a + b));
		}
	}

	public static class BC extends AB {

		void sum(int a, int b, int c) {
			System.out.println("Child Class --> " + (a + b + c));
		}
	}
	
	public static class DE extends BC {

		 void sum(int a, int b, int c, int d) {
			System.out.println("Last Child Class --> " + (a*b*c*d));
		}
	}
	
	public static void main(String[] args) {
		BC bc = new BC();
		bc.sum(4, 6);
		bc.sum(4, 5, 6);

		AB ab = new AB();
		ab.sum(4, 6);
	// ab.sum(4, 5, 6); -- This Cannot be called as AB doesn't Extends BC

		AB abbc = new BC(); // Here method abbc is a instance of class BC and Type class AB
		abbc.sum(8, 9);
	// abbc.sum(4, 8, 12); -- This Cannot be called as AB doesn't Extends BC

		abbc = new DE();
		abbc.sum(5, 10);
	}

}
