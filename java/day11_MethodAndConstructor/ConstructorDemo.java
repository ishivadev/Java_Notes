package day11_MethodAndConstructor;

public class ConstructorDemo {

	int a;
	int b;
	
	ConstructorDemo()	// Default Constructor
	{
		a = 100;
		b = 200;
	}
	
	ConstructorDemo(int x, int y)	// Parameterized Constructor
	{
		a = x;
		b = y;
	}
	
	void display()
	{
		System.out.println("Total is : " + (a+b) );
	}
	
	
	public static void main(String[] args) {
		
		//ConstructorDemo cd = new ConstructorDemo();		// Default constructor will be called, as we are not passing any value
		
		ConstructorDemo cd = new ConstructorDemo(50, 100);		// Parameterized constructor will be called, as we are passing value
		
		
		cd.display();

	}

}
