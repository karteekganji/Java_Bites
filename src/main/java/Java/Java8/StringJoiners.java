package Java.Java8;

import java.util.StringJoiner;

public class StringJoiners {

	// Java StringJoiner Example 1: Joining strings by specifying delimiter

	/*
	 * In this example, we are concatenating multiple strings using
	 * StringJoiner. While creating the instance of StringJoiner, we have
	 * specified the delimiter as hyphen(-).
	 */

	public static class JoiningStringsByDelimiter {
		public static void main(String[] args) {
			// Passing Hyphen(-) as delimiter
			StringJoiner mystring = new StringJoiner("-");

			// Joining multiple strings by using add() method
			mystring.add("Logan");
			mystring.add("Magneto");
			mystring.add("Rogue");
			mystring.add("Storm");

			// Displaying the output String
			System.out.println(mystring);
		}
	}

	// Java StringJoiner Example 2: Adding prefix and suffix to the output String

	public static class AddingPrefixAndSuffix {
		public static void main(String[] args) {
			/*
			 * Passing comma(,) as delimiter and opening bracket "(" as prefix
			 * and closing bracket ")" as suffix
			 */
			StringJoiner mystring = new StringJoiner(",", "(", ")");

			// Joining multiple strings by using add() method
			mystring.add("Negan");
			mystring.add("Rick");
			mystring.add("Maggie");
			mystring.add("Daryl");

			// Displaying the output String
			System.out.println(mystring);
		}
	}
	
	// StringJoiner Example 3: Merging two StringJoiner objects

	public static class MergingTwoStringJoinerObjects {
		public static void main(String[] args) {
			/*
			 * Passing comma(,) as delimiter and opening bracket "(" as prefix
			 * and closing bracket ")" as suffix
			 */
			StringJoiner mystring = new StringJoiner(",", "(", ")");

			mystring.add("Negan");
			mystring.add("Rick");
			mystring.add("Maggie");
			mystring.add("Daryl");

			System.out.println("First String: " + mystring);

			/*
			 * Passing hyphen(-) as delimiter and string "pre" as prefix and
			 * string "suff" as suffix
			 */
			StringJoiner myanotherstring = new StringJoiner("-", "pre", "suff");

			myanotherstring.add("Sansa");
			myanotherstring.add("Imp");
			myanotherstring.add("Jon");
			myanotherstring.add("Ned");

			System.out.println("Second String: " + myanotherstring);

			/*
			 * Merging both the strings The important point to note here is that
			 * the output string will be having the delimiter prefix and suffix
			 * of the first string (the string which is calling the merge method
			 * of StringJoiner)
			 */
			StringJoiner mergedString = mystring.merge(myanotherstring);
			System.out.println(mergedString);
		}
	}
	
	// StringJoiner Example: setEmptyValue(), length() and toString() methods

	public static class StringJoinerOtherExamples {
		public static void main(String[] args) {
			// Comma(,) as delimiter
			StringJoiner mystring = new StringJoiner(",");

			/*
			 * Using setEmptyValue() method, we can set the default value of a
			 * StringJoiner instance, so if the StringJoiner is empty and we
			 * print the value of it, this default value will be displayed
			 */
			mystring.setEmptyValue("This is a default String");

			/*
			 * We have not added any string to StringJoiner yet so this should
			 * display the default value of StringJoiner
			 */
			System.out.println("Default String: " + mystring);

			// Adding strings to StringJoiner
			mystring.add("Apple");
			mystring.add("Banana");
			mystring.add("Orange");
			mystring.add("Kiwi");
			mystring.add("Grapes");
			System.out.println(mystring);

			/*
			 * The length() method of StringJoiner class returns the length of
			 * the string (the number of characters in the StringJoiner
			 * instance)
			 */
			int length = mystring.length();
			System.out.println("Length of the StringJoiner: " + length);

			/*
			 * The toString() method is used for converting a StringJoiner
			 * instance to a String.
			 */
			String s = mystring.toString();
			System.out.println(s);
		}
	}
}
