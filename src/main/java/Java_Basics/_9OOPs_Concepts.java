package Java_Basics;

public class _9OOPs_Concepts {
	
	/**
	 * The primary purpose of object-oriented programming is to increase the
	 * flexibility and maintainability of programs. Object oriented programming
	 * brings together data and its behaviour(methods) in a single
	 * location(object)
	 */
	// objects” that contain data and methods.
	
	/** Object: is a bundle of data and its behaviour(often known as methods) */
	
	// Example : OOPS Concepts
	public static class Website {
		// fields (or instance variable)
		String webName;
		int webAge;

		// constructor
		Website(String name, int age) {
			this.webName = name;
			this.webAge = age;
		}

		public static void main(String args[]) {
			// Creating objects
			Website obj1 = new Website("beginnersbook", 5);
			Website obj2 = new Website("google", 18);

			// Accessing object data through reference
			System.out.println(obj1.webName + " " + obj1.webAge);
			System.out.println(obj2.webName + " " + obj2.webAge);
		}
	}
	
	/**
	 * Characteristics of Objects:
	 * 
	 * If you find it hard to understand Abstraction and Encapsulation, do not
	 * worry as I have covered these topics in detail with examples in the next
	 * section of this guide.
	 * 
	 * 1). Abstraction 
	 * 2). Encapsulation
	 * 3). Message passing
	 * 
	 * Abstraction: Abstraction is a process where you show only “relevant” data
	 * and “hide” unnecessary details of an object from the user.
	 * 
	 * Encapsulation: Encapsulation simply means binding object state(fields)
	 * and behaviour(methods) together. If you are creating class, you are doing
	 * encapsulation.
	 * 
	 * Message passing : A single object by itself may not be very useful. An
	 * application contains many objects. One object interacts with another
	 * object by invoking methods on that object. It is also referred to as
	 * Method Invocation.
	 */
	
	
	

}
