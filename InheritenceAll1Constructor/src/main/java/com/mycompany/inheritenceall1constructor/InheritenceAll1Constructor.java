package com.mycompany.inheritenceall1constructor;
class student
{
      String name;
      int age;
      int id;
    
      student(String name,int age,int id)
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
    teacher(String name,int age,int id,int roll)
    {
        super(name,age,id);
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
    employee(String name,int age,int id,int result)
    {
        super(name,age,id);
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
    prof(String name,int age,int id,int result,int year)
    {
        super(name,age,id,result);
        this.year=year;
    }
     void get2()
    {
        super.get2();
        System.out.println(year);
    }
}
public class InheritenceAll1Constructor {

    public static void main(String[] args) {
       teacher t=new teacher("tea", 10, 20,9);
       t.get2();
       employee e=new employee("hhh",7,5,3);
       e.get2();
       prof f=new prof("hhh",7,5,3,89);
       f.get2();
        
    }
}
