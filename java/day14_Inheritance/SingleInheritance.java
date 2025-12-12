package day14_Inheritance;

class A
{
	int a = 100;
	void show()
	{
		System.out.println("Value of A is : " + a);
	}
}

class B extends A
{
	int b = 200;
	void display()
	{
		System.out.println("Value of B is : " + b);
	}
}


public class SingleInheritance {

	public static void main(String []args)
	{
		B obj = new B();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.show();
		obj.display();
		
		
	}
	
}
