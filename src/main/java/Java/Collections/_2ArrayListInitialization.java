package Java.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class _2ArrayListInitialization {

	// Method 1: Initialization using Arrays.asList

	public static class InitializationExample1 {
		public static void main(String args[]) {
			ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Pratap", "Peter", "Harsh"));
			System.out.println("Elements are:" + obj);
		}
	}
	
}
