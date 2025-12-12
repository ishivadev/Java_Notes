package practiceQuestions;

public class LargestNoInArray {

	public static void main(String[] args) {
		
		int arr[] = {3, 4, 1, 3, 5, 6, 9, 2, 5};
		int max = arr[0];
		
		// for loop
		for(int i=0; i <= arr.length-1; i++)
		{
			if( max < arr[i])
			{
				max = arr[i];
			}
		}
		
		
		// for...each loop
		/*
		for(int n : arr)
		{
			if(max < n)
			{
				max = n;
			}
		}
		*/
		
		System.out.println("The largest no is " + max);
		
 
	}

}
