 

package com.mycompany.arraylist1;

 

import java.util.ArrayList;
public class Arraylist1 {

    public static void main(String[] args) {
        ArrayList<Integer> number= new ArrayList<Integer>();
        System.out.println("size: "+number.size());
        number.add(3);
        number.add(7);
        number.add(3);
        number.add(9);
         System.out.println("size: "+number.size());
         
          ArrayList<String> names= new ArrayList<String>();
        System.out.println("size: "+names.size());
        names.add("asif");
        names.add("khalid");
        names.add("najmul");
        names.add("razon");
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
    }
}
