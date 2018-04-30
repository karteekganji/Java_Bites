package Java.OOPS;

public class _20StaticAndDynamicBinding {

	/*
	 * Association of method call to the method body is known as binding. There
	 * are two types of binding: Static Binding that happens at compile time and
	 * Dynamic Binding that happens at runtime.
	 */
	
	
	/*
	 * Static and Dynamic Binding in Java
	 * 
	 * As mentioned above, association of method definition to the method call
	 * is known as binding. There are two types of binding: Static binding and
	 * dynamic binding. Lets discuss them.
	 * 
	 * Static Binding or Early Binding
	 * 
	 * The binding which can be resolved at compile time by compiler is known as
	 * static or early binding. The binding of static, private and final methods
	 * is compile-time. Why? The reason is that the these method cannot be
	 * overridden and the type of the class is determined at the compile time.
	 * Lets see an example to understand this:
	 * 
	 * Static binding example
	 * 
	 * Here we have two classes Human and Boy. Both the classes have same method
	 * walk() but the method is static, which means it cannot be overriden so
	 * even though I have used the object of Boy class while creating object
	 * obj, the parent class method is called by it. Because the reference is of
	 * Human type (parent class). So whenever a binding of static, private and
	 * final methods happen, type of the class is determined by the compiler at
	 * compile time and the binding happens then and there.
	 */
	static class Human {
		public static void walk() {
			System.out.println("Human walks");
		}
	}

	static class Boy extends Human {
		public static void walk() {
			System.out.println("Boy walks");
		}

		@SuppressWarnings("static-access") //Ignore it
		public static void main(String args[]) {
			/*
			 * Reference is of Human type and object is Boy type
			 */
			Human obj = new Boy();
			/*
			 * Reference is of HUman type and object is of Human type.
			 */
			Human obj2 = new Human();
			obj.walk();
			obj2.walk();
		}
	}
	
	/*
	 * Dynamic Binding or Late Binding
	 * 
	 * When compiler is not able to resolve the call/binding at compile time,
	 * such binding is known as Dynamic or late Binding. Method Overriding is a
	 * perfect example of dynamic binding as in overriding both parent and child
	 * classes have same method and in this case the type of the object
	 * determines which method is to be executed. The type of object is
	 * determined at the run time so this is known as dynamic binding.
	 * 
	 * Dynamic binding example
	 * 
	 * This is the same example that we have seen above. The only difference
	 * here is that in this example, overriding is actually happening since
	 * these methods are not static, private and final. In case of overriding
	 * the call to the overriden method is determined at runtime by the type of
	 * object thus late binding happens. Lets see an example to understand this:
	 */
	static class Human1 {
		// Overridden Method
		public void walk() {
			System.out.println("Human walks");
		}
	}

	static class Demo extends Human1 {
		// Overriding Method
		public void walk() {
			System.out.println("Boy walks");
		}

		public static void main(String args[]) {
			/*
			 * Reference is of Human type and object is Boy type
			 */
			Human1 obj = new Demo();
			/*
			 * Reference is of HUman type and object is of Human type.
			 */
			Human1 obj2 = new Human1();
			obj.walk();
			obj2.walk();
		}
	}

}
