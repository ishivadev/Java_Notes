package day14_Inheritance;

/*
 Hierarchy Inheritance:-
 Parent class can have multiple child class.
 Parent class variables, methods are inherit in multiple child class.
 */


class ParentOne
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class DataOne extends ParentOne
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class DataTwo extends ParentOne
{
	void test(int c)
	{
		System.out.println(c);
	}
}

class DataThree extends ParentOne
{
	void reflect(int d)
	{
		System.out.println(d);
	}
}


public class HierarchyInheritance {

	public static void main(String []args)
	{
		DataThree objThree = new DataThree();
		objThree.display(20);
		objThree.reflect(10);
		
		DataTwo objTwo = new DataTwo();
		objTwo.display(30);
		objTwo.test(40);
		
		DataOne objOne = new DataOne();
		objOne.display(50);
		objOne.show(60);
		
		
	}
}
