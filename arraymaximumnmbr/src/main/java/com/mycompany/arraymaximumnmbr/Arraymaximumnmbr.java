 

package com.mycompany.arraymaximumnmbr;

import java.util.*;

 
public class Arraymaximumnmbr {

    public static void main(String[] args) {
         int[] array=new int[10];
       int temp;
      
       Scanner input=new Scanner(System.in);  
       for(int i=0;i<5;i++)
       {
           System.out.print("array["+i+"]: ");
           array[i]= input.nextInt();
       }
         
       int len=array.length;
        temp=array[0];
       for(int j=1;j<len;j++)
       {
           
          if(temp<array[j])
               {
                   temp=array[j];
               }
       }
          System.out.println("max: "+temp);
    }
}
