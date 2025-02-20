/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylistmethodes;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Path Finder
 */
public class Arraylistmethodes {

    public static void main(String[] args) {
    ArrayList<Integer> number= new ArrayList<Integer>();
    ArrayList<Integer> number2= new ArrayList<Integer>();
    ArrayList<Integer> number3= new ArrayList<Integer>();
        System.out.println("size: "+number.size());
        number.add(3);
        number.add(4);
        number.add(9);
        number.add(7);
        
         number2.add(55);
        number2.add(45);
        number2.add(95);
        number2.add(75);
        Collections.sort(number2);
        
        number3.addAll(number2);
        System.out.println("number3= "+number3);
        
        System.out.println("number= "+number);
        System.out.println("number2= "+number2);
        System.out.println("number3= "+number3);
        
        boolean bbbb=number.equals(number2);
        System.out.println("equal=="+bbbb);
        
         System.out.println("size: "+number.size());
         
          ArrayList<String> names= new ArrayList<String>();
        System.out.println("size: "+names.size());
        names.add("asif");
        names.add("khalid");
        names.add("najmul");
        names.add("razon");
          String str= names.get(0);
          int var= number.get(0);
          System.out.println("var=="+var);
          System.out.println("naamee= "+str);
         int pos=number.indexOf(7);
             System.out.println("index: "+pos);
         number.set(pos,45);                       
                       
        System.out.println("size: "+names.size());
        System.out.print("numbers:");  
        for(int x: number)
         {
             System.out.print(x);
             System.out.print(" ");
         }
         System.out.println("");
         System.out.print("names:");
         for(String y: names)
         {
             System.out.print(y);
             System.out.print(" ");
         }
         System.out.println("");
         number.clear();
         System.out.println("size: "+number.size());
         for(int x: number)
         {
             System.out.print(x);
             System.out.print(" ");
         }
         System.out.println("");
         System.out.print("names:");
         for(String y: names)
         {
             System.out.print(y);
             System.out.print(" ");
         }
         boolean b=number.isEmpty();
         boolean c=names.isEmpty();
         System.out.println("");
         System.out.println("empty: "+b);
         System.out.println("empty: "+c);
         
          boolean contain=number.contains(30);
           System.out.println("30 is in the list: "+contain);
                       

    }
}
