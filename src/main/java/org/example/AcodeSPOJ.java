package org.example;

import java.util.Scanner;

public class AcodeSPOJ {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.next();
            int n = str.length();
            if (str.equals("0"))
                break;

            int dp[] = new int[n];
            dp[0] = 1;
            for (int i = 1; i < n; i++) {
                if (str.charAt(i - 1) - '0' == 1) {
                    if (str.charAt(i) - '0' == 0)
                        dp[i] = dp[i - 1];
                    else if (i != 1)
                        dp[i] = dp[i - 1] + dp[i - 2];
                    else
                        dp[i] = dp[i - 1] + 1;
                } else if (str.charAt(i - 1) - '0' == 2) {
                    if (str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 6) {
                        if (str.charAt(i) - '0' == 0)
                            dp[i] = dp[i - 1];
                        else if (i != 1)
                            dp[i] = dp[i - 1] + dp[i - 2];
                        else
                            dp[i] = dp[i - 1] + 1;
                    }
                } else
                    dp[i] = dp[i - 1];
            }
            System.out.println(dp[n - 1]);
        }


    }
}
