package com.mycompany.simple1;
class vehicle
{
    String name;
    int year;
}

class car extends vehicle
{
    String model;
    
    void set(String n,String m,int y)
    {
        name=n;
        year=y;
        model=m;
    }
    
    void get()
    {
        System.out.println("name: "+name);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
    }
}

class bus extends vehicle
{
    String model;
    String company;
    
    void set(String n,String m,String c,int y)
    {
        name=n;
        year=y;
        model=m;
        company=c;
    }
    
     void get()
    {
        System.out.println("name: "+name);
        System.out.println("model: "+model);
        System.out.println("company: "+company);
        System.out.println("year: "+year);
     }
     String x()
     {
         return name;
     }
    
}

public class Simple1 {

    public static void main(String[] args) 
    {
         car c=new car();
         c.set("BMW","MM66",1990);
         System.out.println("Car c: ");
         c.get();
         
         bus b=new bus();
         b.set("Hino","ty66","Hanif",1980);
         System.out.println("Bus b: ");
         b.get();
         System.out.println("Bus b name: "+b.x());
    }
}

 