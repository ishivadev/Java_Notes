package day16_DataAbstraction;

/*
 Interface
 - An interface in Java is a blueprint of a class that defines a set of abstract methods (and constants) which a class must implement.
   It is used to achieve abstraction and multiple inheritance in Java.
 - An interface is a blueprint of a class that contains abstract methods and constants. It is used to achieve abstraction and multiple inheritance in Java. A class implements an interface to provide the method definitions declared in it.
 
 Key Points

1. An interface is a blueprint of a class. - It defines a set of abstract methods that a class must implement.

2. An interface can contain public, static, and final variables. - By default, all variables declared inside an interface are public, static, and final — even if not explicitly mentioned.

3. An interface contains abstract methods. - (From Java 8 onwards, interfaces can also include default and static methods; and from Java 9, even private methods.)

4. An abstract method is a method that has only a declaration (signature) and no implementation (body).

5. All methods in an interface are public by default (even if not explicitly written).

6. Interface supports multiple inheritance in Java. - A class can implement multiple interfaces, allowing it to inherit behavior contracts from all of them.

7. An interface is defined using the interface keyword.

8. A class extends another class,
an interface extends another interface,
but a class implements an interface.

9. We can create an object reference of an interface,
but cannot instantiate an interface directly.
(We can, however, assign it to an object of a class that implements it.)

*/


// interface
interface Shape
{
	int a = 10;		// final & static
	int b = 20;		// final & static
	
	void circle();	// abstract method
	
	default void square()	// default method
	{
		System.out.println("This is a square - default type method");
	}
	
	static void rectangle()		// static method
	{
		System.out.println("This is a rectangle - static type method");
	}
}


public class InterfaceDemo implements Shape
{
	public void circle()
	{
		System.out.println("This is a circle - abstratc method implemented in child class");
	}

	public static void main(String[] args) {
		
		// Scenario 1
		/*
		InterfaceDemo itObj = new InterfaceDemo();
		itObj.circle();		// abstract method
		itObj.square();		// default method
		Shape.rectangle();	// static method can directly access from interface using interface name
		*/
		
		// Scenario 2
		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();
		
	}

}
