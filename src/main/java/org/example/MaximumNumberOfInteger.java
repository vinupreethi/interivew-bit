package org.example;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfInteger {
    public static void main(String args[])
    {
        int[] banned={11};
        int n=7;
        int maxSum=50;

        Set<Integer> set=new HashSet<>();

        for(int i=1;i<=n;i++)
        {
            set.add(i);
        }
        for(int i=0;i<banned.length;i++)
        {
            set.remove(banned[i]);
        }
        int sum=0;
        int cnt=0;
       for(Integer i:set)
       {

           if(sum+i<maxSum)
           {
               sum=sum+i;
               cnt++;
           }
           else
               break;
       }
        System.out.println(cnt);


    }
}
