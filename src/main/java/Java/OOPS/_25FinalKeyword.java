package Java.OOPS;

public class _25FinalKeyword {

	/**
	 * 1) final variable :
	 * 
	 * final variables are nothing but constants. We cannot change the value of a 
	 * final variable once it is initialized.
	 * 
	 */
	static class finalVariable {

		final int MAX_VALUE = 99;

		void myMethod() {
			// MAX_VALUE=101; //Uncomment to see exception
		}

		public static void main(String args[]) {
			finalVariable obj = new finalVariable();
			obj.myMethod();
		}
	}
	
	
	/*
	 * Blank final variable: 
	 * A final variable that is not initialized at the time of declaration is
	 * known as blank final variable. We must initialize the blank final variable 
	 * in constructor of the class otherwise it will throw a compilation error 
	 * (Error: variable MAX_VALUE might not have been initialized).
	 */

	static class blankFinalVariable {
		// Blank final variable
		final int MAX_VALUE;

		blankFinalVariable() {
			// It must be initialized in constructor
			MAX_VALUE = 100;
		}

		void myMethod() {
			System.out.println(MAX_VALUE);
		}

		public static void main(String args[]) {
			blankFinalVariable obj = new blankFinalVariable();
			obj.myMethod();
		}
	}
	
	/**  Whats the use of blank final variable?
	 * 
	 * Lets say we have a Student class which is having a field called Roll No. Since Roll No should
	 * not be changed once the student is registered, we can declare it as a final
	 * variable in a class but we cannot initialize roll no in advance for all
	 * the students(otherwise all students would be having same roll no). In
	 * such case we can declare roll no variable as blank final and we
	 * initialize this value during object creation like this:
	 */
	static class studentData {
		// Blank final variable
		final int ROLL_NO;

		studentData(int rnum) {
			// It must be initialized in constructor
			ROLL_NO = rnum;
		}

		void myMethod() {
			System.out.println("Roll no is:" + ROLL_NO);
		}

		public static void main(String args[]) {
			studentData obj = new studentData(1234);
			obj.myMethod();
		}
	}

	/**
	 * Uninitialized static final variable
	 * 
	 * A static final variable that is not initialized during declaration can only
	 * be initialized in static block.
	 * 
	 * Example:
	 */
	static class uninitializedStaticFinalVariable {
		// static blank final variable
		static final int ROLL_NO;
		static {
			ROLL_NO = 1230;
		}

		public static void main(String args[]) {
			System.out.println(uninitializedStaticFinalVariable.ROLL_NO);
		}
	}

	/*2) final method
	A final method cannot be overridden. Which means even though a sub class can call the final method of parent class without any issues but it cannot override it.
*/

	static class XYZ {
		final void demo() {
			System.out.println("XYZ Class Method");
		}
	}

	static class ABC extends XYZ {
		//Uncomment to see exception
		
/*		void demo() {
			System.out.println("ABC Class Method");
		}*/

		public static void main(String args[]) {
			ABC obj = new ABC();
			obj.demo();
		}
	}
	
	/*
	 * 3) final class
	 * 
	 * We cannot extend a final class. 
	 */ 

	final class finalClass {
	}

	static class ABCD // extends finalClass *******//Uncomment to see exception
	{
		void demo() {
			System.out.println("My Method");
		}

		public static void main(String args[]) {
			ABCD obj = new ABCD();
			obj.demo();
		}
	}
	
	/**
	 ** Points to Remember:
		1) A constructor cannot be declared as final.
		2) Local final variable must be initializing during declaration.
		3) All variables declared in an interface are by default final.
		4) We cannot change the value of a final variable.
		5) A final method cannot be overridden.
		6) A final class not be inherited.
		7) If method parameters are declared final then the value of these parameters cannot be changed.
		8) It is a good practice to name final variable in all CAPS.
		9) final, finally and finalize are three different terms. finally is used in exception handling and finalize is
		a method that is called by JVM during garbage collection.
	*/
	
	public static void main(String[] args) {

		
		
	}

}
