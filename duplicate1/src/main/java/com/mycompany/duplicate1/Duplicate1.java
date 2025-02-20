/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.duplicate1;
import java.util.*;
/**
 *
 * @author Path Finder
 */
public class Duplicate1 {

    public static void main(String[] args) {
       int [] a={4,7,6,5,4};
       Arrays.sort(a);
       int [] b=new int [a.length];
       int pos=0;
       int temp=a[0];
        System.out.println(a[0]);
       for(int i=1;i<a.length;i++)
       {
           
           if(temp==a[i])
            {
                continue;
            }
            System.out.println(a[i]);
            temp=a[i];
            b[pos]=a[i];
            pos++;
       }
        for(int x: b)
        {
            System.out.print(x+" ");
        }
       
    }
}
