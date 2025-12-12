package practiceQuestions;

public class SecondLargestNoInArray {

	public static void main(String[] args) {
		
		int arr[] = {4, 5, 2, 8, 6, 9, 11, 7, -5, -4, 6};
		
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		
		for(int n : arr)
		{
			if( n > max )
			{
				secondmax = max;
				max = n;
			}
			else if( n > secondmax && n != max )
			{
				secondmax = max;
			}
		}
		
		
		System.out.println("The second largest no is : " + secondmax);
	}

}
