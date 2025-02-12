package org.example;

public class CheckIfRotateSortedArray {
    public static void main(String args[])
    {
        int nums[]={3,4,5,1,2};
        int inversion=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                inversion++;
            }
            if(nums[nums.length-1]>nums[0])
            {
                inversion++;
            }
        }
    }
}
