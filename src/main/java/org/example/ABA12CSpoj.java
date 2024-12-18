package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ABA12CSpoj {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int kg = scanner.nextInt();
        int n = scanner.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++)
            prices[i] = scanner.nextInt();

        int dp[][] = new int[n][kg];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < kg; j++) {
                dp[i][j] = 0;
            }
        }
        dp[0][0] = prices[0];
        int i = 0;
        for (int j = 1; j < n; j++) {
            dp[i][j] = dp[i][j - i - 1] + prices[i];
        }

        for (int ik = 1; ik < n; ik++) {
            for (int price = ik; price < kg; price++) {
                if (ik == price) {
                    dp[ik][price] = Math.min(dp[ik - 1][price], prices[ik]);
                } else if ((price - ik - 1) >= 0) {
                    dp[ik][price] = Math.min(dp[ik - 1][price], dp[ik][price - ik - 1] + prices[ik]);
                }


            }
        }
        for (int is = 0; is < n; is++) {
            for (int js = 0; js < kg; js++) {
                System.out.print(dp[is][js] + " ");
            }
            System.out.println(" ");
        }


    }
}
