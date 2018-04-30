//Using if else condition to comparing two numbers

package Java.Practice;
import java.util.Scanner;
public class Ifcondition{
	public static void main(String s[]){
			Scanner input=new Scanner(System.in);
			double a,b,c;
			System.out.println("Enter a value: ");
			a=input.nextDouble();
			System.out.println("Enter b value: ");
			b=input.nextDouble();
			System.out.println("Enter c value: ");
			c=input.nextDouble();
			if ((a+b)>=c) {
				System.out.println("OK");
			}
			else{
				System.out.println("No");	
				}
					
	}
				 
}

