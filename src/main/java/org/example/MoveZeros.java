package org.example;

public class MoveZeros {

    public static void main(String args[])
    {
        int a[]= {10,0,1};

        int zero=0;
        int nozero=0;
        int n=a.length;
        while(nozero < n && zero <= nozero)
        {

            if( (a[zero] == 0) && (a[nozero] !=0))
            {
                int temp=a[zero];
                a[zero]=a[nozero];
                a[nozero]=temp;
                zero++;
            }
            if(a[zero]!=0)
                zero++;

            nozero++;

        }
        for(int i=0;i<n;i++)
            System.out.println("a[i] = " + a[i]);
    }
}
