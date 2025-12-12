package day9_StringExample;

public class CharracterIndexLocationInString {

	public static void main(String[] args) {
		
		String s = "welcome java";
		char c = 'x';
		
		for(int i=0; i <= s.length()-1; i++)
		{
			if(c == s.charAt(i))
			{
				System.out.println(c + " is present in " + (i+1) + " index postion.");
			}
		}
		
		System.out.println(c + " is NOT present in the string.");

	}

}
