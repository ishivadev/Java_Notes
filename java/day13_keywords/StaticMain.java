package day13_keywords;

public class StaticMain {

	public static void main(String[] args) {
		
		// ** static 'main' method is in another class so classname.variable/method is required to call the static stuffs. (refer point 1) **
		
		// 1. static method ('main') can access static stuff directly (without object)
		System.out.println(StaticDemo.a);  	// static variable 
		StaticDemo.m1();
		
		//System.out.println(b);	// cannot access, b is non-static
		//m2();		// cannot access, m2 is non-static
				
				
		// 2. Static methods can access non-static stuff through object.
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
				
		sd.m();

	}

}
