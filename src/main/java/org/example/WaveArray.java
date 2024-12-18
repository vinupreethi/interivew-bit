package org.example;

import java.util.Arrays;

public class WaveArray {
    public static void main(String args[])
    {
        int a[]={5, 1, 3, 2, 4};
                Arrays.sort(a);
        int start=0;
        int start1=1;
        int n=a.length;
        int result[]=new int[a.length];
        int flag=0;
        int i=0;
        while(i<=n-1)
        {

            if(flag==0 && start1<=n-1)
            {
                result[i]=a[start1];
                start1+=2;
                flag=1;
            }
            else if(flag==1 && start<=n-1)
            {
                result[i]=a[start];
                start+=2;
                flag=0;
            }
            System.out.println(result[i]);
            i++;
        }
        if(n%2==1)
            result[n-1]=a[start];
       for( i=0;i<result.length;i++)
           System.out.println("result[i] = " + result[i]);
    }
    }

