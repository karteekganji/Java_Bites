package Java_Basics_GK;

public class Java_Boolean {
	public static void main(String args[]) {

		boolean b;

		b = false;
		System.out.println("b is " + b);
		b = true;
		System.out.println("b is " + b);

		/*
		 * a boolean value can control the if statement here is no requirement
		 * to write an if statement like this : if (b == true)
		 * >> IF statement executed when given condition is TRUE
		 */ 
			if (b)
				System.out.println("This is executed.");

		b = false;
		if (b)
			System.out.println("This is not executed.");

		/* outcome of a relational operator is a boolean value */
		System.out.println("10 > 9 is " + (10 > 9));

	}

}
