 
package com.mycompany.stringbuffer1;
import java.util.*;
public class StringBuffer1 {

    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("world");
        s.insert(2,"hello");
         String s2=s.toString();
        System.out.println(s);
        System.out.println(s2);
        s2=s2.concat("s");
        System.out.println(s2);
     }
}
