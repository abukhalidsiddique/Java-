 

package com.mycompany.fibonacci;

import java.util.Scanner;

 
public class Fibonacci {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int first=0,second=1,fibo,i,n;
        System.out.print("how many numbers: ");
        n=input.nextInt();
        System.out.print(first+ " "+ second);
        
        for(i=3;i<=n;i++)
        {
            fibo=first+second;
            first=second;
            second=fibo;
            System.out.print(" "+fibo);
        }
    }
}
