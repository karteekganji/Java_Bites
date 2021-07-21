package Java.Practice;

import java.util.HashSet;
import java.util.Set;

public class Objects {

	int num1;
	int num2;
	static int result;
	
	public Objects() {
		result++;
		System.out.println(result);
	}
	
	public static void sumOfAllNumbers() {
		
		int num = 555;
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			sum = sum+rem;
		}
		System.out.println(sum);
	}
	
	public static void removeMultipleSpacesInString() {
		String ab = "Hello    I    am  Karteek Ganji   applied for  this   job";
		System.out.println(ab.replaceAll(" +", ""));
	}
	
	public static void Occurence() {
		String s = "KarteekGanji".toLowerCase();
		char[] chArr = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (Character character : chArr) {
			set.add(character);
		}
		int count = 0;
		for (Character character : set) {
			for (int j = 0; j < chArr.length; j++) {
				if (character==chArr[j]) {
					count++;
				}
			}
		System.out.print(character +""+count+" ");
		count =0;
		}
	}
	
	public static void doubleChar() {
		String str = "Karteek";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result = result + str.charAt(i) + str.charAt(i);
		}

		System.out.println(result);

	}
	
	public boolean catDog(String str) {
		  
		  int len = str.length();
		  int cat=0;
		  int dog=0;
		  for(int i = 0; i<len-2; i++){
		    if(str.substring(i,i+3).equals("cat"))
		    cat++;
		    if(str.substring(i,i+3).equals("dog"))
		    dog++;
		  }
		  if(cat==dog)
		  return true;
		  else
		  return false;
		  
		}
	
	
	public int countCode(String str) {
		  int count = 0;
		  int len = str.length();
		  for(int i=0; i<len-3;i++){
		    if(str.substring(i,i+3).equals("code")||(str.substring(i,i+2).equals("co")&&(str.charAt(i+3)=='e')))
		    count++;
		    else
		    count = 0;
		    
		  }
		  return count;
		}

	
	public static void main(String[] args) {
		/*Objects obj1 = new Objects();
		Objects obj2 = new Objects();

		obj1.result = 10;
		obj2.result = 20;
		System.out.println(obj1.result+"--"+obj2.result);*/
		
		Occurence();
		
	}
	
	

}
