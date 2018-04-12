package Java_Basics;

public class _9OOPs_Concepts {
	
	/*
	 * The primary purpose of object-oriented programming is to increase the
	 * flexibility and maintainability of programs. Object oriented programming
	 * brings together data and its behaviour(methods) in a single
	 * location(object)
	 */
	// objects” that contain data and methods.
	
	/* Object: is a bundle of data and its behaviour(often known as methods) */
	
	// Example : OOPS Concepts
	public static class Website {
		// fields (or instance variable)
		String webName;
		int webAge;

		// constructor
		Website(String name, int age) {
			this.webName = name;
			this.webAge = age;
		}

		public static void main(String args[]) {
			// Creating objects
			Website obj1 = new Website("beginnersbook", 5);
			Website obj2 = new Website("google", 18);

			// Accessing object data through reference
			System.out.println(obj1.webName + " " + obj1.webAge);
			System.out.println(obj2.webName + " " + obj2.webAge);
		}
	}
	
	public static class EmployeeCount {
		private int numOfEmployees = 0;

		public void setNoOfEmployees(int count) {
			numOfEmployees = count;
		}

		public int getNoOfEmployees() {
			return numOfEmployees;
		}
	}

	public static class EncapsulationExample {
		public static void main(String args[]) {
			EmployeeCount obj = new EmployeeCount();
			obj.setNoOfEmployees(5613);
			System.out.println("No Of Employees: " + obj.getNoOfEmployees());
		}
	}

}
