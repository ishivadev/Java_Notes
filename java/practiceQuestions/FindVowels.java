package practiceQuestions;

public class FindVowels {

	public static void main(String[] args) {
		
		String str = "Welcome to Java";
		int count = 0;
		char ch;
		
		str = str.toLowerCase();
		
		for(int i=0; i <= str.length() - 1; i++)
		{
			ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		}
		
		System.out.println(count+ " vowels are present in string.");
		
	}

}
