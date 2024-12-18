package org.example;

import java.util.*;

public class FindOccurence {
    public static void main(String args[])
    {
        int a[]={56, 35, 25, 32, 41, 50, 7, 52, 34, 41, 72, 12, 93, 50, 19, 94, 13, 19 };

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
            int count=1;
            if(hm.get(a[i])!=null) {
                count = hm.get(a[i]);
                count++;
            }
            hm.put(a[i],count);
        }
        ArrayList<Integer> sortedKeys
                = new ArrayList<Integer>(hm.keySet());

        Collections.sort(sortedKeys);
        int j=0;
        int answer[]=new int[hm.values().size()];
        System.out.println("hm = " + hm);
        for (Integer x : sortedKeys) {
            answer[j] = hm.get(x);
            j++;
        }

    }
}
