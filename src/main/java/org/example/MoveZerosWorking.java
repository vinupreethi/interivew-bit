package org.example;

public class MoveZerosWorking {
    public static void main(String args[])
    {
        int zero=0;
        int nozero=0;
        int a[]={0,1,0,3,12};
        int n=a.length;
        while(nozero<n)
        {
            if(a[zero]==0 && a[nozero]!=0)
            {
                int temp=a[zero];
                a[zero]=a[nozero];
                a[nozero]=temp;
            }
            if(a[zero]!=0)
                zero++;
            nozero++;
        }
        for(Integer i: a)
            System.out.println("i = " + i);
    }
}
