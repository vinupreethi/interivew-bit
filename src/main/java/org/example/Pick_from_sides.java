package org.example;

public class Pick_from_sides {
    public static void main(String args[])
    {
        int a[]={5, -2, 3 , 1, 2};
        int b=3;
        int sum=0;
        int i;
        int n=a.length;
        for(i=0;i<b;i++)
            sum+=a[i];
        int maxim=0;
        i=b-1;
        int j=n-1;
        while(i>=0)
        {
            sum=sum+a[j];
            sum=sum-a[i];
            i--;
            j--;
            maxim=Math.max(sum,maxim);
        }
        System.out.println("maxim = " + maxim);
    }
}
