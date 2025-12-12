package day7_ArrayExamples;

public class SearchingSingleElementInArray {

	public static void main(String[] args) {
		
		int arr[] = {10, 25, 15, 35, 45, 30, 40, 90, 75, 80};
		int search_element = 30;
		int position = -1;		// default if not found
		
		for(int i=0; i <= arr.length-1; i++)
		{
			if(search_element == arr[i])
			{
				position = i + 1;
				System.out.println(search_element +" element found at " + position + " position.");
				break;	 // stop after finding first match
			}
		}
		
		
	}

}
