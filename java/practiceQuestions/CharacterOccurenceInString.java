package practiceQuestions;

public class CharacterOccurenceInString {

	public static void main(String[] args) {
		
		String str = "Java selenium playworght study elephant selenium";
		char a = 'e';
		int count = 0;
		
		for(int i=0; i <= str.length()-1; i++)
		{
			if(a == str.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println("The " + a + " is occured " + count + " times in the string.");
		
		
	}

}
