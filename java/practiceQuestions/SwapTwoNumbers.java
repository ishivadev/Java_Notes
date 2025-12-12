package practiceQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		// Approach 1 - using third variable
		int a = 4;
		int b = 6;
		int c = 0;
		
		c = b;
		b = a;
		a = c;
		
		System.out.println("A is : " + a + " " + " and the B is : " + b);
		
		
		
		// Approach 2 - without using third variable
		
		int m = 5;
		int n = 13;
		
		n = n + m;	// n = 18
		m = n - m;  // m = 13
		n = n - m;	// n = 5
		
		System.out.println("M is : " + m + " " + " and the N is : " + n);
		
	}

}
