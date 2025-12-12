package practiceQuestions;

public class LargestOfThreeNo {

	public static void main(String[] args) {
		
		// a > b, a > c 	-->		a is largest
		// b > a, b > c		--> 	b is largest
		
		int a = 20;
		int b = 25; 
		int c = 15;
		
		// Approach 1
		if( a > b )
		{
			if ( a > c )
			{
				System.out.println("A is largest no.");
			}
			else {
				System.out.println("C is largest no.");
			}
		}
		else if( b > c)
		{
			System.out.println("B is largest no.");
		}
		else {
			System.out.println("C is largest no.");
		}
		
		
		// Approach 2
		if( a > b && a > c)
		{
			System.out.println("A is largest no.");
		}
		else if( b > a && b > c)
		{
			System.out.println("B is largest no.");
		}
		else {
			System.out.println("C is largest no.");
		}
		
	}

}
