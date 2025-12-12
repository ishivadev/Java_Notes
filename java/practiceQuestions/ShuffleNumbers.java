package practiceQuestions;

import java.util.Arrays;

public class ShuffleNumbers {

	    public static void main(String[] args) {

	        String s = "1101010010100111";
	        char a[] = s.toCharArray();
	        char r[] = new char[s.length()];

	        int left = 0;	// for zero's
	        int right = s.length() - 1;		// for one's

	        for (int i = 0; i < a.length; i++) 
	        {
	            if (a[i] == '0') 
	            {
	                r[left] = '0';
	                left++;
	            } 
	            else if (a[i] == '1') 
	            {
	                r[right] = '1';
	                right--;
	            }
	        }

	        System.out.println(Arrays.toString(r));
	        
	  }
}


