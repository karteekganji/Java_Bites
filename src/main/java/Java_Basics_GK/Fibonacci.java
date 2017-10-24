package Java_Basics_GK;


public class Fibonacci {
	
	 Integer range=10; 

	public static void main(String args[]) {
		//fibonacci  0 1 1 2 3 5 8 13 21 34
		
		Fibonacci fibonacci=new Fibonacci();
		System.out.println("0"+"1"+"1");
		fibonacci.printFibonacci(fibonacci.range);
	}
	void printFibonacci(Integer range){
		int x=0;
		int y=1;
		for(int i=1;i<=range;i++){
			int z=x+y;
			if(z!=1){
				System.out.print(z+" ");
			}
			x=y;
			y=z;
		}
		
		
	}

}
