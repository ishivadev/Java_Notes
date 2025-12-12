package day9_StringExample;

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		
		// String, StringBuilder, StringBuffer all are classes in java.lang package.
		
		
		// String - Immutable
		// Objects of String are immutable (value cannot be changed).
		// Any modification creates a new object.
		// Stored in String Constant Pool or heap.
		String s ="welcome";
		s.concat(" to demo");
		System.out.println(s);    // welcome 		// Because String is IMMUTABLE → concat() creates a NEW object → s still points to "welcome"
		
		
		// StringBuilder - Mutable
		// Objects are mutable (value can change)
		// Stored in heap.
		StringBuilder str = new StringBuilder("demo");
		str.append(" data");
		System.out.println(str);  // demo data  	// Because StringBuilder is MUTABLE → append() modifies same object

		
		// StringBuffer - Mutable
		// Objects are mutable (value can change)
		// Stored in heap.
		StringBuffer st = new StringBuffer("sample");
		st.append(" data");
		System.out.println(st);  // sample data  	// Because StringBuffer is MUTABLE → append() modifies same object
		
		
	}

}
