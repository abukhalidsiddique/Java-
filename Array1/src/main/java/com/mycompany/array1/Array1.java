
package com.mycompany.array1;

import java.util.*;
public class Array1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a[]={3,4,5,6,7};
        for(int x:a)
        {
            System.out.println(x);
        }
        
//        int [] b=new int[10];
//        for(int i=0;i<10;i++)
//        {
//            System.out.print("b["+i+"]: ");
//            b[i]=input.nextInt();
//        }
//        for(int x:b)
//        {
//            System.out.println(x);
//        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
