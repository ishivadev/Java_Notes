package day11_MethodAndConstructor;

public class StudentMain {

	public static void main(String[] args) {
		
		// **** Storing the data into variable ****
		
		
		/*
		//Student st = new Student();		// When we are not passing the value for constructor
				
		// 1. using object reference variables		
		
		st.sid = 101;
		st.sname = "Ravi";
		st.sgrade = 'A';
		st.printStudentdata();
		
		
		// 2. using method variables
		
		st.setStudentdata(102, "Sam", 'A');
		st.printStudentdata();
		*/
		
		
		// 3. using constructor
		
		Student stObj = new Student(103, "John", 'A');	// We need to pass the variable value when we created a constructor 
		stObj.printStudentdata();
	
		
		
		
		// Difference between Method and Constructor 
		/*
		 Method
		 -------
		 1. Method name can be anything
		 2. Method may or may not return a value
		 3. If method is not returning any value then specify void
		 4. Method can take parameters/arguments
		 5. We have to invoke/call method explicitly through object
		 6. Used for specifying logic
		 
		 Constructor
		 -----------
		 1. Constructor name should be same as class name
		 2. Constructor will never return a value (not even void)
		 3. We don't specify the void
		 4. Constructor can take parameters/arguments
		 5. Constructor automatically invoked at the time of object creation.
		 6. Used for initializing the value of the variables.
		 */
		
	}

}
