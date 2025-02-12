package org.example;

import java.util.Arrays;

public class CountWays {
    public static void main(String args[]) {
        int coins[] = {2, 5, 3, 6};
        int sum = 10;
        int dp[] = new int[sum + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int j = 0; j < coins.length; j++) {
            for (int i = 1; i <= sum; i++) {
                if (i - coins[j] >= 0) {
                    dp[i] = dp[i - coins[j]] + dp[i];
                }
            }
        }
        for (Integer i : dp)
            System.out.print(i + " ");

    }
}
