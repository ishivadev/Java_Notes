package day13_keywords;

/*
Definition:
final is a keyword in java which is used to make something unchangeable — it means you cannot modify, extend, or override it.

🔹 Usage and Meaning:
Where 		used			Meaning
final 		variable		Value cannot be changed (constant).
final 		method			Method cannot be overridden in child class.
final 		class			Class cannot be extended (no inheritance).
 */



public class FinalKeyword {

	final class Base {   // cannot be inherited
	    final int MAX_VALUE = 100;   // constant

	    final void display() {       // cannot be overridden
	        System.out.println("Base display");
	    }
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
