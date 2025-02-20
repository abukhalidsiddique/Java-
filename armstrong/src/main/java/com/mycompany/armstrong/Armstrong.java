 
package com.mycompany.armstrong;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int temp,n,sum=0,r;
        System.out.print("enter the number: ");
        n=input.nextInt();
        temp=n;
        while(temp!=0)
        {
        r=temp%10;
        sum+=r*r*r;
        temp=temp/10;
        }
        if(sum==n)
        System.out.println(n+ " is an armstrong number");
        else
         System.out.println(n+ " is not a armstrong number");

            
         
    }      
        
    
     
}
