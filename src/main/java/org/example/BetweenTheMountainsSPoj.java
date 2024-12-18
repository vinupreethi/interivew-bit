package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTheMountainsSPoj {
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        while(t!=0)
        {
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=scanner.nextInt();
            int m=scanner.nextInt();
            int arr1[]=new int[m];
            for(int j=0;j<m;j++)
                arr1[j]=scanner.nextInt();

            Arrays.sort(arr);
            Arrays.sort(arr1);
            int result=Integer.MAX_VALUE;
            int first=0;
            int second=0;
            while(first<arr.length && second<arr1.length)
            {
                result=Math.min(Math.abs(arr[first]-arr1[second]),result);
                if(arr[first]<arr1[second])
                {
                    first++;
                }
                else
                    second++;

            }
            System.out.println(result);
            t--;
        }
    }
}
