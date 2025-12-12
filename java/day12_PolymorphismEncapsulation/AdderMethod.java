package day12_PolymorphismEncapsulation;

/*
 Method Overloading - When multiple methods in the same class have the same name but different parameters (type, number, or order),
 
 4 rules are applicable for Method Overloading
---------------------------------------------
1. Method names should be same.
2. Number of parameters should be different
3. Data type of parameters should be different
4. Order of parameters should be different

*/

public class AdderMethod {

	int a = 10;
	int b = 20;
	
	void sum()		// 1
	{
		System.out.println( a + b );
	}	
	
	void sum(int x, int y)	// 2
	{
		System.out.println( x + y );
	}
	
	void sum(int x, double y)	// 3
	{
		System.out.println( x + y );
	}
	
	void sum(double x, int y)	// 4
	{
		System.out.println( x + y );
	}
	
	void sum(int a, int b, int c)	// 2
	{
		System.out.println( a + b + c );
	}
	
}
