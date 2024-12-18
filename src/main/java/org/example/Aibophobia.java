package org.example;

import java.util.Scanner;

public class Aibophobia {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {

            String str = scanner.next();
            int n = str.length();
            int dp[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                dp[i][i] = 0;
            }

            for (int len = 2; len <= n; len++) {
                for (int i = 0; i < n - len + 1; i++) {
                    {
                        int start = i;
                        int end = i + len - 1;
                        if(str.charAt(start)== str.charAt(end) && len ==2)
                            dp[i][end]=0;
                        else if (str.charAt(start) == str.charAt(end)) {
                            dp[start][end] = dp[start + 1][end - 1];
                        } else {
                            dp[start][end] = 1+ Math.min(dp[start + 1][end], dp[start][end - 1]) ;
                        }

                    }
                }


            }
            System.out.println(dp[0][str.length()-1]);
            t--;


        }
    }
}
