package Java_Basics_GK;

import java.util.Scanner;

public class Pass_Fail_UsingMultiple_variables {
	public static void main(String s[]){
		Scanner marks=new Scanner(System.in);
		int maths,physics,chemistry;
		System.out.println("Enter maths marks: ");
		maths=marks.nextInt();
		System.out.println("Enter Physics marks: ");
		physics=marks.nextInt();
		System.out.println("Enter Chemistry marks: ");
		chemistry=marks.nextInt();
		if(maths>=35 && physics>=35 && chemistry>=35){
			System.out.println("Passed");
		}else{
				System.out.print("Failed");
			
		}
	}
}
	