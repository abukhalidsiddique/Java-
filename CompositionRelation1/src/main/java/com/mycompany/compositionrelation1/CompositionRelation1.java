 
package com.mycompany.compositionrelation1;

class Screen {
    private String resolution;

    public Screen(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }
}

class Laptop {
    private String brand;
    private Screen screen;  

    public Laptop(String brand, String resolution) {
        this.brand = brand;
        this.screen = new Screen(resolution);  
    }

    public void showDetails() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Screen Resolution: " + screen.getResolution());
    }
}

public class CompositionRelation1 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "1920x1080");
        laptop.showDetails();
    }
}
