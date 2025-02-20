 
package com.mycompany.primenumbers;
import java.util.*;
 
public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,j,start,end,count=0;
        System.out.print("enter the starting number: ");
        start=input.nextInt();
        System.out.print("enter the starting number: ");
        end=input.nextInt();
        for(i=start;i<=end;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                    count++;
            }
              if(count==0)  
              {System.out.println(i);}
              count=0;
        }
    }
}
