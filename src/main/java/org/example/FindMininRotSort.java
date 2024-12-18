package org.example;

public class FindMininRotSort {
    public static void main(String args[])
    {
        int a[]={4,5,6,7,8,1,2,3};
        int n=a.length;

        int low=0;
        int high=n-1;
        int minim=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[low]<=a[mid])
            {
                minim=Math.min(minim,a[low]);
                low=mid+1;
            }
            else
            {
                minim=Math.min(a[mid],minim);
                high=mid-1;
            }


        }
        System.out.println("minim = " + minim);
    }
}
