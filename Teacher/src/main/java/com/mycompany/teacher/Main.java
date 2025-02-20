 
package com.mycompany.teacher;

 
public class Main {
    
    public static void main(String[] args) {
         Teacher t1,t2,t3;
          t1=new Teacher();
          t2=new Teacher();    
          t3=new Teacher(); 
          
          t1.name="Asif";
          t1.age=20;
          t1.salary=200000;
          t1.address="Tangail";
          
          t2.name="Zunayed";
          t2.age=30;
          t2.salary=200000;
          t2.address="Barisal";
          
          t1.display();
          t2.display();
          t3.set("najmul",32,200000,"Lalmonirhat");
          t3.display();
          
          
//          System.out.println(t1.name);
//          System.out.println(t1.age);
//          System.out.println(t1.salary);
//          System.out.println(t1.address);
//          System.out.println("");
//          System.out.println(t2.name);
//          System.out.println(t2.age);
//          System.out.println(t2.salary);
//          System.out.println(t2.address);
          
            
    }
    
    
}
