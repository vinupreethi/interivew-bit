package org.example;

public class TargetSum {
    public static void main(String args[]) {
        int nums[] = {1, 1, 1, 1, 1};
        int target = 3;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int n=nums.length;
        sum = (sum + target) / 2;
       // System.out.println(sum);
        int dp[][]=new int[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                dp[i][j]=0;
            }
        }
        for(int j=0;j<=sum;j++)
        {
            dp[0][j]=0;
        }
        dp[0][0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(nums[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
            }
        }

        for(int k=0;k<=n;k++)
        {
            for(int l=0;l<=sum;l++)
            {
                System.out.print(dp[k][l]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(dp[n][sum]);

    }
}
