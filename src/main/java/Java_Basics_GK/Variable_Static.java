package Java_Basics_GK;

public class Variable_Static {

	private static String studname; // this is a private, static variable
	public static final String studbranch = "MME"; // constant variable

	public static void main(String[] args) {
		studname = "Karteek"; // For STATIC varible no need to create object we can use it directly inside the class
		System.out.println("Student Name is : "+studname+" and Branch is : "+studbranch);

	}
}
