package day16_DataAbstraction;

/*
Abstract Method 
An abstract method is a method that only has a declaration (method signature) and no implementation (body).
It is meant to be overridden in a subclass to provide specific behavior. 

Key Points:
- Declared using the keyword abstract.
- Cannot have a method body (i.e., {} block).
- Can only be declared inside an abstract class or interface.
- The subclass that extends an abstract class must implement all its abstract methods (unless the subclass is also abstract).

*/

abstract class Animal {
    
    abstract void sound();	// Abstract method - only declaration, no body

    // Non-abstract (concrete) method
    void sleep() {
        System.out.println("Sleeping...");
    }
}


class Dog extends Animal {
	
    // Implementing abstract method
    void sound() {
        System.out.println("Bark");
    }
}


public class AbstractMethod {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ❌ Not allowed (cannot instantiate abstract class)
        
        Dog d = new Dog();  // ✅ Create object of subclass
        d.sound();          // Output: Bark
        d.sleep();          // Output: Sleeping...
    }
}


