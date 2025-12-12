package day20_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 ArrayList - ArrayList a class which is implemented List interface. 
 			 ArrayList is a dynamic array that stores elements in order and allows duplicates.
 
Features of ArrayList - 
 1. Heterogeneous data 		- Allowed
 2. Insertion order 		- Preserved (Index)
 3. Duplicate elements 		- Allowed
 4. Multiple nulls 			- Allowed


✔ Best Use Cases
When you need ordered data
When fast access is needed (read operations)
Storing list of items, menus, records etc.

*/


public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration
        ArrayList mylist = new ArrayList();	
        //List mylist = new ArrayList();
        //ArrayList <String> mylist = new ArrayList<String>();

        // Adding data into ArrayList
        mylist.add(101);
        mylist.add(10.5);
        mylist.add("Welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(101);
        mylist.add(null);
        mylist.add(null);

        
        // Size of arraylist
        System.out.println("Size of arraylist is : " + mylist.size());	// 8
		
        // Printing arraylist
        System.out.println("Printing data of arraylist is : " + mylist);	// [101, 10.5, Welcome, A, true, 101, null, null]
		
		// Remove element from arraylist
        mylist.remove(5);
        System.out.println("After removing: " + mylist);	// [101, 10.5, Welcome, A, true, null, null]
        
        // Insert element in the arraylist
        mylist.add(5, "101");
        System.out.println("After inserting: " + mylist);	// [101, 10.5, Welcome, A, true, 101, null, null]
        
        // Modify element in the arraylist (modify/replace/change
        mylist.set(3, 'B');
        System.out.println("After modify/replace: " + mylist);	// [101, 10.5, Welcome, B, true, 101, null, null]
        
        
        // Access specific element from arraylist
        System.out.println("Get data for specific index : " + mylist.get(2) );	// Welcome
        
        
        
        // *** Reading all the element from arraylist 
        /*
        // Approach 1 : using normal for loop
        for(int i=0; i <= mylist.size()-1; i++)
        {
        	System.out.println(mylist.get(i));	// 'i' will be index 
        }*/
        
        /*
        // Approach 2 : using advance for loop (it will not follow indexing)
        for(Object a : mylist)
        {
        	System.out.println(a);
        }
        */
        
        // Approach 3 - using iterator
        /*Iterator is an interface - It provides methods to iterate (loop) through elements of a Collection one-by-one.
		  It is used with: ArrayList, HashSet, LinkedList, HashMap (through keySet, entrySet) */
        
        //iterator() - it is a method in Collection interface, that return object
        
        Iterator it = mylist.iterator();	// executing iterator() method on mylist object.
        
        while( it.hasNext() )  // hasNext() - checks if next element exists (true/false), will return TRUE is element is available, returns false when the iteration is complete.
        	{
        	System.out.println( it.next() );   // next() – returns the element
        }
        
        
        // Check arraylist is empty or not
        System.out.println("Array list is empty..?? : " + mylist.isEmpty());
        
        
        // Remove all data from array list
        ArrayList mylist2 = new ArrayList();
        
        mylist2.add(10.5);
        mylist2.add(true);
        mylist2.add('B');
        
        mylist.removeAll(mylist2);
        
        System.out.println("Printing data from arraylist after removing some data : " + mylist);
        
        
        // remove/clear all data
        mylist.clear();
        System.out.println("Printing data of arraylist is from clear : " + mylist);
        
	}

}
