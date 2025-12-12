package day15_Overriding;

/* 
🔹 Method Overriding:
   - When a subclass provides its own implementation of a method that is already defined in its parent class.
   - The method name, return type, and parameters must be the same as the parent class. (Declaration should be same only the implementation should in child class different.)
   - Only the method body (implementation) changes.
   - It is achieved through inheritance.
*/

class Bank
{
	double roi()	// method in Parent class
	{
		return 0;
	}
}


//Child class ICICI overriding roi() method
class ICICI extends Bank
{
	double roi()	// declaration should be same only the implementation should different
	{
		return 10;
	}
}


//Child class SBI overriding roi() method
class SBI extends Bank
{
	double roi()	
	{
		return 7;
	}
}


public class OverridingMethod {

	public static void main(String[] args) {
		
		// Create object of ICICI class
		ICICI ic = new ICICI();
		double a = ic.roi();
		System.out.println("ICICI Rate of Interest: " + a);
		
		
		 // Create object of SBI class
		SBI si = new SBI();
		double b = si.roi();
		System.out.println("SBI Rate of Interest: " + b);
		
		
		 // Example of runtime polymorphism
        // Parent reference, child object
        Bank bank_i = new ICICI();
        System.out.println("Using parent reference (ICICI): " + bank_i.roi());
        
        Bank bank_s = new SBI();
        System.out.println("Using parent reference (SBI): " + bank_s.roi());
		
	}

}
