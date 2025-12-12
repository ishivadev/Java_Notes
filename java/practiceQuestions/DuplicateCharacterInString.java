package practiceQuestions;

import java.util.HashSet;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		
		String str = "Programming java";
		str = str.replaceAll(" ","").toLowerCase();
		
		char arr[] = str.toCharArray();
		
		HashSet<Character> set = new HashSet<>();
		HashSet<Character> duplicate = new HashSet<>();
		
		
		for( char ch : arr )
		{
			if( !set.add(ch) )
			{
				duplicate.add(ch);
			}
		}
		
		
		System.out.println("Duplicate characters are : " + duplicate);

	}

}
