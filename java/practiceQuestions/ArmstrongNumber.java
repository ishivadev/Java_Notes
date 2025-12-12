package practiceQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153;		// 1³ + 5³ + 3³ = 153	(1 + 125 + 27)
		int temp = num;
		int sum = 0;
		
		while( temp > 0 )
		{
			int digit = temp % 10;
			sum = sum + digit * digit * digit;
			temp = temp / 10;
		}
		
		
		if( num == sum )
		{
			System.out.println(num + " is a Armstring number.");
		} else {
			System.out.println(num + " is a NOT Armstring number.");
		}
		

	}

}
