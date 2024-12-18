package org.example;

public class ReArrangeArrayWorking {
    public static void main(String args[])
    {
        int a[]={4, 0, 2, 1, 3};
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            a[i]=a[i]+((a[a[i]]%n)*n);
        }
        for(int i=0;i<n;i++)
            System.out.println("a[i]/n = " + a[i]/n);
    }
}
