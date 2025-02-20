 
package com.mycompany.exception1;

class Custom extends Exception
{
    Custom(String m)
            {
                super(m);
            }
}

public class Exception1 {

    public static void checkNeg(int[] x) throws Custom
    {
        for(int i=0;i<x.length;i++)
        {
            if(x[i]<0)
            {
                throw new Custom("Negative Found");
            }
        }
         
        System.out.println("No Neg Found");
    }
    
    public static void main(String[] args) {
       
        int[] a={1,2,3,5,6,7};
        try{
            checkNeg(a);
        }
        catch(Custom c){
               System.out.println("Error: "+ c.getMessage());
        }
        finally
                {
                    System.out.println("Okay");
                }
    }
}
