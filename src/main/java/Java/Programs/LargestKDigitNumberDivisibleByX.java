package Java.Programs;

public class LargestKDigitNumberDivisibleByX {

	public static double answer(double X, double K) 
	  { 
	      double i = 10; 
	      // Computing MAX 
	      double MAX = Math.pow(i, K) - 1; 

	      // returning ans 
	      return (MAX - (MAX % X)); 
	  } 
	
	public static void main(String[] args) {
		 // Number whose divisible is to be found 
	     double X = 11; 

	     // Max K-digit divisible is to be found 
	     double K = 10; 

	     System.out.println((int)answer(X, K)); 

	}

}
