package Java_Basics;

public class _6SwitchCase {
	
	/*
	 * Switch case statement is used when we have number of options (or choices)
	 * and we may need to perform a different task for each choice.
	 * 
	 * Switch Case statement is mostly used with break statement even though it is optional.
	 */	
	
	public static void switchCase() {

		int num = 2;
		switch (num + 2) {
		case 1:
			System.out.println("Case1: Value is: " + num);
		case 2:
			System.out.println("Case2: Value is: " + num);
		case 3:
			System.out.println("Case3: Value is: " + num);
		default:
			System.out.println("Default: Value is: " + num);
		}

	}
	
	public static void switchCaseWithBreak() {
		/*
		 * Break statements are used when you want your program-flow to come out
		 * of the switch body. Whenever a break statement is encountered in the
		 * switch body, the execution flow would directly come out of the
		 * switch, ignoring rest of the cases
		 */		
		
		int i = 2;
		switch (i) {
		case 1:
			System.out.println("Case1 ");
			break;
		case 2:
			System.out.println("Case2 ");
			break;
		case 3:
			System.out.println("Case3 ");
			break;
		case 4:
			System.out.println("Case4 ");
			break;
		default:
			System.out.println("Default ");
		}

		char ch = 'y';
		switch (ch) {
		case 'd':
			System.out.println("Case1 ");
			break;
		case 'b':
			System.out.println("Case2 ");
			break;
		case 'x':
			System.out.println("Case3 ");
			break;
		case 'y':
			System.out.println("Case4 ");
			break;
		default:
			System.out.println("Default ");
		}
	}

	public static void main(String[] args) {
		switchCaseWithBreak();
	}

}
