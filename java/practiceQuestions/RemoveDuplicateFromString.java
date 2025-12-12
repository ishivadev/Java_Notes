package practiceQuestions;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		String str = "programming java";
		String result = "";
		
		for(int i=0; i <= str.length()-1; i++)
		{
			char ch = str.charAt(i);
			
			if( result.indexOf(ch) == -1 )
			{
				result = result + str.charAt(i);
			}
		}
		
		System.out.println(result);

		
		/*
		// if multiple words are available
		String arr[] = str.split(" ");
        
        for(String s : arr)
        {
            for(int i=0; i <= s.length()-1; i++)
            {
                char ch = s.charAt(i);
                
                if(  result.indexOf(ch) == -1 )
                {
                    result = result + s.charAt(i);
                }
            }
             result = result + " ";
        }
        */
		
	}

}
