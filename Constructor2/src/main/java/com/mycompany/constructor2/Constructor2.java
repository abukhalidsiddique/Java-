 
package com.mycompany.constructor2;

class student
{
      String name;
      int age;
      int id;
    
       student (String name,int age)
    {
        this.name=name;
        this.age=age;
    }
       
         student (String name,int age,int id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }
    
       void get1()
    {
        System.out.println(name);
        System.out.println(age);
    }
        void get2()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
    }
     
}

public class Constructor2 {

    public static void main(String[] args) 
    {
           student s=new student("asif",4);        
           s.get1();
           student s1=new student("sss",5,7);
           s1.get2();
    }
}
