package practiceQuestions;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		        
		        String str = "swiss";
		        
		        char chararr[] = str.toCharArray();
		        
		        int[] freq = new int[256];  // ASCII frequency
		        
		        // Count frequency
		        for (char c : chararr) {
		            freq[c]++;
		        }
		        
		        // Find first non-repeated
		        for (char c : chararr) {
		            if (freq[c] == 1) {
		                System.out.println("First non-repeated: " + c);
		                return;
		            }
		        }
		        
		        System.out.println("No non-repeated character.");
		    
		


	}

}
