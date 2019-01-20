package Java.Programs;

public class Nterms {

	
	// Printing series 1,4,27,256
	public static void main(String[] args) {
		int limit = 7;
		for (int i = 1; i <= limit; i++) {
			int count=1;
			for (int j = 1; j<=i; j++) {
				count = count*i;
			}
			System.out.print(count+",");
		}
	}
}
