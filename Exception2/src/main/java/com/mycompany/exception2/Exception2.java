package com.mycompany.exception2;

public class Exception2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            System.out.println("Accessing index 5: " + numbers[6]);
        } catch (Exception e) {
            System.out.println("Exception caught: "  );
        }

        System.out.println("Program continues...");
    }
}
