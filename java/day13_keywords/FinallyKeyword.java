package day13_keywords;

/*
Finally - finally is a block used in exception handling.
It is executed whether an exception occurs or not — usually used to release resources (like closing files, DB connections, or browser).
 */



public class FinallyKeyword {

	public static void main(String[] args) {
		
		try {
		    int a = 10 / 0;
		} catch (ArithmeticException e) {
		    System.out.println("Exception caught");
		} finally {
		    System.out.println("Finally block executed");  // always runs
		}

		/*
		 Exception caught
		 Finally block executed

		 */
		
		
		
	}

}
