/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysortdecending;
import java.util.*;
/**
 *
 * @author Path Finder
 */
public class ArraySortDecending {

    public static void main(String[] args) {
          Integer[] numbers = {5, 3, 8, 1, 9, 2};

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Array sorted in descending order: " + Arrays.toString(numbers));
        }
}
