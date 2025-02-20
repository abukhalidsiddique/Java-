package com.mycompany.interface1;
 
interface Flyable
{
    void fly();
}
class Bird {
    void chirp() {
        System.out.println("Bird is chirping");
    }
}

class Sparrow extends Bird implements Flyable {
    public void fly() {
        System.out.println("Sparrow is flying");
    }
    @Override
    public void chirp()
    {
        super.chirp();
        System.out.println("Bird isnt chirping");
    }
            
}

public class Interface1 {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.chirp();
        sparrow.fly();
    }
}
