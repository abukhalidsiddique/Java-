package com.mycompany.exception3;

import java.util.*;

class Custom extends ArithmeticException
{
    Custom(String m)
    {
        super(m);
    }
}
public class Exception3 {

    public static void main(String[] args) {
        
        try
        {
            int a=9;
            int b=6;
            System.out.println(devide(a,b));
        }
        catch(Custom e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static int devide(int x,int y) throws Custom         
    {
        if (y==0)
            throw new Custom("not possible");
        else
            return x/y;
                    
    }
}
