package org.example;

import java.math.BigInteger;

public class fibonacci {
    public static void main(String args[])
    {

       int dp[]=new int[1001];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=1000;i++)
        {
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }

            System.out.println("dp[i] = " + dp[1000]);

    }


}
