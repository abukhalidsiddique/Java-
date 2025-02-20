package com.mycompany.oopconstructor;
import java.util.Scanner;
public class Teacher {
    int age,salary;
    String name,address;
    static String university= "IUBAT";
      int count=0;
    Scanner input=new Scanner(System.in);
    Teacher()
    {
        count++;
        System.out.print("enter the name: ");
        name=input.nextLine();
        System.out.print("enter the age: ");
        age=input.nextInt();
        input.nextLine();
        System.out.print("enter the salary: ");
        salary=input.nextInt();
        input.nextLine();
        System.out.print("enter the address: ");
        address=input.nextLine();  
        
        //          After each nextInt() call, I added input.nextLine(); to clear the buffer.
//This ensures that the next nextLine() call reads the actual user input instead of a leftover newline.
// 
    }
    
    Teacher(String n,int a,int s,String add)
    {
        count++;
        name=n;
        age=a;
        salary=s;
        address=add;
    }
    Teacher(String n,int a ,String add)
    {
        count++;
        name=n;
        age=a;
//        salary=0;
        address=add;
    }
    
     void display() {
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("salary: "+salary);        
        System.out.println("address: "+address);
        System.out.println("University: "+university);
        System.out.println("Count: "+count);
        
        System.out.println("");
    }
}
