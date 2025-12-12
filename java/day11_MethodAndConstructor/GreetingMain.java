package day11_MethodAndConstructor;

public class GreetingMain {

	public static void main(String[] args) {
		
		Greeting gt = new Greeting();
		
		gt.m1();
		
		
		int getTotal = gt.m2();
		System.out.println("Total value is : " + getTotal);
		
		
		gt.m3(10, 5);
		
		
		int mulValue = gt.m4(5, 5);
		System.out.println("Multiplication of value is : " + mulValue);
	
	}

}
