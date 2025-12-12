package day20_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 HashSet - HashSet is a class implemented Set interface.
 		   HashSet is a hash-based Set that stores unique elements with no order guaranteed.
 
 Features of HashSet:-
 1. Heterogeneous data 			- 	Allowed
 2. Insertion order				-	Not preserved (Index not supported)
 3. Duplicate elements			- 	Not allowed
 4. Multiple nulls NOT allowed / only single null is allowed
 
 
✔ Best Use Cases
When you need unique values only
Fast checking of existence (e.g., email, ID)
Removing duplicates from a list
 
 */


public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		//HashSet <String> myset = new HashSet<String>();
		
		
		
	    // Adding data into ArrayList
        myset.add(101);
        myset.add(101);
        myset.add(10.5);
        myset.add("Welcome");
        myset.add('A');
        myset.add(true);
        myset.add(101);
        myset.add(null);
        myset.add(null);
		
		// Printing all elements of hashset
        System.out.println(myset);		// [null, A, 101, 10.5, Welcome, true]
        
        // Size of hashset
        System.out.println("Size of hashset : " + myset.size());	// 6
		
        // Remove element from hashset
        myset.remove(10.5);
        System.out.println("HashSet after removing one element : " + myset);	// [null, A, 101, Welcome, true]
        
        // Inserting element - Not possible
        
        // Access specific element - Not possible (if required, we need to convert HashSet to ArrayList first)
        
        // Convert HashSet --> ArrayList
        ArrayList al = new ArrayList(myset);
        System.out.println(al);
        System.out.println("Element of 3rd index : " + al.get(3));		// Welcome
        
        
        // Returns true/false
        System.out.println(myset.contains(101));	// true
        
        
        // *** Reading all the element from hashset 
        
        // Approach 1 - using normal for loop (Not possible, because the index is not possible)
		/*
        // Approach 2 - using for..each
        for(Object x : myset)
        {
        	System.out.println(x);
        }*/
        
        // Approach 3 - using iterator
        Iterator it = myset.iterator();
        
        while( it.hasNext() )
        {
        	System.out.println(it.next());
        }
        
        
        
        // clearing all the element
        myset.clear();		// true
        
        // Checking the hashset is empty or not
        System.out.println(myset.isEmpty());		// true
        
        
	}

}
