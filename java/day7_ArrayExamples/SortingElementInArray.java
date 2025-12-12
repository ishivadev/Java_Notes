package day7_ArrayExamples;

import java.util.Arrays;

public class SortingElementInArray {

	public static void main(String[] args) {
		
		int a[] = {10, 20, 50, 40, 25, 60, 55, 30};
		
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);		// sorts in ascending order by default
		
		System.out.println("After sorting...");
		System.out.println(Arrays.toString(a));

	}

}
