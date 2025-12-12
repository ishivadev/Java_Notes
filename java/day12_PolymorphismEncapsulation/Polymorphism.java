package day12_PolymorphismEncapsulation;

/*
Polymorphism means that one thing can have multiple forms — or one entity can exist in different forms.
Example: A Shape can be a Circle, Rectangle, or Triangle; Water can exist as Ice, Liquid, or Vapour.
In Java, polymorphism allows a single method to behave differently based on the object that is calling it.

Polymorphism in Java can be achieved in two ways —
Method Overloading (Compile-time polymorphism) and Method Overriding (Runtime polymorphism).
 */


class Animal
{
	void sound()	// Sound method
	{
		System.out.println("Animal makes a sound");
	}
}

class Cat extends Animal
{
	void sound()	// Same method different implementation
	{
		System.out.println("Cat meows.");
	}
}


class Dog extends Animal
{
	void sound()	// Same method different implementation
	{
		System.out.println("Dog barks.");
	}
}




public class Polymorphism {
	
	public static void main(String[] args) {
		
		Animal a1 = new Dog();		// same reference type, different form
		Animal a2 = new Cat();
		
		a1.sound();  // Dog barks
        a2.sound();  // Cat meows
	}

}
