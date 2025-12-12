package practiceQuestions;

public class RemoveSpecialCharacterFromString {

	public static void main(String[] args) {
		
		String str = "Wel@#come! To$% Ja^&va123";
		
		
		// Approach 1
		String result = str.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(result);
		
		
		
		// Approach 2
		String words[] = str.split(" ");
	    String result1 = "";
		
	    for(String w : words)
	    {
	        result1 = result1 + w.replaceAll("[^a-zA-Z-0-9]","") + " ";
	    }
	            
	    System.out.println( result1 );
		
		
	}

}
