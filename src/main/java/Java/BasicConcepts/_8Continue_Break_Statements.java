package Java.BasicConcepts;

public class _8Continue_Break_Statements {

	/*
	 * Continue statement is mostly used inside loops. Whenever it is
	 * encountered inside a loop, control directly jumps to the beginning of the
	 * loop for next iteration, skipping the execution of statements inside
	 * loop’s body for the current iteration. This is particularly useful when
	 * you want to continue the loop but do not want the rest of the
	 * statements(after continue statement) in loop body to execute for that
	 * particular iteration.
	 */

	public static void continue_Statement_For_Loop() {

		for (int j = 0; j <= 6; j++) {
			if (j == 4) {
				continue;
			}
			System.out.print(j + " ");
			
		}

		/*
		 * Output: 0 1 2 3 5 6 As you may have noticed, the value 4 is missing
		 * in the output, why? because when the value of variable j is 4, the
		 * program encountered a continue statement, which makes it to jump at
		 * the beginning of for loop for next iteration, skipping the statements
		 * for current iteration (that’s the reason println didn’t execute when
		 * the value of j was 4).
		 */

	}

	public static void continue_Statement_While_Loop() {

		int counter = 10;
		while (counter >= 0) {
			if (counter == 7) {
				counter--;
				continue;
			}
			System.out.print(counter + " ");
			counter--;
		}
	}

	public static void continue_Statement_Do_While_Loop() {

		int j = 0;
		do {
			if (j == 7) {
				j++;
				continue;
			}
			System.out.print(j + " ");
			j++;
		} while (j < 10);
	}

	public static void break_Statement_While_Loop() {
		int num = 0;
		while (num < 100) {
			System.out.println("Value of variable is: " + num);
			if (num == 3) {
				break;
			}
			num++;

		}
		System.out.println("Out of while-loop");
	}

	public static void break_Statement_For_Loop() {
		int var;
		for (var = 100; var >= 10; var--) {
			System.out.println("var: " + var);
			if (var == 99) {
				break;
			}
		}
		System.out.println("Out of for-loop");
	}

	public static void main(String[] args) {
//		break_Statement_For_Loop();
		continue_Statement_For_Loop();

	}

}
