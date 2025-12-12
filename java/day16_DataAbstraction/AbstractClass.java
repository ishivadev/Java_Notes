package day16_DataAbstraction;

/*
✅ What is an Abstract Class?
An abstract class is a class in Java that:
cannot be instantiated (you cannot create an object of it)
can contain abstract methods (without body)
can also contain non-abstract methods (with body)
is used to provide partial implementation
is created using the abstract keyword

Interview line:
👉 “Abstract class is a partially implemented class which provides common behaviour and forces child classes to complete the remaining implementation.”


⭐ When to use Abstract Class?

Use abstract class when:
 - You want to provide common (shared) methods to all child classes.
 - Some methods should be mandatory for child classes (abstract).
 - Some methods are optional/default (normal methods).

Example:
All animals eat → common method
Each animal makes different sound → abstract method

*/


// ⭐ One-line interview answer
// 👉 “Abstract class is a partially implemented class that can contain both abstract and non-abstract methods. Abstract methods must be implemented by child classes.”



// Parent Abstract class
abstract class Animal2 {
    
    abstract void sound();  // abstract method
    
    void eat() {            // normal method
        System.out.println("Animals eat food");
    }
}


// Child class
class Dog2 extends Animal2 {
    
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}




public class AbstractClass {

	    public static void main(String[] args) {
	        
	        Animal2 a = new Dog2();  // Upcasting
	        a.sound();             // Dog barks
	        a.eat();               // Animals eat food
	  }
}



