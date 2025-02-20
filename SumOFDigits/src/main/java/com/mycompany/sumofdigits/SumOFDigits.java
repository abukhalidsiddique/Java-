/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumofdigits;
import java.util.Scanner;

 
/**
 *
 * @author Path Finder
 */
public class SumOFDigits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int temp,n,sum=0,r;
        System.out.print("enter the number: ");
        n=input.nextInt();
        temp=n;
        while(temp!=0)
        {
        r=temp%10;
        sum=sum+r;
        temp=temp/10;
        }
        System.out.println("Sum of "+n+": "+sum);
         
    }      
        
    
     
}
