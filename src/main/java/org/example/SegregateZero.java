package org.example;

public class SegregateZero {
    public static void main(String args[])
    {
        int a[]={1,0,0,1,0,0,0,1,1,1,0,1,0,1,1};
        int n=a.length;


        int start=0;
        int end=n-1;

        while(start<=end)
        {
            if(a[start]==1 && a[end]==0)
            {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
            if(a[end]==1)
                end--;
            if(a[start]==0)
                start++;

        }
        for(Integer i:a)
            System.out.print(i+" ");


    }
}
