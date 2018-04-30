package Java.Practice;

public class Variable_Instance {
	public String studname; // this instance variable is visible for any child class
							
	private String studbranch; // this instance variable is only visible to the JavaProgram class
								

	public Variable_Instance(String name) {
		studname = name;
	}

	public void initializeBranch(String branch) {
		studbranch = branch;
	}

	public void printStudent() {
		System.out.println("Student name : " + studname);
		System.out.println("Student Branch : " + studbranch);
	}

	public static void main(String[] args) {

		Variable_Instance out1 = new Variable_Instance("Karteek");
		out1.initializeBranch("MME");
		out1.printStudent();
		Variable_Instance out2 = new Variable_Instance("David");
		out2.initializeBranch("ECE");
		out2.printStudent();
	}

}
