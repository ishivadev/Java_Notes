package day5_LoopsJumpStatements;

/*
 while loop syntax:-
 initialization,
 while(condition)
 {
 	statements;
 	increment/decrement;
 }
 */


public class WhileLoopDemo {
	
	public static void main(String []args)
	{
		
	// Example 1: print 1 to 10 numbers
	/*
	int num = 1;	// initialization
	
	while(num <= 10)
	{
		System.out.print(num + "\n");
		num++;
	}
	*/
	
		
	// Example 2: print 'Hello' message 10 times
	/*
	int i = 1;
	
	while(i <= 10)
	{
		System.out.println(i + " : Hello");
		i++;
	}
	*/
	
		
	// Example 3: print even numbers between 1....10
	/*
	//Approach 1
	int i = 2;
	
	while(i <= 10)
	{
		System.out.println(i);
		i+=2;
	}
	*/
	
	/*
	// Approach 2
	int i = 2;
	
	while(i <= 10)
	{
		if(i % 2 == 0)
		{
			System.out.println(i);
		}
		
		//i = i + 1;
		i++;
	}
	*/
	
		
	// Example 4: 1....10 specify the even and odd number. like 1-odd, 2-even, 3-odd	
	
		int a = 1; 
		
		while(a <= 10)
		{
			if(a % 2 == 0)
			{
				System.out.println( a + " is Even no.");
			} else
			{
				System.out.println( a + " is Odd no.");
			}
			
			a++;
		}
		
	
	// Example 5: 10....1 print in descending order, like 10, 9, 8, 7....1
	int b = 10;
	
	while(b >= 1)
	{
		System.out.println(b);
		b--;
	}
		
		
		
		
	}
}
