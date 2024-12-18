package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberWorking {
    public static void main(String args[])
    {
        int a[]={3, 30, 34, 5, 9};
        String answer[]=new String[a.length];
        for(int i=0;i<a.length;i++)
        {
            answer[i]= String.valueOf(a[i]);
        }
        
        Arrays.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        String ans="";
        for(int i=0;i<a.length;i++)
            ans+=answer[i];

        System.out.println("ans = " + ans);
        
        
    }
}
