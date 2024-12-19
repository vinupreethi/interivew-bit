package org.example;

public class MaximumChunkstoMakeSorted {
    public static void main(String args[])
    {
        int arr[] = {1,0,2,3,4};
        int maxim=arr[0];
        int cnt=1;
        for(int i=1;i<arr.length;i++)
        {
            if(maxim<arr[i])
            {
                maxim=arr[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
