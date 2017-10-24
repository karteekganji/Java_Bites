package Java_Basic_Bites;

public class Variable_Local {

	// Java Local Variables - Example Program
	void printMarks() {
		int marks = 0;
		marks = marks + 96;
		System.out.println("Marks : "+marks);
	}

	public static void main(String[] args) {
		Variable_Local vl = new Variable_Local();
		vl.printMarks();
	}

}
