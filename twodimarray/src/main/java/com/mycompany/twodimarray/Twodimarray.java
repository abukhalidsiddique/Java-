 
package com.mycompany.twodimarray;

import java.util.Scanner;
public class Twodimarray {

    public static void main(String[] args) {
        int[][] array=new int[2][3];
        Scanner input= new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("array["+i+"]["+j+"]: ");
                array[i][j]=input.nextInt();
                 System.out.println("");   
            }
        }
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
//                System.out.print("array["+i+"]["+j"]: ");
                   System.out.print(array[i][j]+"\t");                
            }
              System.out.println("");
        }

    }
}
