package day11_MethodAndConstructor;

/*
 Constructor - Constructor is used to initialize the data into variable at the time of object creation.
 			   Constructor name is similar to class name. 
 			   Constructor never returns anything, not even void.
 			   
 Two types of Constructor - Default and Parameterized
 */

public class Student {

	int sid;
	String sname;
	char sgrade;
	
	
	void printStudentdata()
	{
		System.out.println(sid + "  " + sname + "  " + sgrade);
	}
	
	void setStudentdata(int id, String name, char grade)
	{
		sid = id;
		sname = name;
		sgrade = grade;
	}
	
	
	Student(int id, String name, char grade)
	{
		sid = id;
		sname = name;
		sgrade = grade;
	}
	
}
