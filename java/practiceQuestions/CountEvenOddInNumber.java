package practiceQuestions;

public class CountEvenOddInNumber {

	public static void main(String[] args) {
		
		int n = 7321568;
		int even = 0;
		int odd = 0;

		// Approach 1 - using while loop
		while( n > 0)
		{
			if( n % 2 == 0 )
			{
				even++;
			}
			else {
				odd++;
			}
			
			n = n / 10;
		}
		
		System.out.println("Even count : " + even);
		System.out.println("Odd count : " + odd);
		
		
		
		/*
		// Approach 2 - converting the int into string
		//int len = String.valueOf(n).length();	// len = 7
		
		String s = String.valueOf(n);
		int len = s.length();
		
		for(int i=0; i < len; i++)
		{
			if( s.charAt(i) % 2 == 0  )
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.println("Even count : " + even);
		System.out.println("Odd count : " + odd);
		*/
	}

}
