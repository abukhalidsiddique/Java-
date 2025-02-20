 
package com.mycompany.inheritence3;
 
class Employee {
     
    private String name;
    private double salary;

    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    
    public void displaySalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    
    private String department;

     public Manager(String name, double salary, String department) {
        super(name, salary); // Call the constructor of the Employee class
        this.department = department;
    }

    
    @Override
    public void displaySalary() {
        super.displaySalary();  
        System.out.println("Department: " + department);
    }
}

public class Inheritence3 {
    public static void main(String[] args) {
         
        System.out.println("Creating a Manager instance:");
        Manager manager = new Manager("Alice", 75000, "IT");
        manager.displaySalary();  
    }
}
