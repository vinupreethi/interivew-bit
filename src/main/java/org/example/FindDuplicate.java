package org.example;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String args[])
    {
        HashSet<Integer> hashSet=new HashSet<>();
        int nums[]={1,2,3,1};
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            if(hashSet.contains(nums[i]))
            {
                flag=1;
                break;
            }
            hashSet.add(nums[i]);
        }
        if(flag==1)
            System.out.println("hashSet = " + hashSet);
    }
}
