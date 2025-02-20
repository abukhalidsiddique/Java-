 

package com.mycompany.aggression1;

// Parent class
class AggregationParent {
    // Method to calculate the sum of the array
    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

// Child class
class AggregationChild extends AggregationParent {
    // Method to calculate the average of the array
    public double calculateAverage(int[] numbers) {
        int sum = calculateSum(numbers); // Using the parent class method
        return (double) sum / numbers.length;
    }
}

// Main class
public class Aggression1 {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Create an instance of the child class
        AggregationChild aggregation = new AggregationChild();

        // Perform calculations
        int sum = aggregation.calculateSum(numbers);
        double average = aggregation.calculateAverage(numbers);

        // Display the results
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
