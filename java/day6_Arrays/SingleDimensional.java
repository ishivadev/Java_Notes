package day6_Arrays;

/*
 Single Dimensional
------------------
1. Declare an array
2. Add values into array
3. Find length of an array
4. Read single values from an array
5. Read multiple values form an array
 */

public class SingleDimensional {

	public static void main(String[] args) {
		
		// 1. Declare an array
		
		// Approach 1
		//int a[] = new int[5];		// array length is fixed to '5'
		//int []a = new int[5];
		
		// Approach 2
		//int a[] = {};	// array length is not fixed
		
		
		
		// 2. Add values into array
		/*
		// Approach 1
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		*/
		
		// Approach 2
		int a[] = {100, 200, 300, 400, 500};
		
		
		
		// 3. Find length of an array
		 System.out.println("Length of the array is : " + a.length);		// a.lenght = 5
		
		
		 
		// 4. Read single values from an array
		// System.out.println(a[1]);
		
		
		 
		// 5. Read multiple values form an array 
		/*
		// Approach 1
		for(int i=0; i < a.length; i++)			// i < 5	:	i < a.length			// i <= 4	:	i <= a.length-1
		{
			System.out.println(a[i]);
		}
		*/
		 
		// Approach 2
		for(int x : a)		// 1st itr: x=100, 2nd itr: x=200, 3rd itr: x=300, 4th itr: x=400, 5th itr: x=500 
		{
			System.out.println(x);
		}
		 
		
		
	}

}
