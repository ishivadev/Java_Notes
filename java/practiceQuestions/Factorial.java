package practiceQuestions;

public class Factorial {

	public static void main(String[] args) {
		
		int n = 5;		// 1 x 2 x 3 x 4 x 5	// 120
		int fact = 1;
		
		for(int i=1; i <= n; i++)
		{
			fact = fact * i;
		}

		System.out.println(fact);	// 120
		
	}

}
