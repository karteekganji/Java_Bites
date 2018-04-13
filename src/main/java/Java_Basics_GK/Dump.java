package Java_Basics_GK;


import java.util.ArrayList;
import java.util.Date;

public class Dump {

	public static void factorial(int number) {
		 int i,fact=1;  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
				
	
	
	public static void ArrayListExample() {
		ArrayList<String> arrlist = new ArrayList<String>();
		 arrlist.add("1");
		 arrlist.add("2");
		 System.out.println(arrlist);
		 System.out.println(arrlist.get(1));
		 String a = "USER_STORY_MARKED_AS_COMPLETED";
		 String b = a.toString().replaceAll("_", " ");
		 System.out.println(b);
	}
	public static void main(String[] args) {
	
		factorial(6);
	}
	
}
