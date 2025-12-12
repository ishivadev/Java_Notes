package day17.pack1;

public class Test1 {

	// private variable and method
	private int a =  10;
	
	private void m1() 
	{
		System.out.println("This is m1() from Test1 class..");
	}
	
	
	
	// default method
	void display()	// if no access modifier is mention that it is default access modifier
	{
		System.out.println(a);	// private variable and method can we access within the same class
		m1();
	}
	
	
	
	// protected variable and method
	protected int x = 30;
	
	protected void m2()
	{
		System.out.println("This is m2() from Test1 class..");
	}
	
	
	
	//public method and variable, current class is already public
	public int y = 40;
	public void m3()
	{
		System.out.println("This is m3() from Test1 class..");
	}
	
}


