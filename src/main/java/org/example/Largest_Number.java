package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Largest_Number {
    public static void main(String args[])
    {
        int[] a = {0,0,0,0,0};
        int n=a.length;
        String[] sbr=new String[a.length];
        for(int i=0;i<n;i++)
        {
            sbr[i]=String.valueOf(a[i]);
        }

        Arrays.sort(sbr, (o1, o2) -> {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        );

        String answer="";
        for(int i=0;i<n;i++)
            System.out.println(sbr[i]);
        System.out.println("sbr[0] = " + sbr[0]);
        if(sbr[0]=="0")
            System.out.println("0");

    }
}
