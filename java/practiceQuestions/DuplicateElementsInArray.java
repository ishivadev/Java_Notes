package practiceQuestions;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		int arr[] = {2, 4, 2, 3, 5, 3, 6, 7, 1, 1, 8, 9, 5};

		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();
		
		for( int a : arr )
		{
			if( !set.add(a) )
			{
				duplicate.add(a);
			}
		}
		
		System.out.println(duplicate);
		
	}

}
