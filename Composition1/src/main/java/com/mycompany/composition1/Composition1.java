/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.composition1;

import java.util.ArrayList;
import java.util.List;

class Room {
    private String type;
    private double area;

    public Room(String type, double area) {
        this.type = type;
        this.area = area;
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Room{type='" + type + "', area=" + area + " sq.ft.}";
    }
}

class House {
    private String address;
    private ArrayList<Room> rooms; // Composition: House "has-a" list of Room objects

    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    // Method to add a room to the house
    public void addRoom(String type, double area) {
        Room room = new Room(type, area);
        rooms.add(room);
        System.out.println("Added Room: " + type + ", Area: " + area + " sq.ft.");
    }

    // Method to display details of all rooms
    public void displayRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms in the house.");
            return;
        }
        System.out.println("Rooms in the House at " + address + ":");
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    // Method to display house details
    public void displayHouseDetails() {
        System.out.println("House Address: " + address);
        displayRooms();
    }
}

public class Composition1 {
    public static void main(String[] args) {
        // Create a House
        House house = new House("123 Maple Street");

        // Add rooms to the house
        house.addRoom("Kitchen", 150.0);
        house.addRoom("Bedroom", 200.0);
        house.addRoom("Bathroom", 50.0);

        // Display house details
        house.displayHouseDetails();
    }
}
