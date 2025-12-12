package day15_Overriding;

/*
🔹 Method Overriding:
   - Child class provides its own version of a method already defined in the parent class.
   - Method signature (name + return type + parameters) must be the same.
   - Only implementation changes.
   - Happens through inheritance → Runtime Polymorphism.
*/



	// Parent class
	class Vehicle
	{
	    int speed()    // parent method
	    {
	        return 0;  // default speed
	    }
	}

	// Child class overriding speed() method
	class Car extends Vehicle
	{
	    int speed()
	    {
	        return 120;  // Car speed
	    }
	}

	// Another child class overriding speed() method
	class Bike extends Vehicle
	{
	    int speed()
	    {
	        return 80;  // Bike speed
	    }
	}


	public class OverridingMethod2 {

	    public static void main(String[] args) {

	        // Car object
	        Car c = new Car();
	        System.out.println("Car Speed: " + c.speed());

	        // Bike object
	        Bike b = new Bike();
	        System.out.println("Bike Speed: " + b.speed());

	        // Runtime Polymorphism
	        Vehicle v1 = new Car();
	        System.out.println("Vehicle ref -> Car Speed: " + v1.speed());

	        Vehicle v2 = new Bike();
	        System.out.println("Vehicle ref -> Bike Speed: " + v2.speed());
	    }
	}

	
	


