package day14_Inheritance;

/*
 Multiple Inheritance is not possible using 'class' concept due to ambiguity problem.
 Extends class does not supports 2 classes at a time, only 1 class is supported.
 
 Every class is derived from 'Object' class by default. So Class A and Class B will have the same default methods from Object class and the extends will get a issue where deciding which methods to derived due duplicate methods availability. 
 
 Multiple Inheritance is supported by Interface
 */

/*
interface ParentS
{
	void show()
}

interface ParentT
{
	void display()
}

class ChildD implements ParentS, ParentT
{
	void reflect(int c)
	{
		System.out.println(c);
	}
}

public class MultipleInheritance {

}

*/
