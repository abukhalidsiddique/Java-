package com.mycompany.abstraction1;

 abstract class Appliance
         {
abstract void turnOn();
}
class Fan extends Appliance {
   public void turnOn() {
        System.out.println("Fan is turned on");
    }
}

class Light extends Appliance {
   public void turnOn() {
        System.out.println("Light is turned on");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Light light = new Light();

        fan.turnOn();
        light.turnOn();
    }
}
