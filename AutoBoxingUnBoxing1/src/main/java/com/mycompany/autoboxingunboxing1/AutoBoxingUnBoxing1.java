/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.autoboxingunboxing1;
import java.util.*;
/**
 *
 * @author Path Finder
 */
public class AutoBoxingUnBoxing1 {

    public static void main(String[] args) {
      ArrayList<Integer> numbers=new ArrayList<>();
        int num = 20;
        numbers.add(num); 
        System.out.println(numbers);
        Integer a = numbers.get(0); 
        int result = a + 20;  
        System.out.println(result);    }
}
