/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface3;
import java.util.*;
// Abstract Class: Transportation
abstract class Transportation {
    protected String type;

    public Transportation(String type) {
        this.type = type;
    }

    public abstract void bookTicket();
    public abstract void cancelTicket();
    public abstract void travelDetails();
}

// Interface: Service
interface Service {
    void addService(String serviceName);
    void getServiceList();
}

// Concrete Subclass: Train
class Train extends Transportation implements Service {
    private List<String> services;

    public Train() {
        super("Train");
        this.services = new ArrayList<>();
    }

    @Override
    public void bookTicket() {
        System.out.println("Ticket booked for Train.");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket canceled for Train.");
    }

    @Override
    public void travelDetails() {
        System.out.println("Train Route: City A to City B | Travel Time: 6 hours.");
    }

    @Override
    public void addService(String serviceName) {
        services.add(serviceName);
        System.out.println(serviceName + " service added to Train.");
    }

    @Override
    public void getServiceList() {
        System.out.println("Available services for Train: " + services);
    }
}

// Concrete Subclass: Bus
class Bus extends Transportation {

    public Bus() {
        super("Bus");
    }

    @Override
    public void bookTicket() {
        System.out.println("Ticket booked for Bus.");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket canceled for Bus.");
    }

    @Override
    public void travelDetails() {
        System.out.println("Bus Route: City A to City C | Travel Time: 8 hours.");
    }
}

// Concrete Subclass: Airplane
class Airplane extends Transportation implements Service {
    private List<String> services;

    public Airplane() {
        super("Airplane");
        this.services = new ArrayList<>();
    }

    @Override
    public void bookTicket() {
        System.out.println("Ticket booked for Airplane.");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket canceled for Airplane.");
    }

    @Override
    public void travelDetails() {
        System.out.println("Airplane Route: City A to City D | Travel Time: 2 hours.");
    }

    @Override
    public void addService(String serviceName) {
        services.add(serviceName);
        System.out.println(serviceName + " service added to Airplane.");
    }

    @Override
    public void getServiceList() {
        System.out.println("Available services for Airplane: " + services);
    }
}

// Main Class: Demonstration of polymorphism
public class Interface3 {
    public static void main(String[] args) {
        Transportation train = new Train();
        Transportation bus = new Bus();
        Transportation airplane = new Airplane();

        // Demonstrating polymorphism for bookTicket()
        train.bookTicket();
        bus.bookTicket();
        airplane.bookTicket();

        System.out.println("------------------------------");

        // Demonstrating polymorphism for travelDetails()
        train.travelDetails();
        bus.travelDetails();
        airplane.travelDetails();

        System.out.println("------------------------------");

        // Adding services to Train and Airplane using polymorphism
        Service trainService = (Service) train;
        Service airplaneService = (Service) airplane;

        trainService.addService("Wi-Fi");
        trainService.getServiceList();

        airplaneService.addService("Meals");
        airplaneService.addService("Wi-Fi");
        airplaneService.getServiceList();
    }
}
