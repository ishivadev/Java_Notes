package practiceQuestions;

import java.util.Arrays;

public class CheckAnagramString {

	public static void main(String[] args) {
		
		String s1 = "silent";	
		String s2 = "listen";	
		// String s1 = "earth";
		// String s2 = "heart";
		
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		//System.out.println("a : " + Arrays.toString(a) + "\n" + "b : " + Arrays.toString(b));
		
		if(Arrays.equals(a, b))
		{
			System.out.println("Both strings are Anagram.");
		} else {
			System.out.println("Both strings are NOT Anagram.");
		}
		

	}

}
