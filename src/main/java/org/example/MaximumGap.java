package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class MaximumGap {
    public static void main(String args[])
    {
        int a[]={100, 100, 100, 100, 100 };

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
            hashMap.put(i,a[i]);
        }

        Arrays.sort(a);
        int minim=hashMap.get(a[0]);
        int diff=0;
        for(int j=1;j<a.length;j++)
        {
             diff=Math.max(diff,hashMap.get(a[j])-minim);
             minim=Math.min(hashMap.get(a[j]),minim);

        }
        System.out.println("diff = " + diff);
    }
}
