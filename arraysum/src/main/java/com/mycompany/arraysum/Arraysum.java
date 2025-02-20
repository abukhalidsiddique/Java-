

package com.mycompany.arraysum;

import java.util.Scanner;

 
public class Arraysum {

    public static void main(String[] args) {
       int[] array=new int[10];
       int sum1=0;
      
       Scanner input=new Scanner(System.in);  
       for(int i=0;i<=9;i++)
       {
           System.out.print("array["+i+"]: ");
           array[i]= input.nextInt();
           
       }
         
       int len=array.length;
       for(int j=0;j<len;j++)
       {
           sum1+=array[j];
       }
        System.out.println("SUM IS: " +sum1);
    }
}
