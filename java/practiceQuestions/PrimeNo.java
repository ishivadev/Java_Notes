package practiceQuestions;

public class PrimeNo {

	public static void main(String[] args) {
		
		// Which is divisible by 1 and with himself only. Like 3, 7, 11, 13
		
		int n = 7;
		boolean isPrime = true;
		
		if( n <= 1 )
		{
			System.out.println("1 is already a Prime no. Try with other no.");
		} else 
		{
			for(int i=2; i < n; i++)
			{
				if(n % i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		
		
		if(isPrime)
		{
			System.out.println("It is a Prime no.");
		} else 
		{
			System.out.println("It is NOT a Prime no.");
		}
		

	}

}
