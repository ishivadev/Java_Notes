package practiceQuestions;

import java.util.Arrays;

public class MergingTwoArrays {

	public static void main(String[] args) {
		
		int a1[] = {2, 3, 4, 1};
		int a2[] = {1, 2, 1, 3};
		
		int index = 0;
		
		int newarr[] = new int [a1.length + a2.length];
		
		for(int n1 : a1)
		{
			newarr[index] = n1;
			index++;
		}
		
		for(int n2: a2)
		{
			newarr[index] = n2;
			index++;
		}
		
		
		System.out.println(Arrays.toString(newarr));
		
	}

}
