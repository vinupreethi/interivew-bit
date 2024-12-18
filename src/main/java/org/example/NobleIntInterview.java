package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NobleIntInterview {
    public static void main(String arg[])
    {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int a[]={1,2,3,3,4,4,5,6};
        Arrays.sort(a);
        int n=a.length;
        for(int i=n-1;i>=0;i--)
        {
            if(hashMap.get(a[i])==null)
            hashMap.put(a[i],n-i-1);
        }
        System.out.println(hashMap);
        for(Map.Entry<Integer,Integer> hs: hashMap.entrySet())
        {
            if(hs.getKey() == hs.getValue())
                System.out.println(1);
        }
        System.out.println(-1);

    }
}
