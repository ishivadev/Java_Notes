package practiceQuestions;

public class PalindromeNo {

	public static void main(String[] args) {
		
		int n = 121;
		int org = n;
		int rev = 0;
		
		while(n % 10 != 0)
		{
			int dg = n % 10;
			rev = rev * 10 + dg;
			n = n / 10;
		}
		
		
		if(org == rev)
		{
			System.out.println("It is a Palindrome no.......");
		} else
		{
			System.out.println("It is NOT a Palindrome no.");
		}
		

	}

}
