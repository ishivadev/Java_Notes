package day9_StringExample;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		
		// Approach 1  -  string method
		String str = "   Java    selenium   playworght   study  ";
			
		str = str.replace(" ", "");
		
		System.out.println("String after removing the Spaces : " + str);
		
		
		
		// Approach 2  - string method with regular expression
		String str1 =  "   Java    selenium   playworght   study  ";
		
		str1.replaceAll("\\s", str1);
		
		System.out.println("String after removing the Spaces : " + str);
		
		
		
		// Approach 3  -  using for loop
		String str2 =  "   Java    selenium   playworght   study  ";
		
		String result = "";
		
		for(int i=0; i <= str2.length()-1; i++)
		{
			if( str2.charAt(i) != ' ' )
			{
				result = result + str2.charAt(i);
			}
		}
		
		System.out.println(result);
		
	}

}
