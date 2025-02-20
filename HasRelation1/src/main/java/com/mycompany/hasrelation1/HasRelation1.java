package com.mycompany.hasrelation1;

class Engine {
    private String type;

     Engine(String type) {
        this.type = type;
    }

     String getType() {
        return type;
    }
}

class Car {
    private String model;
    private Engine engine;  
    
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void showDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Engine Type: " + engine.getType());
    }
}

public class HasRelation1 {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");  
        Car car = new Car("Mustang", engine);
        car.showDetails();
    }
}
