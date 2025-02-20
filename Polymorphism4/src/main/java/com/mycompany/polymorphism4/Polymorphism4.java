/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism4;

abstract class Employee {
    String name;
     public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double calculateSalary();
}

class HourlyEmployee extends Employee {
     double hourlyRate;
     int hoursWorked;

    HourlyEmployee(String name,double hourlyRate, int hoursWorked) {
         super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class SalariedEmployee extends Employee {
    private double annualSalary;

    SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    double calculateSalary() {
        return annualSalary / 12; // Monthly salary
    }
}

public class Polymorphism4 {
    public static void main(String[] args) {
        Employee[] employees = {
            new HourlyEmployee("Asif",20, 160),
            new SalariedEmployee("Khalid",60000)
        };

        for (Employee employee : employees) {
            System.out.println("Salary: $" + employee.getName());
            System.out.println("Salary: $" + employee.calculateSalary());
        }
    }
}
