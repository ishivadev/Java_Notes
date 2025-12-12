package day17_WrapperClass_AccessModifier;

/*
✅ Definition — What is a Wrapper Class

A Wrapper Class in Java is a class that converts a primitive data type into an object,
and also provides built-in methods to convert data from one format to another.


📌 Primitive → Wrapper Classes
Primitive		Wrapper Class
int				Integer
float			Float
double			Double
char			Character
boolean			Boolean
short			Short
long			Long
byte			Byte


🎯 Why Wrapper Classes are used

Wrapper classes provide methods to:-
- Store primitive data in object format
- Convert data from one format to another (example: String → int, int → String, double → String, etc.)

 */



public class WrapperClsDataConversion {

	public static void main(String[] args) {
		
		
		/*
		SCENARIO 1 : String ---> int, double, boolean, char
		1) String --> int 			Integer.parseInt(String value);
		2) String --> double 		Double.parseDouble(String value);
		3) String --> boolean 		Boolean.parseBoolean(String value);
		4). String --> float		Float.parseFloat(String value);
		5). String --> char 		NOT Possible ('String' contains multiple character and 'char' contains single character)
		*/
		
		
		// 1) String --> int 		Integer.parseInt(String value);
		String s = "welcome";		// cannot convert to int
		String price1 = "150";
		String price2 = "180";
		int sum1 = Integer.parseInt(price1) + Integer.parseInt(price2);
		System.out.println("Totol sum of price1 and price2 is : " + sum1);
		
		
		// 2) String --> double 		Double.parseDouble(String value);
		String n1 = "150.201";
		String n2 = "130.500";
		double sum2 = Double.parseDouble(n1) + Double.parseDouble(n2);
		System.out.println("Totol sum of n1 and n2 is : " + sum2);
		
		
		// 3) String --> boolean 		Boolean.parseBoolean(String value);
		String sr = "Testing";
		String st = "true";
		boolean statusCh1 = Boolean.parseBoolean(sr);	// will return always false if any string is there instead of 'true'
		boolean statusCh2 = Boolean.parseBoolean(st);
		System.out.println(statusCh1);
		System.out.println(statusCh2);
		
		
		// 4). // String --> float      Float.parseFloat(String value)
		String f1 = "25.75";
		String f2 = "14.25";
		float total = Float.parseFloat(f1) + Float.parseFloat(f2);
		System.out.println("Total sum of f1 and f2 is : " + total);
		
		
		
		
		/*
		SCENARIO 2 : int, double, boolean, char ---> String
		1). int ---> String				String.valueOf(int value)
		2). double ---> String			String.valueOf(double value)
		3). boolean ---> String			String.valueOf(boolean value)
		4). char ---> String			String.valueOf(char value)	(String can have single/multiple characters)
		5). float --> String 			String.valueOf(float value)
		*/
		
		
		// 1). int ---> String			String.valueOf(int value)
		int a1 = 234;
		String v1 = String.valueOf(a1);
		System.out.println(v1);
		
		
		// 2). double ---> String			String.valueOf(double value)
		double a2 = 20.45;
		String v2 = String.valueOf(a2);
		System.out.println(v2);
		
		
		// 3). boolean ---> String			String.valueOf(boolean value)
		boolean a3 = false;
		String v3 = String.valueOf(a3);
		System.out.println(v3);
		
		
		// 4). char ---> String			String.valueOf(char value)
		char a4 = 'A';
		String v4 = String.valueOf(a4);
		System.out.println(v4);
		
		
		// 5). float --> String      String.valueOf(float value)
		float f = 45.78f;
		String str = String.valueOf(f);
		System.out.println("Converted float to String: " + str);

		
	}

}
