package com.mycompany.oopconstructor;
public class Oopconstructor {
    public static void main(String[] args) {
        
         Teacher t1,t2,t3,t4,t5;
          t1=new Teacher("Najmul",32,200000,"Lalmonirhat");
          t2=new Teacher("Asif",28,200000,"Tangail");
          t3=new Teacher("Zunayed",30,200000,"Barisal");
          t4=new Teacher();
          t5=new Teacher("Hafiz",30,"Sirajgang");
          
           
          
          
          System.out.println("t1: ");
          t1.display();
          System.out.println("t2: ");
          t2.display();  
          System.out.println("t3: ");
          t3.display();
          System.out.println("t4: ");
          t4.display();
          System.out.println("t5: ");
          t5.display();
          
          System.out.println("Static University Name: "+Teacher.university);
          
    }
}
