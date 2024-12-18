package org.example;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String args[])
    {
    int a[] ={3, 30, 34, 5, 9};
    int n=a.length;
    String sbr[]=new String[n];
    for(int i=0;i<a.length;i++)
    {
        sbr[i]=String.valueOf(a[i]);
    }

        Arrays.sort(sbr,(str1,str2)->
        {
            String o1=str1+str2;
            String o2=str2+str1;
            return o2.compareTo(o1);
        });
        System.out.println("sbr = " + sbr);
        String str = "";
       for(int i=0;i<a.length;i++)
           str+=sbr[i];

       
        System.out.println("str = " + str);

    }
}
