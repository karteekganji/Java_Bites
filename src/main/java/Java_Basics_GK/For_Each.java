package Java_Basics_GK;

public class For_Each {

		// TODO Auto-generated method stub
		
		/*int[] marks = { 125, 132, 95, 116, 110 };
		
		for (int i : marks) {
			System.out.println(i);*/
			
			// Java program to illustrate 
			// for-each loop
	
	
	public static void main(String[] arg) {
		
		int marks[] = {34,56,65,104,78,99,67,54};
		
		int maxint = marks[0];
		
		for (int maxint1 : marks) {
			if (maxint1>maxint) {
				maxint = maxint1;
			}
			
		}
		System.out.println("Highest number : "+maxint);
	}
	
}
	

