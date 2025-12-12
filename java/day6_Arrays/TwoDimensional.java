package day6_Arrays;

/*
 Two Dimensional
----------------
1. Declare an array
2. Add values into array
3. Find length of an array
4. Read single values from an array
5. Read multiple values form an array
 */

public class TwoDimensional {

	public static void main(String[] args) {
		
		// 1. Declare an array
		
		// Approach 1
		//int a[][] = new int[3][2];
		//int []a[] = new int[3][2];
		//int [][]a = new int[3][2];
		
		
		
		// 2. Add values into array
		/*
		// Approach 1
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		*/
		
		// Approach 2
		
		int a[][] = {
						{100,200},
						{300,400},
						{500,600}
					};
		
		
		
		// 3. Find length of an array
		System.out.println("The length of row : " + a.length);			// will get length of row
		System.out.println("The length of column : " + a[0].length);	// will get the length of the column
		
		
		
		// 4. Read single values from an array
		//System.out.println("Value of a single index : " + a[0][1] );
		
		
		
		// 5. Read multiple values form an array
		/*
		// Approach 1		// i < 3	:	i < a.length			// i <= 2	:	i <= a.length-1
		
		for(int r=0; r <= a.length-1; r++)					
		{
			for(int c=0; c <= a[r].length-1; c++)	// a[0].length-1
			{
				System.out.print(a[r][c] + "  ");
			}
			System.out.println();
		}
		*/
		
		// Approach 2
		for(int arr[] : a)		// 1st itr: arr = [100,200]		2nd itr: arr = [300,400]	 3rd itr: arr = [500,600]
		{
			for(int x : arr)	// 1st itr: x=100,200	 	2nd itr: x=300,400		3rd itr: x=500,600
			{
				System.out.print(x + " ");
			}
			System.out.println();
		}
		

	}
}
