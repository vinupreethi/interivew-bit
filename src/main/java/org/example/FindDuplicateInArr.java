package org.example;

import java.util.HashMap;

public class FindDuplicateInArr {

    public static void main(String args[])
    {
        int a[]={3,2,4,1,4,1};

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
            if(hashMap.get(a[i])!=null)
            {
            }
            hashMap.put(a[i],1);
        }
    }
}
