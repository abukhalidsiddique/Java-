 
package com.mycompany.polymorphism3;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Tweet! Tweet!");
    }
}

public class Polymorphism3 {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Bird()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
