package practiceQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num = 8;	// till which series Fibonacci series required
		int n1 = 0;
		int n2 = 1;
		int m = 0;
		
		for(int i=0; i <= num; i++)
		{
			m = n1 + n2;
			
			n1 = n2;
			n2 = m;
			
			System.out.print(m + ", ");
		}
		
		
		// Approach 2 - with 0 and 1
		/*
		System.out.print(n1 + ", " + n2 + ", ");
		
		for(int i=0; i <= num; i++)
		{
			m = n1 + n2;
			
			n1 = n2;
			n2 = m;
			
			System.out.print(m + ", ");
		}
		*/
		
	}
}
