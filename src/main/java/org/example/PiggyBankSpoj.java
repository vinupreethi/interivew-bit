package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PiggyBankSpoj {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            int e = scanner.nextInt();
            int f = scanner.nextInt();
            int n = scanner.nextInt();
            int profits[] = new int[n];
            int weights[] = new int[n];

            for (int i = 0; i < n; i++) {
                profits[i] = scanner.nextInt();
                weights[i] = scanner.nextInt();
            }

            int w = f - e;
            int dp[] = new int[w + 1];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            for (int j = 0; j < n; j++) {
                for (int i = 1; i <= w; i++) {
                    if (i - weights[j] >= 0 && dp[i - weights[j]] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - weights[j]] + profits[j]);
                    }

                }
            }
            if(dp[w] != Integer.MAX_VALUE)
            {
                System.out.println("The minimum amount of money in the piggy-bank is "+dp[w]+".");
            }
            else
                System.out.println("This is impossible.");


            t--;
        }
    }
}
