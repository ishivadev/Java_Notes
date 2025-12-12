package day9_StringExample;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		// Mutable - changes happen in original variable
		/*
		 🔹 Mutable Object
			An object whose value can be changed after creation.
			No new object is created.
			Changes happen in the same memory location.
			✔ Examples in Java:		Array, ArrayList, StringBuilder, HashMap
		 */
		
		// Example 1
		int a[] = {5, 4, 1, 3, 2};
		
		System.out.println("Before sorting : " + Arrays.toString(a));		// Output - [5, 4, 1, 3, 2]

		Arrays.sort(a);
		
		System.out.println("After sorting : " + Arrays.toString(a));		// Output - [1, 2, 3, 4, 5]
		
		
		// Example 2
		int[] arr = {10, 20, 30};
		arr[1] = 200;

		System.out.println(Arrays.toString(arr));	// Output - [10, 200, 30]
		
		/*
		 * Explanation:
			arr stores values in the same memory location.
			When you update an index, the same object is modified.
			No new array is created.
		 */
		
		
		
		
		
		// ---------------------------------------------------------------------
		
		
		// Immutable - changes not allow in original variable
		/*
		🔹 Immutable Object
		An object whose value cannot be changed after creation.
		Any modification creates a new object.
		The original object remains unchanged.
		Immutable objects are thread-safe, memory-efficient (string pool).

		✔ Examples in Java:		String, Wrapper classes (Integer, Boolean, etc.), LocalDate, BigDecimal
		
		*/
		
		
		String s = "welcome";
		s.concat(" to java");	// string value will not change
		
		System.out.println("String after concat : " + s);
		
		String newStr = s.concat(" to java");	// new string required to store new value 		OR 		it can be again assign to 's'
		
		System.out.println("String after concat : " + newStr);
		
		/*
		 * Explanation: "Hello" is created in string pool.
		   s.concat(" World") creates a new String "Hello World" but does not assign it.
		   s still points to "Hello".
		 
		 */
	}

}
