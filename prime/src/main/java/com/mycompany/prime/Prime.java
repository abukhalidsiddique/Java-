 
package com.mycompany.prime;

import java.util.Scanner;

 
public class Prime {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i,a,count=0;
        System.out.print("Enter the number: ");
        a=input.nextInt();
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            count++;
        }
            if(count==0)
            System.out.println(a+" is a prime number");
            else
                System.out.println(a+" is not a prime number");
    }
}
        
    
    

