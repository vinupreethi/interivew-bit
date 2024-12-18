package org.example;

import java.util.*;


public class PartyScheduleSpoj {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int total_budget = scanner.nextInt();
            int no_party = scanner.nextInt();

            if (total_budget == 0 && no_party == 0)
                break;

            int fees[] = new int[no_party];
            int fun[] = new int[no_party];

            for (int k = 0; k < no_party; k++) {
                fees[k] = scanner.nextInt();
                fun[k] = scanner.nextInt();
            }
            int dp[] = new int[total_budget + 1];
            //  Arrays.fill(dp,0);
            for (int i = 0; i < no_party; i++) {
                for (int j = total_budget; j >= fees[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - fees[i]] + fun[i]);
                }

            }
            int maxFun = 0;
            int minCost = 0;
                for (int l = 0; l <= total_budget; l++) {
                if (dp[l] > maxFun) {
                    maxFun = dp[l];
                    minCost = l;
                }
            }
            System.out.println(minCost + " " + maxFun);


        }
    }
}
