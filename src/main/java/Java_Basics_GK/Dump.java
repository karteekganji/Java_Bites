package Java_Basics_GK;


import java.util.ArrayList;
import java.util.Date;

public class Dump {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>(2);
		 arrlist.add("1");
		 arrlist.add("2");
		 		Date date = new Date();
		 		
		 		long milli = date.getTime();

		 		System.out.println(milli);
		 System.out.println(arrlist);
		 System.out.println(arrlist.get(1));
		 String a = "USER_STORY_MARKED_AS_COMPLETED";
		 String b = a.toString().replaceAll("_", " ");
		 System.out.println(b);
		
		int i=1;
		int n = 10;
		         while(i<=n)
		         {
		             System.out.print("["+i+"]");
		              i++;
		         }
		

	}
	
}
