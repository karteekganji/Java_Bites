package Java.Programs;

import java.util.HashSet;
import java.util.Set;

public class EachCharacterOccurrencesInString {
	// Java implementation to print the character and
	// its frequency in order of its occurrence
	public static void printCharWithFreq(String str) {

		final int SIZE = 26;

		// function to print the character and its
		// frequency in order of its occurrence

		// size of the string 'str'
		int n = str.length();

		// 'freq[]' implemented as hash table
		int[] freq = new int[SIZE];

		// accumulate freqeuncy of each character
		// in 'str'
		for (int i = 0; i < n; i++)
			freq[str.charAt(i) - 'a']++;

		// traverse 'str' from left to right
		for (int i = 0; i < n; i++) {

			// if frequency of character str.charAt(i)
			// is not equal to 0
			if (freq[str.charAt(i) - 'a'] != 0) {

				// print the character along with its
				// frequency
				System.out.print(str.charAt(i));
				System.out.print(freq[str.charAt(i) - 'a'] + " ");

				// update frequency of str.charAt(i) to
				// 0 so that the same character is not
				// printed again
				freq[str.charAt(i) - 'a'] = 0;
			}
		}

		// Driver program to test above

	}

	public static void myImp1(String s) {
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
	
	public static void main(String args[]) {
		String str = "KarteekGanji".toLowerCase();
		printCharWithFreq(str);
	}
	// This code is contributed by Sumit Ghosh

}
