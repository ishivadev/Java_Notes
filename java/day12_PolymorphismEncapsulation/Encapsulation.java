package day12_PolymorphismEncapsulation;

/*
Encapsulation in Java
Encapsulation is the process of wrapping data (variables) and methods (functions) that operate on the data into a single unit, known as a class.

It helps to hide the internal details of an object and allows controlled access through methods.

🔹 Key Points
All variables (data members) should be declared private.
→ So they cannot be accessed directly from outside the class.

Provide public “getter” and “setter” methods to access and modify private variables.
→ This ensures data control and validation before updating values.

Variables can only be accessed or modified via methods.
→ Protects from unauthorized or invalid access (a concept known as data hiding).

 */

class Employee {
	
    // Step 1: Private variables
    private String name;
    private int salary;

    // Step 2: Getter methods (to read data)
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    // Step 3: Setter methods (to modify data)
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary value!");
        }
    }
}


public class Encapsulation {
	
    public static void main(String[] args) {
    	
        Employee emp = new Employee();

        // Accessing variables through methods only
        emp.setName("Shiva");
        emp.setSalary(50000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}


