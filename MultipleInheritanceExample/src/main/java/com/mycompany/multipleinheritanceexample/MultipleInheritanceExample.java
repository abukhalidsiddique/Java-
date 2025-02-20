package com.mycompany.multipleinheritanceexample;

interface Animal {
    void sound();  
}
 
interface Pet {
    void play();  
}

class Dog implements Animal, Pet {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat implements Animal, Pet {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Animal myAnimal;
        Pet myPet;
        
        myAnimal = new Dog();
        myAnimal.sound();  

        myPet = new Dog();
        myPet.play();  

         
        myAnimal = new Cat();
        myAnimal.sound();  

        myPet = new Cat();
        myPet.play();  
    }
}
