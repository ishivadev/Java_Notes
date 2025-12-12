package day13_keywords;

/*
STATIC - static is a keyword in java means that the variable or method belongs to the class rather than any specific object.
It is common for all objects of the class and can be accessed directly using the class name without creating an object.

1. Static methods can access static stuff(variable and methods) directly (without object).
2. Static methods can access non-static stuff through object.
3. Non-static methods can access everything directly.

*/

public class StaticDemo {
	
	static int a = 10;		// static variable
	int b = 20;				// non-static variable
	
	static void m1()		// static method
	{
		System.out.println("This is a static method...");
	}
	
	void m2()				// non-static method
	{
		System.out.println("This is a non-static method...");
	}
	
	
	void m()	// non-static method can access static and non-static stuffs
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}
	
	
	/*
	public static void main(String[] args) {
		
		// ** static 'main' method is in same class so no need of classname.variable/method to call the static stuffs **
		
		// 1. static method ('main') can access static stuff directly (without object)
		System.out.println(a);  	// static variable 
		m1();
		
		//System.out.println(b);	// cannot access, b is non-static
		//m2();		// cannot access, m2 is non-static
		
		
		// 2. Static methods can access non-static stuff through object.
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		sd.m();
	}
	
	*/

}
