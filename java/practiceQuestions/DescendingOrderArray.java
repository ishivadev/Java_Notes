package practiceQuestions;

import java.util.Arrays;

public class DescendingOrderArray {

	public static void main(String[] args) {
		
		int arr[] = {3, 2, 6, 1, 4, 7, 9, 5, 8};
		int temp = 0;
		
		for(int i=0; i <= arr.length-1; i++)
		{
			for(int j=i+1; j <= arr.length-1; j++)
			{
				if( arr[i] < arr[j] )
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(arr));

	}

}
