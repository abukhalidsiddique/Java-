/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysort1;
import java.util.*;
/**
 *
 * @author Path Finder
 */
public class ArraySort1 {

    public static void main(String[] args) {
         int a[]=new int[5];
         Scanner input=new Scanner(System.in);
         for(int j=0;j<5;j++)
         {
             a[j]=input.nextInt();
         }
         int[] b=new int[a.length];
         Arrays.sort(a);
         int pos=0;
         for(int i=a.length-1;i>=0;i--)
         {
             b[pos]=a[i];
             pos++;
         }
         for(int x:b)
         {
             System.out.println(x);
         }
    }
}
