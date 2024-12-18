package org.example;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String args[])
    {
        int nums[]={2,7,11,15};
        int target=9;

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(hashMap.get(nums[i])!=null)
                System.out.println("i = " + i);
            hashMap.put(nums[i],i);
        }
    }
}
