package Java_Basics;

public class DataTypes {
	
	/*
	 * 1) Primitive data types 
	 * 2) Non-primitive data types – Arrays and Strings are non-primitive data types
	 */
	
	/*
	 * 1) Primitive data types
	 * 
	 * In Java, we have eight primitive data types: boolean, char, byte, short,
	 * int, long, float and double. Java developers included these data types to
	 * maintain the portability of java as the size of these primitive data
	 * types do not change from one operating system to another.
	 */
	
	/*
	 * byte, short, int and long data types are used for storing whole numbers.
	 * 
	 * float and double are used for fractional numbers.
	 * 
	 * char is used for storing characters(letters).
	 * 
	 * boolean data type is used for variables that holds either true or false.
	 */
	public static void primitiveDataTypes() {
		
		/*
		 * byte: This can hold whole number between -128 and 127. Default size of this data type: 1byte. Default value: 0
		 */
		byte num;
    	
    	num = 113;
    	
		/*
		 * short: Its range is -32,768 to 32767. Default size of this data type: 2 byte
		 */
    	short num1 = 32767;
    	
		/*
		 * int: It has a wider range: -2,147,483,648 to 2,147,483,647. Default size: 4 byte Default value: 0
		 */
    	int num2 = 2147483647;
		/*
		 * long: Ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. size: 8 bytes Default value: 0
		 */
    	long num3 = 12332252626L;
    	
		/*
		 * double: Sufficient for holding 15 decimal digits size: 8 bytes
		 */
    	double num4 = 42937737.9d;
		/*
		 * float: Sufficient for holding 6 to 7 decimal digits size: 4 bytes
		 */
    	float num5 = 19.98f;
		/*
		 * char: holds characters. size: 2 bytes
		 */
    	char ch = 'Z';
    	
    	boolean b = false;
    	
    	System.out.println();
	}
	public static void main(String[] args) {
		primitiveDataTypes();
		
		
	}

}
