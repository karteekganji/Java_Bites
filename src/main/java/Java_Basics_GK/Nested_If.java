	//Using NESTED_IF
package Java_Basics_GK;
import java.util.Scanner;
public class Nested_If {
		public static void main(String s[]){
				Scanner Do=new Scanner(System.in);
				int age;
				System.out.println("Enter age: ");
				age=Do.nextInt();
				
				if(age>=18){
				System.out.println("Yoc can Vote!");
				}else{
				System.out.println("You have to wait!");
				
				if(age>10){
					System.out.println("You are too young");
				}else{
					System.out.println("Not eligible to vote");	
					
				}
				}
			}
		}
			
