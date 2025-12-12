package practiceQuestions;

public class LeapYear {

	public static void main(String[] args) {
		
		// Divisible by 400
		// Divisible by 4 and NOT divisible by 100
		
		int n = 2016;
		
		if( (n % 400 == 0) || (n % 4 == 0    &&    n % 100 != 0) )
		{
			System.out.println(n + " is a Leap year.");
		} else
		{
			System.out.println(n + " is NOT a Leap year.");
		}
			

	}

}
