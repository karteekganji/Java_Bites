package Java.Programs;

import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumberString {
	
	public static Random random = new Random();
	public static Scanner scan = new Scanner(System.in);

	public static void RandomNumberByGivenRange() {
		
		System.out.println("Enter form value : ");
		int from = scan.nextInt();
		int result = random.nextInt(from);
		System.out.println(result);
	}
	//Random String by Given length with given characters
	
	public static String generatePhonenumber() {
		return RandomStringUtils.randomNumeric(10);
	}
	
	//Random String/Number by Given length with given characters
	
	public static String RandomString() {
		return RandomStringUtils.random(6, "abcdefghijklmnopqrstuvwxyz");
	}
	
	
}
