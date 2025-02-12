package org.example;

import java.util.Arrays;

public class LongestIncreasingDecreasing {
    public static void main(String args[]) {
        int nums[] = {1, 4, 3, 3, 2};
        int count=1;
        int answer=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
                count++;
            else
                count=1;
            answer=Math.max(count,answer);
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i+1]<nums[i])
                count++;
            else
                count=1;
            answer=Math.max(count,answer);
        }

        System.out.println(answer);
    }
}
