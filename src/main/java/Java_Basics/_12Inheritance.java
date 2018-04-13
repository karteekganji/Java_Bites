package Java_Basics;

public class _12Inheritance {
	
	/*
	 * Inheritance
	 * 
	 * The process by which one class acquires the properties and
	 * functionalities of another class is called inheritance. Inheritance
	 * provides the idea of reusability of code and each sub class defines only
	 * those features that are unique to it, rest of the features can be
	 * inherited from the parent class.
	 * 
	 * 1) .Inheritance is a process of defining a new class based on an existing
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
	
	/*
	 * Note: Multi-level inheritance is allowed in Java but not multiple
	 * inheritance
	 * 
	 * Types of Inheritance: 
	 * Single Inheritance: refers to a child and parent
	 * class relationship where a class extends the another class.
	 * 
	 * Multilevel inheritance: refers to a child and parent class relationship
	 * where a class extends the child class. For example class A extends class
	 * B and class B extends class C.
	 * 
	 * Hierarchical inheritance: refers to a child and parent class relationship
	 * where more than one classes extends the same class. For example, class B
	 * extends class A and class C extends class A.
	 * 
	 * Multiple Inheritance: refers to the concept of one class extending more
	 * than one classes, which means a child class has two parent classes. Java
	 * doesn’t support multiple inheritance, read more about it here.
	 * 
	 */
	public static void main(String[] args) {

	}

}
