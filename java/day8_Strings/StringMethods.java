package day8_Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		// length()
		String s = "welcome";
		System.out.println(s.length());
		
		
		// concat() - adding the string
		String s1 = "welcome to";
		String s2 = " java";
		String s3 = " playwright";
		//System.out.println(s1 + s1);	// using '+' operator
		System.out.println(s1.concat(s2));				// welcome to java
		System.out.println(s1.concat(s2).concat(s3));	// welcome to java playwright
		
		
		// trim() - trim spaces from starting and ending 
		s = "   welcome    ";
		System.out.println("Before triming : "+s.length());
		System.out.println(s);	
		
		System.out.println("After triming : "+s.trim().length());
		System.out.println(s.trim());	// welcome
		
		
		// charAt() - character position in string using indexes
		s = "welcome";
		System.out.println(s.charAt(0));	// w
		System.out.println(s.charAt(3));	// c
		
		
		// contains() - returns true/false
		// checks string is part of main string or not
		s = "welcome selenium";
		System.out.println(s.contains("elc"));	//true
		System.out.println(s.contains("come"));	//true
		System.out.println(s.contains("WEl")); 	//false	- case sensitive
		System.out.println(s.contains("nium"));	//true
		
		
		// equals(), equalsIgnoreCase() - compare strings
		s = "welcome selenium";
		System.out.println(s.equals("welcome selenium"));	//true
		System.out.println(s.equals("Welcome Selenium"));	//false
		System.out.println(s.equalsIgnoreCase("Welcome SElenium"));	//true
		
		
		// replace() - replace single/multiple(sequence) of characters in a string 
		s = "java selenium playwright selenium";
		System.out.println(s.replace("e", "X"));							// java sXlXnium playwright sXlXnium
		System.out.println(s.replace("e", "X").replace("nium", "demo"));	// java sXlXdemo playwright sXlXdemo
		
		
		// substring() - extract substring from the main string
		s = "selenium java";
		System.out.println(s.substring(0, 3));	// sel
		System.out.println(s.substring(2, 5));	// len
		
		
		// toUppercase()		toLowerCase()
		s = "Selenium Java";
		System.out.println(s.toLowerCase());	// selenium java
		System.out.println(s.toLowerCase().equals("selenium java"));
		
		System.out.println(s.toUpperCase());	// SELENIUM JAVA
		
		
		// split() - split the string into multiple parts based on the delimeter
		s = "abc@gmail.com";
		s1 = "abc123@gmail.com";
		
		String a[] = s.split("@");	
		System.out.println(Arrays.toString(a));		// [abc, gmail.com]
		String b[] = s1.split("@");
		System.out.println(Arrays.toString(b));		// [abc123, gmail.com]
		
		
		// Ex 1		// "$15,25,40"
		String str = "$15,25,40";
		//String newStr = str.replace("$", "").replace(",", "");
		//System.out.println(newStr);
		
		String a1[] = str.replace("$","").split(",");
		System.out.println(Arrays.toString(a1));	// [15, 25, 40]
		
		
		// Ex 2 	// "abc,123@xyz"
		String str1 = "abc,123@xyz";
		String arr1[] = str1.split(",");
		System.out.println(Arrays.toString(arr1));	// [abc, 123@xyz]
		String arr2[] = arr1[1].split("@");			// arr1[1] - index is passed here		
		System.out.println(Arrays.toString(arr2));	// [123, xyz]
		
		
		// Ex 3 	// "abc 123 xyz"
		String str2 = "abc 123 xyz";
		String arr3[] = str2.split(" ");
		System.out.println(Arrays.toString(arr3));	// [abc, 123, xyz]
		
		
	}

}
