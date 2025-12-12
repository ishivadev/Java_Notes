package practiceQuestions;

public class SubStringOfString {

	public static void main(String[] args) {

		String s = "abcd";
		
		for(int i = 0; i <= s.length()-1; i++)
		{
			for(int j = i+1; j <= s.length(); j++)
			{
				System.out.println(s.substring(i, j));
			}
		}
		
		/*
		 Output:-
		 ab
		 abc
		 abcd
		 b
		 bc
		 bcd
		 c
		 cd
		 d
		 
		 */
		
	}

}
