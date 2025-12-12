package day15_Overriding;

public class Animal {

	String color = "white";
	
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog extends Animal
{
	String color = "black";
	
	void displayColor()
	{	
		//System.out.println(color);
		System.out.println(super.color);	// Super keyword will be used to invoke the immediate parent class variable.
	}
	
	void eat()
	{
		//System.out.println("Eating Bread...");
		super.eat();	// Super keyword will be used to invoke the immediate parent class method.
	}
}
