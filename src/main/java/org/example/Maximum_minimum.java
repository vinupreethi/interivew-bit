package org.example;

public class Maximum_minimum {
    public static void main(String args[])

    {
        int a[]={-2,1,-4,5,3};
        int maxim=Integer.MIN_VALUE;
        int minim=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            maxim=Math.max(a[i],maxim);
            minim=Math.min(a[i],minim);
        }
        System.out.println(maxim-minim);
    }
}
