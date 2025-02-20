/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritence4;

class Device {
    void powerOn() {
        System.out.println("Device is powered on");
    }
}

class Computer extends Device {
    @Override
    void powerOn() {
        super.powerOn();
        System.out.println("Computer is powered on");
    }
}

class Laptop extends Computer {
    @Override
    void powerOn() {
        System.out.println("Laptop is powered on");
    }
}

public class Inheritence4 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
        Computer c=new Computer();
        c.powerOn();
    }
}
