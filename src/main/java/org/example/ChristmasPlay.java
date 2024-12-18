package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ChristmasPlay {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        while(t!=0)
        {
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            long arr[]=new long[n];
            long minim=Integer.MAX_VALUE;
            for(int i=0;i<n;i++) {
                arr[i] = scanner.nextLong();
                minim=Math.min(minim,arr[i]);
            }
            if(k==1)
            {
                System.out.println(0);
            }
            else {
                Arrays.sort(arr);
                long diff = Long.MAX_VALUE;
                for (int i = 1; i < arr.length; i++) {
                    diff = Math.min(arr[i] - arr[i - 1], diff);
                }
                System.out.println(diff);
            }
            t--;
        }

    }
}
