 

package com.mycompany.palindromeNumbers;
import java.util.Scanner;

 
 
public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int temp,i,sum=0,r,start,end;
             
        System.out.print("enter the starting nmbr: ");
        start=  input.nextInt();
        System.out.print("enter the ending nmbr: ");
        end=  input.nextInt();
         System.out.print("palindrome numbers:");
        
        for(i=start;i<=end;i++)
        {
            temp=i;
            while(temp!=0)
        {
        r=temp%10;
        sum=(sum*10)+r;
        temp=temp/10;
        }
        if(sum==i)
        System.out.println(" "+sum);
        
            sum=0;
        }
            
         
    }      
        
    
     
}
