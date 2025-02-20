 
package com.mycompany.arrayminnmbrs;

import java.util.Arrays;
import java.util.Scanner;

 
public class Arrayminnmbrs {

    public static void main(String[] args) {
          int[] array= {4,6,3,9,6};
//       int temp;
//      
//       Scanner input=new Scanner(System.in);  
//       for(int i=0;i<5;i++)
//       {
//           System.out.print("array["+i+"]: ");
//           array[i]= input.nextInt();
//       }
         
//       int len=array.length;
//        temp=array[0];
//       for(int j=1;j<len;j++)
//       {
//           
//          if(temp>array[j])
//               {
//                   temp=array[j];
//               }
//       }

Arrays.sort(array);
          System.out.println("min: "+array[0]);
    }
}
