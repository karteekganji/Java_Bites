package Java.Programs;

import java.util.Arrays;

public class Anagrams {

	public static void isAnagramUsingStringMethods() {
		String word = "java2blog";
		String anagram = "aj2vabgol";
		if (word.length() != anagram.length())
			System.out.println("Is not an anagram");
		else {
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				int index = anagram.indexOf(c);
				// If index of any character is -1, then two strings are not anagrams
				// If index of character is not equal to -1, then remove the chacter from the
				// String
				if (index != -1) {
					anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
				} else
					System.out.println("Is not an anagram");
			}
			System.out.println("Is an anagram");
		}
	}

	static void isAnagram() {
		String str1 = "Keep";
		String str2 = "Peek";
		// isAnagram("Mother In Law", "Hitler Woman");
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {
		isAnagramUsingStringMethods();

	}

}
