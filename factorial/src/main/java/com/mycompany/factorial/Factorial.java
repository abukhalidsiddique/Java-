 

package com.mycompany.factorial;

import java.util.Scanner;

 
public class Factorial {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,i,fact=1;
        System.out.print(" Enter the number: ");
        a=input.nextInt();
        for(i=1;i<=a;i++)
        {
            fact=fact*i;
        }
         System.out.println("Factorial of "+a+": "+fact);
    }
}
