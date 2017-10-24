package Java_Basics_GK;

public class Primenumber_Dvd {

	public static void main(String[] args) {
	

		int num1=5;
		int count=0;
		String result = "";
		for(int i=1;i<=num1;i++){
			if(num1%i==0){
				count=count+1;
			}
			if(count>2){
				result="not Prime";
				break;
			}
			else{
				result="is Prime";
			}
		}
		System.out.println(result);
	}
	}
			
