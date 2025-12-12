package day10_ClassObject;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.name = "Test1";
		emp1.job = "QA";
		emp1.sal = 50000;
		emp1.display();
		
		
		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.name = "Test2";
		emp2.job = "Sr. QA";
		emp2.sal = 70000;
		emp2.display();
		
		
		Employee emp3 = new Employee();
		emp3.eid = 103;
		emp3.name = "Test3";
		emp3.job = "Sr.QA";
		emp3.sal = 80000;
		emp3.display();

	}

}
