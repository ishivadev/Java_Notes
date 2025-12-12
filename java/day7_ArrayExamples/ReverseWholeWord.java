package day7_ArrayExamples;

import java.util.Arrays;

public class ReverseWholeWord {

	public static void main(String[] args) {
		
		String str = "Welcome to java programming";		// Expected output - "programming java to Welcome"
		
		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String result = "";
		
		for(int i=arr.length-1; i>=0; i--)
		{
			result = result + arr[i] + " ";
		}
		
		System.out.println(result);
		
		//System.out.println(result.trim());	// if space are there in start and ending
		
	}

}
