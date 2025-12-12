package day12_PolymorphismEncapsulation;


class Student {
    String name;
    int age;

    // 1. No-argument constructor
    Student() {
        System.out.println("Default constructor called");
    }

    // 2. Constructor with one parameter
    Student(String n) {
        name = n;
        System.out.println("Name: " + name);
    }

    // 3. Constructor with two parameters
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // 4. Different order of parameters
    Student(int a, String n) {
        name = n;
        age = a;
        System.out.println("Age: " + age + ", Name: " + name);
    }
}


public class StudentConstructor {
    public static void main(String[] args) {
    	
        new Student();                  // Default
        new Student("Shiva");           // One parameter
        new Student("Dev", 25);         // Two parameters
        new Student(30, "Ankit");       // Different order
        
    }
}

