/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome;
import java.util.Scanner;

 
/**
 *
 * @author Path Finder
 */
public class Palindrome {
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
        if(sum==n)
        System.out.println(n+ " is a palindrome number");
        else
         System.out.println(n+ " is not a palindrome number");

            
         
    }      
        
    
     
}
