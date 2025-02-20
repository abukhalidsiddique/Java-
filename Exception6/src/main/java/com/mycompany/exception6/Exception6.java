 
package com.mycompany.exception6;
import java.util.*;
 

public class Exception6 {

    public static void check(int a)
    {
         int n=a/0;
    }
    
    public static void main(String[] args) {
       
         
        try{
            check(2);
        }
        catch(ArithmeticException c){
               System.out.println("Error: "+ c.getMessage());
        }
        
        catch(ArrayIndexOutOfBoundsException c){
               System.out.println("Error: "+ c.getMessage());
        }
        finally
                {
                    System.out.println("Okay");
                }
    }
}
