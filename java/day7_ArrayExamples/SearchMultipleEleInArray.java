package day7_ArrayExamples;

public class SearchMultipleEleInArray {

	public static void main(String[] args) {
		
		/*
		// Approach 1
		
		int arr[] = {20, 25, 55, 15, 50, 60, 40, 95, 5, 80};
		int search_ele1 = 55;
		int search_ele2 = 5;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(search_ele1 == arr[i])
			{
				System.out.println(search_ele1 + " Element found.");
			}
			else if(search_ele2 == arr[i])
			{
				System.out.println(search_ele2 + " Element found.");
			}
		}
		*/
		
		
		
		// Approach 2
		
		int arr[] = {20, 25, 55, 15, 50, 60, 40, 95, 5, 80};
		int search_ele[] = {55, 5};
		
		for(int i=0; i <= arr.length-1; i++)
		{
			for(int ele : search_ele)
			{
				if( ele == arr[i])
				{
					System.out.println(ele + " element found at " + (i+1) + " position.");
				}
			}
		}
		
		
	}

}
