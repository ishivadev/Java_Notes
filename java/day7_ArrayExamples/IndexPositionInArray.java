package day7_ArrayExamples;

public class IndexPositionInArray {

	public static void main(String[] args) {
		
		int arr[] = {25, 20, 35, 45, 15, 10, 20, 55, 50};
		int search_ele = 20;
		int position = -1;
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			if(search_ele == arr[i])
			{
				position = i;
			}
		}

		if(position >= 0)
		{
			System.out.println(search_ele + " is present at " + (position + 1));
		}
		else {
			System.out.println("Element not available in array.");
		}
		
	}

}
