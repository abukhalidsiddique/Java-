/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exception4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        String fileName = "example.txt"; // Change to an actual file path on your system

        try {
            // Attempt to read the file
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            System.out.println("File Contents:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("File reading process completed.");
        }
    }
}
