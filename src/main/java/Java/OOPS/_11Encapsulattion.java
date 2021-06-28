package Java.OOPS;


public class _11Encapsulattion {
	
	/**
	 * Encapsulation : 
	 * 
	 * Encapsulation simply means binding object state(fields) and
	 * behavior(methods) together. If you are creating class, you are doing
	 * encapsulation.
	 * 
	 * Encapsulation in java is a process of wrapping code and data together into a single unit, for example capsule i.e. mixed of several medicines.
	 * 
	 * By providing only setter or getter method, you can make the class read-only or write-only.
	 * 
	 * So what is the benefit of encapsulation in java programming Well, at some
	 * point of time, if you want to change the implementation details of the
	 * class EmployeeCount, you can freely do so without affecting the classes
	 * that are using it.
	 */
	// Encapsulation Example :
	
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

	public static void main(String[] args) {
		
		

	}

}
