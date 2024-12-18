package org.example;

public class UniquePath {
    public static void main(String args[])
    {
        int A=2;
        int B=2;
        int dp[][]=new int[A][B];
        for(int i=0;i<A;i++)
        {
            dp[i][0]=1;
        }

        for(int j=0;j<B;j++)
        {
            dp[0][j]=1;
        }

        for(int i=1;i<A;i++)
        {
            for(int j=1;j<B;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }

        System.out.println("dp[A-1][B-1] = " + dp[A-1][B-1]);
    }
}
