package Java.RandomConcepts;

public class Recursion {

	    static void printFun(int test) 
	    { 
	        if (test < 1) 
	            return; 
	  
	        else { 
	            System.out.printf("%d ", test); 
	  
	            // Statement 2 
	            printFun(test - 1); 
	  
	            System.out.printf("%d ", test); 
	            return; 
	        } 
	    } 
	    
	static void fibonacci() {

		// 0, 1, 1, 2, 3, 5, 8, 13, 21

		int a, b, sum;
		a = 0;
		b = 1;
		System.out.print(a + " " + b);
		for (int i = 2; i < 9; i++) {
			sum = a + b;
			System.out.print(" " + sum);
			a = b;
			b = sum;
		}

	}
	  
	static void primenumber() {
		int num = 40; boolean prime = true; int val = 0;
		for (int i = 3; i <= num; i++) {
			for (int j = 2; j < i; j++) {
				if (i%j == 0)
					prime = false;
			}
			if (prime) {
				val++;
				System.out.print(i+" ");
			}else
				prime = true;
		}
			System.out.println();
			System.out.println(val);

	}
	
	static void polindrome() {
		
		String str = "abbabba"; String str2 = "";
		for (int i = str.length()-1; i >= 0; i--) {
		 str2 = str2+str.charAt(i);
		}
		if (str.equals(str2))
		System.out.println(str+": Is Polindrome");
		else
			System.out.println(str+": Is not a Polindrome");
		
	}
	
	
	    public static void main(String[] args) 
	    { 
	    	polindrome();
	    } 
}
