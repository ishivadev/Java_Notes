package day20_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


/*
 HashMap - HashMap is a class implemented set interface.
 		   HashMap stores data in key-value pairs, where keys are unique.
 		   
 Features of HashMap:-
 1. Data can be stored in the form of key-value pairs.
 2. Key is unique, but we can have duplicate values.
 3. Insertion order not preserved (Index not followed).
 4. Allows one null key and multiple null values
 
 
 ✔ Best Use Cases
When you need to map one value to another (ID → Name)
Fast lookup using keys
Storing configuration, dictionaries, cache, etc.

 */


public class HashMapDemo {

	public static void main(String[] args) {
		
		// Declaration
		//HashMap hm = new HashMap();
		//Map hm = new HashMap(); 
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Adding pairs
		hm.put(100, "John");
		hm.put(101, "Smith");
		hm.put(102, "David");
		hm.put(103, "Marry");
		hm.put(104, "Scott");
		hm.put(105, "Jonny");
		
		// Print all element from hashmap
		System.out.println(hm);		// {100=John, 101=Smith, 102=David, 103=Marry, 104=Scott, 105=Jonny}
		
		// Size of the hashmap
		System.out.println(hm.size());		// 6
		
		// Get all keys and values from hashmap
		System.out.println(hm.keySet());		// [100, 101, 102, 103, 104, 105]
		System.out.println(hm.values());		// [John, Smith, David, Marry, Scott, Jonny]
		System.out.println(hm.entrySet());		// [100=John, 101=Smith, 102=David, 103=Marry, 104=Scott, 105=Jonny]
		
		
		//Returns true/false
		System.out.println( hm.containsKey(104) );		// true
		
		
		// Remove element from hashmap using key
		System.out.println(hm.remove(100));		// John
		System.out.println(hm);
		
		
		// Access specific element
		System.out.println(hm.get(102));		// David
		
		
		// Add value to existing hashmap
		hm.put(102, "Henry");
		
		
		
		// Reading data from hashmap		
		// Approach 1 : using for..each
		for( int k : hm.keySet() )
		{
			System.out.println(k + " : " + hm.get(k));
		} 
		
		/*
		// Approach 2
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		*/
		
		
		// Clear all element
		hm.clear();
		
		// Check hashmap is empty or not
		System.out.println(hm.isEmpty());		// true
		
	}

}
