package day15_Overriding;

/*
Final - final is used to make something unchangeable — it means you cannot modify, extend, or override it
1. Variable - we cannot change the value of variable (constant).
2. Methods - We cannot override those methods in child classes.
3. Class  - We cannot extends the class.

 */



//final class Parent	- it is the actual class name
class Parent
{
	//final void m1()	- it is the actual method name
	void m1()
	{
		System.out.println("This is m1 method from Parent class.");
	}
}

class Child extends Parent	// not allow, Class cannot be extended (no inheritance).
{
	void m1()	// not allow, Method cannot be overridden in child class.
	{
		System.out.println("This is m1 method from Child class to test the comment.");
	}
}



public class FinalKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
