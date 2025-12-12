package day7_ArrayExamples;

public class FindNoOfRepetation {

	public static void main(String[] args) {
		
		// Example 1
		int arr[] = {20, 25, 30, 40, 30, 50, 60, 80, 20, 20, 30, 45};
		int search_ele = 20;
		int count = 0;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(search_ele == arr[i])
			{
				count++;
			}
		}
		
		System.out.println(search_ele + " is repetated " + count + " times.");
		
		
		
		/*
		// Example 2
		int arr[] = {10, 20, 30, 10, 15, 20, 50, 20};
		int search_ele[] = {10, 20};
		
		int search_ten_count = 0;
		int search_twenty_count = 0;

		for(int i=0; i<= arr.length-1; i++)
		{
			for(int j=0; j<=1; j++)
			{
				if(search_ele[j] == arr[i])
				{
					if(search_ele[j] == 10)
					{
						search_ten_count++;
					}
					else if(search_ele[j] == 20)
					{
						search_twenty_count++;
					}
				}
			}
		}
		
		System.out.println("Repetation of 10 is : " + search_ten_count);
		System.out.println("Repetation of 20 is : " + search_twenty_count);
		*/
	
	
	}

}
