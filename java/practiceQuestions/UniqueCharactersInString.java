package practiceQuestions;

import java.util.HashSet;

public class UniqueCharactersInString {

	public static void main(String[] args) {
		
		String str = "welcome to java";
		boolean unique = true;
		
		HashSet<Character> myset = new HashSet<>();
		char newchar[] = str.toCharArray();
		
		for(char ch : newchar)
		{
			if( myset.contains(ch) )
			{
				unique = false;
				break;
			}
			
			myset.add(ch);
		}
		
		
		if(unique)
		{
			System.out.println("String has all unique character.");
		} 
		else {
			System.out.println("String does not have all unique character.");
		}
		

	}

}
