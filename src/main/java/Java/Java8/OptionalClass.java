package Java.Java8;

import java.util.Optional;

public class OptionalClass {

	// Java Example: Without using Optional class

	/*
	 * In this example, we didn’t assign the value to the String str and we are
	 * trying to get the substring out of it. Since there is no value present in
	 * the str, the program is throwing NullPointerException.
	 */

	public static class WithoutUsingOptional {
		public static void main(String[] args) {
			String[] str = new String[10];
			// Getting the substring
			String str2 = str[9].substring(2, 5);
			// Displaying substring
			System.out.print(str2);
		}
	}

	// Solution: Using Optional Class

	/*
	 * Optional.ofNullable() method of the Optional class, returns a Non-empty
	 * Optional if the given object has a value, otherwise it returns an empty
	 * Optional. We can check whether the returned Optional value is empty or
	 * non-empty using the isPresent() method.
	 */
	// Importing Optional class
	
	public static class UsingOptional {
		public static void main(String[] args) {
			String[] str = new String[10];
			Optional<String> isNull = Optional.ofNullable(str[9]);
			if (isNull.isPresent()) {
				// Getting the substring
				String str2 = str[9].substring(2, 5);
				// Displaying substring
				System.out.print("Substring is: " + str2);
			} else {
				System.out.println("Cannot get the substring from an empty string");
			}
			str[9] = "AgraIsCool";
			Optional<String> isNull2 = Optional.ofNullable(str[9]);
			if (isNull2.isPresent()) {
				// Getting the substring
				String str2 = str[9].substring(2, 5);
				// Displaying substring
				System.out.print("Substring is: " + str2);
			} else {
				System.out.println("Cannot get the substring from an empty string");
			}
		}
	}
	
//	Example: Optional isPresent() vs ifPresent() methods
	
	/*
	 * In the above example, we have seen that by using isPresent() method we
	 * can check whether the particular Optional object(or instance) is empty or
	 * no-empty. There is another method present in the Optional class, which
	 * only executes if the given Optional object is non-empty, the method is
	 * ifPresent(). Lets see an example to understand the difference.
	 */

	// Importing Optional class
	public static class isPresentVSifPresent {
		public static void main(String[] args) {
			// Creating Optional object from a String
			Optional<String> GOT = Optional.of("Game of Thrones");
			// Optional.empty() creates an empty Optional object
			Optional<String> nothing = Optional.empty();
			/*
			 * isPresent() method: Checks whether the given Optional Object is
			 * empty or not.
			 */
			if (GOT.isPresent()) {
				System.out.println("Watching Game of Thrones");
			} else {
				System.out.println("I am getting Bored");
			}
			/*
			 * ifPresent() method: It executes only if the given Optional object
			 * is non-empty.
			 */
			// This will print as the GOT is non-empty
			GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));
			// This will not print as the nothing is empty
			nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
		}
	}
}
