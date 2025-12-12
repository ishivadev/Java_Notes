package practiceQuestions;

import java.util.Arrays;

public class ShiftZeroToRight {

	public static void main(String []args)
	{
		String str = "11002110022100210002001";
		char arr[] = str.toCharArray();		// arr[] = [1, 1, 0, 0, 2, 1, 1, 0, 0, 2, 2, 1, 0, 0, 2, 1, 0, 0, 0, 2, 0, 0, 1]
		char rs[] = new char[arr.length];	
		
		int left = 0;
		int right = arr.length - 1; 
		
		// Step 1: fill all zeros from left
		for(int i=0; i <= arr.length - 1; i++)
		{
			if(arr[i] == '0')
			{
				rs[left] = '0';
				left++;
			}		
		}
		
		// Step 2: fill all non-zeros from right
		for(int j=arr.length - 1; j >= 0; j--)
		{
			if(arr[j] != '0')
			{
				rs[right] = arr[j];
				right--;
			}
		}
		
		
		// arr[] = [1, 1, 0, 0, 2, 1, 1, 0, 0, 2, 2, 1, 0, 0, 2, 1, 0, 0, 0, 2, 0, 0, 1]
		System.out.println(rs);		// 00000000000112112212121
		
		
	}
}
