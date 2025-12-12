package practiceQuestions;

import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 2, 4, 5, 3, 4};
		
		HashSet<Integer> myset = new HashSet<>();
		
		for(int n : arr)
		{
			myset.add(n);
		}
		
		System.out.println(myset);

	}

}
