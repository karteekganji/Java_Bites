package Java.Exceptions;

import java.io.IOException;

public class _6ThrowsKeyword {

	/*
	 * Unchecked exception (Runtime) doesn’t get checked during compilation.
	 * Throws keyword is used for handling checked exceptions . By using throws
	 * we can declare multiple exceptions in one go.
	 */
	
	/**
	 * Example of throws Keyword:
	 * 
	 * In this example the method myMethod() is throwing two checked exceptions 
	 * so we have declared these exceptions in the method signature using throws Keyword. 
	 * If we do not declare these exceptions then the program will throw a compilation error.
	 */
	
	public static class ThrowExample {
		void myMethod(int num) throws IOException, ClassNotFoundException {
			if (num == 1)
				throw new IOException("IOException Occurred");
			else
				throw new ClassNotFoundException("ClassNotFoundException");
		}
	}

	public static class Example1 {
		public static void main(String args[]) {
			try {
				ThrowExample obj = new ThrowExample();
				obj.myMethod(1);
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
	}

}
