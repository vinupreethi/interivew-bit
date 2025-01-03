package org.example;

import java.util.HashSet;

public class MinimumCost {
    public static void main(String args[]) {
        int days[] = {1, 4, 6, 7, 8, 20};
        int costs[] = {2, 7, 15};
        int dp[] = new int[days[days.length - 1] + 1];
        int year = days[days.length - 1];

        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<days.length;i++)
            hashSet.add(days[i]);
        dp[0]=0;
        for(int j=1;j<=year;j++)
        {
            if(!hashSet.contains(j))
                dp[j]=dp[j-1];
            else
            {
                dp[j]=Math.min(dp[Math.max(j-1,0)]+costs[0],dp[Math.max(0,j-7)]+costs[1]);
                dp[j]=Math.min(dp[j],dp[Math.max(0,j-30)]+costs[2]);
            }
        }
        System.out.println(dp[year]);
    }
}
