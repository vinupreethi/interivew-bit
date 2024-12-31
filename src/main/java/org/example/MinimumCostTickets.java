package org.example;

public class MinimumCostTickets {
    public static void main(String args[]) {
        int days = 366;
        int dp[] = new int[days];
        int cost[] = {2, 7, 15};
        dp[0] = 0;
        int day[] = {1, 4, 6, 7, 8, 20};
        for (int i = 1; i < days; i++) {
            if ( i - 1 >= 0)
                dp[i] = dp[i - 1] + cost[0];
        }
        for (int i = 1; i < days; i++) {
            if ( i - 7 >= 0)
                dp[i] = Math.min(dp[i - 7] + cost[1], dp[i]);
        }
        for (int i = 1; i < days; i++) {
            if (i - 30 >= 0)
                dp[i] = Math.min(dp[i - 30] + cost[2], dp[i]);
        }
        System.out.println(day[day.length-1]);
        System.out.println(dp[day[day.length-1]]);


    }
}
