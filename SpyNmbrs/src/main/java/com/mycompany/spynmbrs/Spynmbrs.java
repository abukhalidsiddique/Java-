

package com.mycompany.spynmbrs;
import java.util.Scanner;

 
 
public class Spynmbrs {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int temp,i,p=1,sum=0,r,start,end;
             
        System.out.print("enter the starting nmbr: ");
        start=  input.nextInt();
        System.out.print("enter the ending nmbr: ");
        end=  input.nextInt();
        System.out.print("Spy numbers:");
        
        for(i=start;i<=end;i++)
        {
            temp=i;
            while(temp!=0)
        {
        r=temp%10;
        sum+=r;
        p*=r;
        temp=temp/10;
        }
        if(sum==p)
        System.out.print(" "+i);
        
            sum=0;
            p=1;
        }
    }         
}
