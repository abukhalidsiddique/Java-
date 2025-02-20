package com.mycompany.interfacepolymorphism;

abstract class Mammal {
    public void walk() {
        System.out.println("Mammal is walking");
    }
}

interface Animal {
    void sound();  
    void sleep();  

    public void walk();
}

class Dog extends Mammal implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Cat extends Mammal implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

class InterfacePolymorphism {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();  
        myAnimal.walk();
        myAnimal.sleep(); 

        myAnimal = new Cat();
        myAnimal.sound();  
        myAnimal.walk();  
        myAnimal.sleep();  
    }
}
