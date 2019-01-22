package Java.Programs;

public class Nterms {
	static int limit = 6;

	// Printing series 1,4,9,16 | 1,8,27,64
	public static void Series1() {
		int power = 3;
		for (int i = 1; i <= limit; i++) {
			int value = 1;
			for (int j = power; j > 0; j--) {
				value = i * value;
			}
			System.out.print(value + ",");
		}

	}

	// Printing series 1,4,27,256
	public static void Series3() {
		for (int i = 1; i <= limit; i++) {
			int value = 1;
			for (int j = i; j > 0; j--) {
				value = i * value;
			}
			System.out.print(value + ",");
		}

	}

	public static void main(String[] args) {
		Series3();
	}
}
