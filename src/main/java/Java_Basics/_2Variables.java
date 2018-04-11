package Java_Basics;

public class _2Variables {
	
	/*
	 * >> To declare a variable follow this syntax:
	 * 
	 * data_type variable_name = value;
	 * 
	 * >> value is optional because in java
	 */
	
//	Similarly we can assign the values to the variables while declaring them, like this:

	char ch = 'A';
	int number = 100;
	
	/*
	 * or we can do it like this:
	 * 
	 * char ch; int number; 
	 * ...
	 * ch = 'A'; 
	 * number = 100;
	 */
	
	
	/*
	 * There are three types of variables in Java. 
	 * 1) Local variable 2) Static (or class) variable 3) Instance variable
	 */
	
	
	public static class StaticVariableExample{
		/*
		 * Static variables are also known as class variable because they are
		 * associated with the class and common for all the instances of class.
		 * For example, If I create three objects of a class and access this
		 * static variable, it would be common for all, the changes made to the
		 * variable using one of the object would reflect when you access it
		 * through other objects.
		 */		
		public static String myClassVar="class or static variable";
		
		private static String studname; // this is a private, static variable
		public static final String studbranch = "MME"; // constant variable
		
		@SuppressWarnings("static-access")
		public static void StaticVarMethod() {
			StaticVariableExample obj = new StaticVariableExample();
			StaticVariableExample obj2 = new StaticVariableExample();
			StaticVariableExample obj3 = new StaticVariableExample();

			// System.out.println(myClassVar);
			// Warning occurs becuase static class do not required creating Object
			// All three will display "class or static variable"

			System.out.println(obj.myClassVar);
			System.out.println(obj2.myClassVar);
			System.out.println(obj3.myClassVar);

			// changing the value of static variable using obj2
			obj2.myClassVar = "Changed Text";

			// All three will display "Changed Text"
			System.out.println(obj.myClassVar);
			System.out.println(obj2.myClassVar);
			System.out.println(obj3.myClassVar);
		}

		public static void main(String[] args) {
			StaticVarMethod();

			studname = "Karteek"; // For STATIC varible no need to create object we can use it directly inside the class
			System.out.println("Student Name is : " + studname + " and Branch is : " + studbranch);
		}
	}
	
	public static class InstanceVariableExample {
		
		/*
		 * Each instance(objects) of class has its own copy of instance
		 * variable. Unlike static variable, instance variables have their own
		 * separate copy of instance variable. We have changed the instance
		 * variable value using object obj2 in the following program and when we
		 * displayed the variable using all three objects, only the obj2 value
		 * got changed, others remain unchanged. This shows that they have their
		 * own copy of instance variable.
		 */		
		String myInstanceVar = "instance variable";

		public static void main(String args[]) {
			InstanceVariableExample obj = new InstanceVariableExample();
			InstanceVariableExample obj2 = new InstanceVariableExample();
			InstanceVariableExample obj3 = new InstanceVariableExample();

			System.out.println(obj.myInstanceVar);
			System.out.println(obj2.myInstanceVar);
			System.out.println(obj3.myInstanceVar);

			obj2.myInstanceVar = "Changed Text";

			System.out.println(obj.myInstanceVar);
			System.out.println(obj2.myInstanceVar);
			System.out.println(obj3.myInstanceVar);

		}
	}
	
	public static class InstanceVariableExample2 {
		public String studname; // this instance variable is visible for any child class
								
		private String studbranch; // this instance variable is only visible to the JavaProgram class
									

		public InstanceVariableExample2(String name) {
			studname = name;
		}

		public void initializeBranch(String branch) {
			studbranch = branch;
		}

		public void printStudent() {
			System.out.println("Student name : " + studname);
			System.out.println("Student Branch : " + studbranch);
		}

		public static void main(String[] args) {

			InstanceVariableExample2 out1 = new InstanceVariableExample2("Karteek");
			out1.initializeBranch("MME");
			out1.printStudent();
			InstanceVariableExample2 out2 = new InstanceVariableExample2("David");
			out2.initializeBranch("ECE");
			out2.printStudent();
		}

	}
	
	public static class LocalVariableExample {
		// instance variable
		public String myVar = "instance variable";

		public void myMethod() {
			// local variable
			String myVar = "Inside Method";
			System.out.println(myVar);
		}

		public static void main(String args[]) {
			// Creating object
			LocalVariableExample obj = new LocalVariableExample();

			/*
			 * We are calling the method, that changes the value of myVar. We
			 * are displaying myVar again after the method call, to demonstrate
			 * that the local variable scope is limited to the method itself.
			 */
			System.out.println("Calling Method");
			obj.myMethod();
			System.out.println(obj.myVar);
		}
	}
	

}
