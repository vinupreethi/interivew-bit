package org.example;

public class PerfectPeak {
    public static void main(String args[])
    {

        int a[]={5, 1, 4, 3, 6, 8, 10, 7, 9};
        int n=a.length;
        int suffix[]=new int[n];
        int maxim=a[0];
        suffix[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suffix[i]=Math.min(a[i],suffix[i+1]);
        }

        for(int i=1;i<n-1;i++)
        {

            if(a[i]<maxim && a[i]>suffix[i])
            {
                System.out.println("1");
                maxim=a[i];
            }
        }
        System.out.println("0");
    }
}
