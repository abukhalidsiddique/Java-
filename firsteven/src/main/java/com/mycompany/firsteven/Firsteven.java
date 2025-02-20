/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firsteven;

/**
 *
 * @author Path Finder
 */
public class Firsteven {

    public static void main(String[] args) {
         int count=0;
         float sum=0,avg;
         for(int i=0;i<=110;i++)
         {
             
             if(i%2==0)
             {
                 sum+=i;
                 count++;
             }
              if(count==50)
             {
                 break;
             }
             
             System.out.println("sum: "+sum);
             avg=sum/50;
              System.out.println("avg: "+avg);
             
         
    }
         System.out.println("sum: "+sum);
             avg=sum/50;
              System.out.println("avg: "+avg);
}
}