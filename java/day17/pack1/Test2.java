package day17.pack1;

public class Test2 {

	public static void main(String[] args) {
		
		Test1 ts = new Test1();
		
		//System.out.println( ts.a );	// private variable	// a will not visible when we mention 'a' as 'private'
		
		//ts.m1();  // private method	// m1() will not visible when we mention 'm1()' as 'private'

		
		ts.display();	// default method - can access within the package
		
		
	}

}
