package practiceQuestions;

import java.util.HashMap;
import java.util.Arrays;

public class CountCharacterInString {

	static void testCount(String str)
	{
		str = str.replace(" ", "");
		
		char charStr[] = str.toCharArray();
		
		HashMap<Character, Integer> mymap = new HashMap<>();
		
		for(char ch : charStr)
		{
			if( mymap.containsKey(ch) )
			{
				mymap.put(ch, mymap.get(ch) + 1 );
			}
			else {
				mymap.put(ch, 1);
			}
		}
		
		
		for(char c : mymap.keySet())
		{
			System.out.println( c + " : " + mymap.get(c)  );
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "welcome to java";
		
		testCount(str);
		/*
		 	Output:-
		 	a : 2
			c : 1
			t : 1
			e : 2
			v : 1
			w : 1
			j : 1
			l : 1
			m : 1
			o : 2
		 */
		
	}

}
