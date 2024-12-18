package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BuyingApplesSpoj {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            int kg = scanner.nextInt();
            int n = scanner.nextInt();
            int prices[] = new int[n];
            for (int i = 0; i < n; i++)
                prices[i] = scanner.nextInt();
            int dp[] = new int[n];
            Arrays.fill(dp,Integer.MAX_VALUE);
            for (int j = 0; j < n; j++) {
                if(prices[j]!=-1) {
                    if (n % (j + 1) == 0) {
                        dp[j] = kg / (j + 1) * prices[j];
                    }
                }
            }
            int ans=Integer.MAX_VALUE;
            for(int k=0;k<n;k++)
                ans=Math.min(ans,dp[k]);


            if(ans==Integer.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(ans);
            t--;
        }
    }
}
