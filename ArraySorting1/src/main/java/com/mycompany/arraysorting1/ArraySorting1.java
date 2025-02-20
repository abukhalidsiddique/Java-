 

package com.mycompany.arraysorting1;
import java.util.*;
 
public class ArraySorting1 {

    public static void main(String[] args) {
 
       int [] a={4,7,2,6,5,9,0,5,3,5};
       int b=a.length;
       int temp,i,j;
       for(i=0;i<b;i++)
       {
           for(j=i+1;j<b;j++)
           {
               if(a[i]>a[j])
               {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
               }
           }          
       }
         for(int x: a)
         {
             System.out.println(x);
         }
       
         //oooorrrr
         int d[]={9,5,4,3,7,9,8,3,2,4};
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
       for(int x: d)
         {
             System.out.println(x);
         }
        System.out.println(Arrays.compare(a,d));
}}   
