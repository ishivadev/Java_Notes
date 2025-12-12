package day11_MethodAndConstructor;

/*
 Method - Block or group of statements which will perform certain task.
 		  We have to call the method through object.
 
 1) No params			No return value
 2) No params			Return value
 3) Takes params		No return value
 4) Takes params		Returns value
 */


public class Greeting {

	// 1) No params			No return value
	void m1()
	{
		System.out.println("Hello...!!");
	}
	
	
	// 2) No params			Return value
	int m2()
	{
		int a = 5;
		int b = 5;
		return a + b;
	}
	
	
	// 3) Takes params		No return value
	void m3(int m, int n)
	{
		int sum = 0;
		sum = m + n;
		
		System.out.println("Method M3 and the sum is : " + sum);
	}
	
	
	// 4) Takes params		Returns value
	int m4(int x, int y)
	{
		return x * y;
	}
	
}
