package com.mycompany.string1;
import java.util.*;

 
public class String1 {

    public static void main(String[] args) 
    {
          String s1="Hello ";
          String s2="world";
          String s3=s1+s2;
          System.out.println(s3);
          String s4=s3.substring(6,11);
          Scanner input=new Scanner(System.in);
          String s5=input.next();
          String s6=s4+" "+s5;
          System.out.println(s6);
          char c=s2.charAt(s2.length()-1);
          System.out.println(c);
        String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        for (String z:fruits) {
        System.out.println(z);}

        char[] myStr0 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
    myStr2 = myStr2.copyValueOf(myStr0, 0, 5);
    System.out.println("Returned String: " + myStr2); 
    String ss2="";
    for(int i=0;i<=myStr0.length-1;i++)
    {
       ss2+=myStr0[i];
    }
        System.out.println("Returned String: " + ss2); 
  
        String str10 = "Hello World";
        System.out.println(str10.startsWith("He"));  
        System.out.println(str10.endsWith("wo"));    

        String mStr1 = "Hello";
    String mStr2 = "hello";
    String mStr3 = "Another String";
    System.out.println(mStr1.equalsIgnoreCase(mStr2));
    System.out.println(mStr1.equals(mStr3));
        String mySt = "Hello";
    System.out.println(mySt.replace('o', 'p'));
        String mytr = "This is W3Schools";
    String regex = "is";
    System.out.println(mytr.replaceFirst(regex, "at"));
        String yStr = "I love cats. Cats are very easy to love. Cats are very popular.";
        String egex = "(?i)cat";
        System.out.println(yStr.replaceAll(egex, "dog"));
        char[] myArray = {'a', 'b', 'c'};
    System.out.println(String.valueOf(myArray));
    String sss="hello";
    char[] cc=sss.toCharArray();
    for(char y:cc)
    {
         System.out.println(y);
    }
    System.out.println(String.valueOf(myStr0));
     myStr2 = myStr2.copyValueOf(myStr0, 0, 5);
    System.out.println("Returned String: " + myStr2); 
      System.out.println(mStr1.compareTo(mStr3));

    }
}
