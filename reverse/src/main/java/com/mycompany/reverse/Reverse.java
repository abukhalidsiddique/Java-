 
package com.mycompany.reverse;
import java.util.Scanner;
 
public class Reverse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int temp,n,sum=0,r;
        System.out.print("enter the number: ");
        n=input.nextInt();
        temp=n;
        while(temp!=0)
        {
        r=temp%10;
        sum=(sum*10)+r;
        temp=temp/10;
        }
        System.out.println("Reverse of "+n+": "+sum);
         
    }      
        
    
     
}
