package practiceQuestions;

public class VowelCount {

	public static void main(String[] args) {
		
		String str = "welcome to java";
		
		str = str.replaceAll(" ", "").toLowerCase();
		
		int vowel = 0;
		int constant = 0;
		
		for(int i=0; i <= str.length()-1; i++)
		{
			char ch = str.charAt(i);
			
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			{
				vowel++;
			}
			else {
				constant++;
			}
		}
		
		System.out.println("Total vowels are : " + vowel );
		System.out.println("Total constants are : " + constant );
		

	}

}
