package Java_Basics_GK;

public class Java_TypeCasting {

	public static void main(String[] args) {
		 byte b;
	        int i = 257;
	        double d = 323.142;
	        
	        System.out.println("Conversion of int to byte.");
	        b = (byte) i;
	        System.out.println("i is " + i + " and b is " + b);
	        
	        System.out.println("\nConversion of double to int.");
	        i = (int) d;
	        System.out.println("d is " + d + " and i is " + i);
	        
	        System.out.println("\nConversion of double to byte.");
	        b = (byte) d;
	        System.out.println("d is " + d + " and b is " + b);
	        
	}

}
