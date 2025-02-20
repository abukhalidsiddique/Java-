package com.mycompany.inheritencesingle1;
class student
{
      String name;
      int age;
      int id;
    
     void set(String name,int age,int id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }
       void get2()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
    }    
} 
 
class teacher extends student 
{
    int roll;
    void set(String name,int age,int id,int roll)
    {
       
        super.set(name,age,id);
        this.roll=roll;
    }
     void get2()
    {
        super.get2();
        System.out.println(roll);
    }
}
class employee extends student
{
    int result;
    void set(String name,int age,int id,int result)
    {
        super.set(name,age,id);
        this.result=result;
    }
     void get2()
    {
        super.get2();
        System.out.println(result);
    }
}

class prof extends employee
        {
    int year;
    void set(String name,int age,int id,int result,int year)
    {
        super.set(name,age,id,result);
        this.year=year;
    }
     void get2()
    {
        super.get2();
        System.out.println(year);
    }
}
public class InheritenceSingle1 {

    public static void main(String[] args)
    {
       teacher t=new teacher();
       t.set("tea", 10, 20,9);
       t.get2();
       employee e=new employee();
       e.set("hhh",7,5,3);
       e.get2();
       prof f=new prof();
       f.set("hhh",7,5,3,89);
       f.get2();
       
    }
}
