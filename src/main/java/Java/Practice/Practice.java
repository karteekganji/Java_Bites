package Java.Practice;

import java.util.ArrayList;

public class Practice {

	public void lists_display(){
		ArrayList a=new ArrayList();
		System.out.println(a.size());
		a.add("Hey");
		a.add("hi");
		a.add("hello");
		System.out.println(a.size());
		System.out.println(a);
		System.out.println(a.contains("hi"));
		a.remove(2);
		System.out.println(a);
		
		String b="hello india";
		System.out.println(b.toUpperCase());
		
		System.out.println(b.endsWith("ia"));
		System.out.println(b.charAt(7));
	}
	
		public void Exceptions(){// Exception Handling
		try {
			int d = 0;
		      int n =20;
		      int fraction = n/d;
			System.out.println(fraction);
		} catch (ArithmeticException e) {
			System.out.println(e);
			int c=10;
			int d=11;
			System.out.println(c+d);
		}
		
		 try{
		       int d = 0;
		       int n =20;
		       int fraction = n/d;
		    }
		  catch(ArithmeticException e){
		    System.out.println(e);
		  }
		  finally{
		  System.out.println("Inside the finally block");
		  }
		}
		 
		public void randomnumber(){//random number display
		System.out.println(Math.random());
		}
		
		public void switch_default(){// switch default methods
		int score=4;
		switch (score) {
		case 4:
		System.out.println("Score is 1");
		break;
		case 1:
		System.out.println("Score is 2");
		break;
		default:
		System.out.println("Default Case");
		}
		}
		
		
		
	    
		int  value1;
 	    int  value2;
 	    Practice(){
 	         value1 = 10;
 	         value2 = 20;
 	         System.out.println("Inside Constructor");
 	         }
	     public void display(){
	        System.out.println("Value1 === "+value1);
	        System.out.println("Value2 === "+value2);
	    
	    }
	  
	      int  value3;
	      int  value4;
	      
	     Practice(int a){
	      value3 = a;
	      System.out.println("Inside 2nd Constructor");
	    }
	    Practice(int a,int b){
	    value3 = a;
	    value4 = b;
	    System.out.println("Inside 3rd Constructor");
	   }
	   public void display2(){ //it will take default value of an integer
	      System.out.println("Value1 === "+value3);
	      System.out.println("Value2 === "+value4);
	  }
	  public void display3(){
		  Practice d1=new Practice();
		  Practice d2=new Practice(30);
		  Practice d3=new Practice(30,40);
		  d1.display();
		  d2.display();
		  d3.display();
	  }
	  
	public static void main(String s[]){		//By using Constructor and creating object
		 }
	}
		 
		 	
		
		
	


	
	
		
		
	

	
			
			
			
			
		
				
				
			
			
		
		
	
	
		
	
		
		
		
		
	
	
	
	

		
		
	
