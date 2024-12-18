package org.example;

public class PickFromBothSidesWorking {
    public static void main(String args[])
    {
        int a[]={5,-2,3,1,2};
        int b=3;
        
        int sum=0;
        for(int i=0;i<b;i++)
            sum+=a[i];
        
        int n=a.length-1;
        int j=b-1;
        int maxsum=sum;
        for(int i=n;i>=(n-b) && j>=0;i--)
        {
            sum-=a[j];
            sum+=a[i];
            maxsum=Math.max(sum,maxsum);
            j--;
        }
        System.out.println("maxsum = " + maxsum);
    }
}
