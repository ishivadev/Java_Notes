package practiceQuestions;

import java.util.Arrays;

public class ReverseCharacterOfEachWord {

	public static void main(String[] args) {
		
		String str = "Welcome to java";
		
		// Approach 1
		String words[] = str.split(" ");
	       
	    StringBuilder result = new StringBuilder();
	       
	    for(String w : words)
	    {
	        String s = new StringBuilder(w).reverse().toString();
	           
	        result.append(s).append(" ");
	    }
	       
	    System.out.println(result.toString());
		
	    
	       
		/*
		// Approach 2
		String words[] = str.split(" ");
		String result = "";
		
		for(String w : words)
		{
			String rev = "";
			
			for(int i = w.length()-1; i >= 0; i--)
			{
				rev = rev + w.charAt(i);
			}
			
			result = result + rev + " ";
		}
		
		
		System.out.println(result.trim());
		*/

	}

}
