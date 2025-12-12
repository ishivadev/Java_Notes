package day15_Overriding;

/*
 Method Overriding
 1. Possible only in Multiple classes(inheritance).
 2. We should NOT change of the method but the body we should changes.
 3. Method names are same.
 4. Belongs to Inheritance.
 
 Method Overloading
 1. Possible in Single & Multiple classes(inheritance).
 2. We should change the signature of the method.
 3. Method names are same.
 4. Belongs to Polymorphism.
 */


class Test
{
	void m1(int a)
	{
		System.out.println(a + a);
	}
	
	void m2(int b)
	{
		System.out.println(b * b);
	}
}


class XYZ extends Test
{
	void m1(int a)		// override 
	{
		int val = a * a;
		System.out.println(val);
	}
	
		
	void m2(int b)		// override 
	{
		System.out.println(b * b * b);
	}
	
	
	void m2(int b, int a)	// overload
	{
		System.out.println(a * b + a);
	}
}



public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		
		XYZ xy = new XYZ();
		xy.m1(5);
		xy.m2(7);
		xy.m2(10, 5);
		
		
	}

}
