/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multipleexcetion1;

public class MultipleExcetion1 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            
            System.out.println(numbers[1]);
            
            String str = "Asif";
             
            System.out.println(str.length());
            
            
            System.out.println(10 / 0);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
