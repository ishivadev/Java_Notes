package day14_Inheritance;

class Parent
{
	int a = 10;
	void show()
	{
		System.out.println("Value of A is : " + a);
	}
}

class ChildOne extends Parent
{
	int b = 20;
	void display()
	{
		System.out.println("Value of A is : " + b);
	}
}

class ChildTwo extends ChildOne
{
	int c = 30;
	void reflect()
	{
		System.out.println("Value of A is : " + c);
	}
}

public class MultiLevelinheritance {

	public static void main(String []args)
	{
		
		ChildTwo objc = new ChildTwo();
		
		System.out.println(objc.a);
		System.out.println(objc.b);
		System.out.println(objc.c);

		objc.show();
		objc.display();
		objc.reflect();
		
	}
}
