//Division of decimal numbers
package Java_Basics_GK;

import java.util.Scanner;
public class Double{

	public static void main(String []args){
		Scanner obj=new Scanner(System.in);
		
		double a,b,c;
	
	
	System.out.println("Ente a num: ");
	a = obj.nextDouble();
	System.out.println("Ente another num: ");
	b = obj.nextDouble();
	 
	c= a/b;
	System.out.println("The value is: " +c);		
	}

}
