package day15_Overriding;

/*
1. Super keyword will be used to invoke the immediate parent class variable.
2. Super keyword will be used to invoke the immediate parent class method.
 */

public class TestSuper {

	public static void main(String[] args) {
		
		Dog dg = new Dog();
		
		dg.displayColor();
		
		dg.eat();
	}

}
