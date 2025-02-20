 

package com.mycompany.teacher;

 
public class Teacher {

    int age,salary;
    String name,address;
    
    void set(String n,int a,int s,String add)
    {
        name=n;
        age=a;
        salary=s;
        address=add;
    }
    
     void display() {
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("salary: "+salary);        
        System.out.println("address: "+address);
        System.out.println("");
    }
}
