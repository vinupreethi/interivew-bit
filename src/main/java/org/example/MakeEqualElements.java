package org.example;

public class MakeEqualElements {
    public static void main(String args[])
    {
        int a[]={2,3,1};
        int b=1;
        boolean flag=true;
        for(int i=1;i<a.length;i++)
        {
            int difference=Math.abs(a[i]-a[i-1]);
            if(difference != b || difference != 2 * b || difference != 0)
                continue;
        }
        System.out.println(0);
    }
}
