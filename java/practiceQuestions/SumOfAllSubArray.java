package practiceQuestions;

public class SumOfAllSubArray {

	public static void main(String[] args) {
		
		/*
		 Subarrays:
			1 → 1
			1+2 → 3
			1+2+3 → 6
			
			2 → 2
			2+3 → 5
			
			3 → 3
			Total = 20
		 */
		
		
		
		int arr[] = {1, 2, 3};
		int total = 0;
		
		for(int i=0; i < arr.length; i++)
		{
			int sum = 0;
			
			for(int j=i; j < arr.length; j++)
			{
				sum = sum + arr[j];
				total = total + sum;
			}
		}

		System.out.println("Sum of all sub-arrays is : " + total);
		
	}

}
