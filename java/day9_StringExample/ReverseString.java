package day9_StringExample;

public class ReverseString {

	public static void main(String[] args) {
		
		/*
		// Approach 1 -	using string methods length() charAt()
		String s = "welcome";
		String rev = "";
		
		for(int i = s.length()-1; i >= 0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse string is : " + rev);
		*/
		
		
		
		// Approach 2 - without using string method / by converting string to char array type
		String str = "welcome";
		String rev = "";

		char a[] = str.toCharArray();	// converting the string into array
		
		for(int i = a.length-1; i >= 0; i--)
		{
			rev = rev + a[i];
		}
		System.out.println("Reverse string is : " + rev);
		
		
		
		
		/*
		// Approach 3
		StringBuilder s = new StringBuilder("welcome");
		System.out.println(s.reverse());
		
		// Approach 4
		StringBuffer s1 = new StringBuffer("welcome");
		System.out.println(s1.reverse());
		
		// Approach 5
		String s2 = "sample";
		String st = new StringBuilder(s2).reverse().toString();
		System.out.println(st);
		*/
		
	}

}
