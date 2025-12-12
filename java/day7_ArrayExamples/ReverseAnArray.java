package day7_ArrayExamples;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		// Example 1
		int a[] = {20, 30, 10, 50, 60, 40, 5, 45};
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i] + " ");
		}
		
		
		/*
		// Example 2 
		int arr[] = {20, 30, 10, 50, 60, 40, 5, 45};	//arr.length = 8
		int rev[] = new int[arr.length];
		
		int j = 0; // index for 'rev' array
		
		for(int i = arr.length-1; i >= 0; i-- )
		{
			rev[j] = arr[i]; 
			j++;
		}
		
		System.out.println("Before reversing the array : " + Arrays.toString(arr));
		System.out.println("After reversing the array : " + Arrays.toString(rev));
		*/
		
	}

}
