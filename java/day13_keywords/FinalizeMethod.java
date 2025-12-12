package day13_keywords;

/*
finalize() is a method inside Object class that Java used long time ago to clean up things before an object is destroyed by Garbage Collector (GC).



✅ Which memory is released by Garbage Collector?
Garbage Collector releases memory only from Heap Memory.

📌 Removes the objects stored in Heap.
❌ Does NOT clear Stack Memory.
❌ Does NOT delete files or close DB connections (we must do that manually).



🧠 Real-world example (Super simple)
Imagine you have a notebook.

- You write notes on each page → (This is like creating objects in heap)
- When you finish reading a page, you tear it out → (object = null)
- After a few days, you tell your little brother:
“Clean all useless pages from my room.” → (System.gc())
- Your brother removes all loose pages → (Garbage Collector cleans unused objects)

*/


public class FinalizeMethod {
	
	public void finalize() 
	{
        System.out.println("Object is being destroyed");
    }

	
	public static void main(String[] args) {
		
		FinalizeMethod fm = new FinalizeMethod();
		
		fm = null;		// (“I don’t need this object anymore.”)	// Object becomes eligible for GC	
		
		System.gc();	// Request GC (Garbage Collection) to run
		
		
	}

}
