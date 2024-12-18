package org.example;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Minimum_steps_correct {
    public static void main(String args[])
    {
        int a[]={ 2, 5, 3, 1, 4, 1 };
               // 0,1,2,3,4,5

        System.out.println(solve(a));
    }
    public static int solve(int[] a) {
        int n=a.length;
        int rightmax[]=new int[n];
        rightmax[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],a[i]);
        }
        TreeSet<Integer> ts=new TreeSet<>();
        int maxim=0;
        ts.add(Integer.MIN_VALUE);

        for(int j=0;j<n-1;j++)
        {

            if(a[j]<rightmax[j+1])
            {
                maxim=Math.max((a[j]+rightmax[j+1]+ts.lower(a[j])),maxim);
            }
            ts.add(a[j]);
        }
        return maxim;
    }

}
