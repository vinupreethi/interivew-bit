package org.example;

public class MinSteps {
    public static void main(String args[])
    {
        int a[]={0,1,1};
        int b[]={0,1,2};
        int cnt=0;
        for(int i=0;i<a.length-1;i++)
        {
            cnt+=Math.max(Math.abs(a[i+1] - a[i]),Math.abs(b[i+1] - b[i]));
        }
        System.out.println("cnt = " + cnt);
    }
}
