package com.mycompany.constructor1;

class Vehicle
{
    String name;
    int year;
    static int i=0;
}

class Car extends Vehicle
{
    String model;
    
    Car(String n,String m,int y)
    {
        name=n;
        year=y;
        model=m;
        i++;
    }
    
    void get()
    {
        System.out.println("name: "+name);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
        i++;
    }
}

class Bus extends Vehicle
{
    String model;
    String company;
    
    Bus(String n,String m,String c,int y)
    {
        name=n;
        year=y;
        model=m;
        company=c;
        i++;
    }
    
     void get()
    {
        System.out.println("name: "+name);
        System.out.println("model: "+model);
        System.out.println("company: "+company);
        System.out.println("year: "+year);
        i++;
     }
     
     String x()
     {
         return name;
     }
}

public class Constructor1 {

    public static void main(String[] args) 
    {
         Car c=new Car("BMW","MM66",1990);
         System.out.println("Car c: ");
         c.get();
         
         Bus b=new Bus("Hino","ty66","Hanif",1980);
         System.out.println("Bus b: ");
         b.get();
         System.out.println("Bus b name: "+b.x());
         System.out.println("Static i: "+Vehicle.i);
    }
}

 
