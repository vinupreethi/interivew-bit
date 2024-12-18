package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class CandySpoj {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        while(t!=0)
        {
            int n=scanner.nextInt();
            long candies[]=new long[n];
            for(int i=0;i<candies.length;i++)
                    candies[i]=scanner.nextLong();

            BigInteger sum=BigInteger.ZERO;
            for(int i=0;i<candies.length;i++)
                sum=sum.add(BigInteger.valueOf(candies[i]));

            if(n >0 && sum.mod(BigInteger.valueOf((long)n))==BigInteger.ZERO)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");



            t--;
        }
    }
}
