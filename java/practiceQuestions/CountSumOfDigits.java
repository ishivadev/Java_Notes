package practiceQuestions;

public class CountSumOfDigits {

	public static void main(String[] args) {
		
		int n = 34512;
		int org = n;
		int sum = 0;
		
		while( n > 0)
		{
			int r = n % 10;
			sum = sum + r; 
			
			n = n / 10;
		}
		System.out.println("Sum of the " + org + " is : " + sum);
	}

}
