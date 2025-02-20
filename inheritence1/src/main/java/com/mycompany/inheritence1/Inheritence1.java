 
package com.mycompany.inheritence1;

class Person {
    private String name;
    private int age;

        public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

     
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
   
    private String studentID;

     
    public Student(String name, int age, String studentID) {
        super(name, age);  
        this.studentID = studentID;
    }

     
    @Override
    public void displayInfo() {
        super.displayInfo();  
        System.out.println("Student ID: " + studentID);
    }
}

public class Inheritence1 {
    public static void main(String[] args) {
         
        Person person = new Person("Alice", 30);
        System.out.println("Person Information:");
        person.displayInfo();

        
        Student student = new Student("Bob", 20, "S12345");
        System.out.println("\nStudent Information:");
        student.displayInfo();
    }
}
