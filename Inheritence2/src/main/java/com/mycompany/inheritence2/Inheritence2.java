 
package com.mycompany.inheritence2;

class Vehicle {
     
    public void fuel() {
        System.out.println("This vehicle uses fuel");
    }
}

class Car extends Vehicle {
    
    @Override
    public void fuel() {
        super.fuel();
        System.out.println("This car uses petrol");
    }
}

class Bicycle extends Vehicle {
     
    @Override
    public void fuel() {
        System.out.println("This bicycle doesn't use fuel");
    }
}

public class Inheritence2 {
    public static void main(String[] args) {
        
        Vehicle vehicle;
        vehicle=new Car();
        System.out.println("Car Information:");
        vehicle.fuel();
        vehicle=new Bicycle();
        System.out.println("Bicycle Information:");
        vehicle.fuel();

        
         
    }
}
