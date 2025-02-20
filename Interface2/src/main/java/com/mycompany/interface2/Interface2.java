 
package com.mycompany.interface2;

interface GeometricObject {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements GeometricObject {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

   
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements GeometricObject {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle implements GeometricObject {
    private double side1, side2, side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class Interface2 {
    public static void main(String[] args) {
        GeometricObject[] objects = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 4, 5)
        };

        for (GeometricObject obj : objects) {
            System.out.println("Area: " + obj.calculateArea());
            System.out.println("Perimeter: " + obj.calculatePerimeter());
        }
    }
}
