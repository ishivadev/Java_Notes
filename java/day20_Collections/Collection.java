package day20_Collections;

public class Collection {

	/*
	 Collection - To represent group of elements/objects/data
	 "Collection" is an interface available in java.util package.
	 
	 
	 Collection in Java is a framework that provides classes and interfaces to store, manage, and manipulate groups of objects (data).
	It provides ready-made data structures like List, Set, Queue, Map, etc.

	Main features:
	Dynamic size (unlike arrays)
	Pre-built methods (add, remove, sort, search)
	High-performance data structures
	Generic type support
	
	
	
	1. LIST (Interface) : List is an ordered, index-based collection that allows duplicate elements.
	--------------------
	✔ Key Points (Interview-Ready)
	Maintains insertion order
	Allows duplicate values
	Allows multiple null values
	Provides index-based access (0,1,2…)
	Can store heterogeneous objects (not recommended)
	Most used implementation: ArrayList

	✔ When to Use List?
	When order matters
	When you need duplicates
	When fast retrieval is required

	✔ Common Implementations
	ArrayList
	LinkedList
	Vector (Legacy)
	Stack (Legacy)
	
	
	
	
	2. SET (Interface) : To store the Unordered collection that does not allow duplicate elements.
	-------------------
	✔ Key Points
	No duplicates
	No index-based access
	Can store at most one null
	Internally uses hashing or trees
	Good for unique items like IDs, emails, user list

	✔ Common Implementations
	HashSet
	LinkedHashSet
	TreeSet
	
	
	(A) HASHSET (Set Implementation) - HashSet stores elements using hashing.

	✔ Key Points
	No duplicates
	No insertion order guaranteed (un-ordered)
	Stores unique values using hashcodes
	Allows 1 null element
	Very fast for add(), remove(), contains() — average O(1) time

	✔ When to Use HashSet?
	When you need unique elements
	When order does not matter
	When performance is important

	
	
	3. MAP (Interface) : Map stores data as key-value pairs, where keys are unique and each key maps to exactly one value.
	-------------------
	✔ Key Points
	Keys → unique
	Values → can be duplicates
	No index-based access
	Access occurs using keys, not positions
	Used for fast retrieval of values using keys

	✔ Common Implementations
	HashMap → Fast, not synchronized
	LinkedHashMap → Maintains insertion order
	TreeMap → Sorted map using Red-Black Tree
	Hashtable → Synchronized, legacy
	ConcurrentHashMap → Thread-safe, high performance

	✔ When to Use Map?
	When you want a dictionary-like structure
	Need fast lookup by key
	Need to map one object to another (ID→Name, Key→Value)
	
	
	(A) HASHMAP (Map Implementation) - HashMap stores data in key-value pairs using hashing.

	✔ Key Points
	Keys must be unique
	Values can be duplicated
	One null key allowed
	Multiple null values allowed
	Does not maintain insertion order
	Time complexity: O(1) average for put/get

	✔ Storage Mechanism
	Internal structure: Array + LinkedList + Red-Black Tree (Java 8+)
	Buckets are chosen using hash(key)

	✔ When to Use HashMap?
	When you need key-value mapping
	Fast lookups and updates
	Storing unique keys (like dictionary, user database, config data)
	
	
	
	 */
	
	
}
