 
package com.mycompany.polymorphism1;

class Shape {
     
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
     
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
     
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
         
         Shape [] shapes={new Shape(), new Circle(), new Rectangle() };
         for(Shape shape:shapes)
         {
             shape.draw();
         }
    }
}
