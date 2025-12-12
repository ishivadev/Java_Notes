package day12_PolymorphismEncapsulation;

/*
Constructor Overloading - Constructor overloading means defining multiple constructors in the same class,
but with different parameter lists (in number, type, or order).

1. Method names should be same.
2. Number of parameters should be different
3. Data type of parameters should be different
4. Order of parameters should be different
*/

public class BoxConstructor {

	double width, height, depth;
	
	BoxConstructor()	// 1
	{
		width = height = depth = 1;
		System.out.println( width * height * depth );
	}
	
	BoxConstructor(double w, double h, double d )	// 2
	{
		width = w;
		height = h;
		depth = d;
		System.out.println( width * height * depth );
	}
	
	BoxConstructor(int len)		// 3
	{
		width = height = depth = len;
		System.out.println( width * height * depth );
	}

	BoxConstructor(int w, double h, double d )	// 4
	{
		width = w;
		height = h;
		depth = d;
		System.out.println( width * height * depth );
	}
	
	
}
