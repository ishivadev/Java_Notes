package practiceQuestions;

public class VowelsCount2 {

	public static void main(String []args)
	{
		
		String str = "welcome to java and selenium";
		
		str = str.replaceAll(" ", "").toLowerCase();
		
		int vowel = 0;
		int constant = 0;
		
		int a, e, i, o, u;
		a = e = i = o = u = 0;
		
		for(int j=0; j <= str.length()-1; j++)
		{
			char ch = str.charAt(j);
			
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			{
				vowel++;
				
				switch(ch) 
				{
					case 'a' : a++; break;
					case 'e' : e++; break;
					case 'i' : i++; break;
					case 'o' : o++; break;
					case 'u' : u++; break;
					default : break;
				}
				
			} else {
				constant++;
			}
		}
		
		
		System.out.println("Total vowels are : " + vowel);
		System.out.println("Total constants are : " + constant);
		
		System.out.println("a total count : " + a);
		System.out.println("e total count : " + e);
		System.out.println("i total count : " + i);
		System.out.println("o total count : " + o);
		System.out.println("u total count : " + u);
		
	}
	
}
