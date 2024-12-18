package org.example;

import java.util.Scanner;

public class BYTESM2SPOJ {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int a[][] = new int[h][w];
            int dp[][] = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    dp[i][j] = a[i][j];
                }

            }

            for (int i = 1; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (j - 1 < 0)
                        dp[i][j] += Math.max(dp[i - 1][j], dp[i-1][j + 1]);
                    else if (j + 1 >= w)
                        dp[i][j] += Math.max(dp[i - 1][j], dp[i-1][j - 1]);
                    else {
                        int answer1 = Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
                        int answer2 = Math.max(dp[i - 1][j], dp[i - 1][j + 1]);
                        dp[i][j] += Math.max(answer1, answer2);
                    }
                }

            }
            int result=dp[h-1][0];
            for(int i=0;i<w;i++)
                result=Math.max(result,dp[h-1][i]);

            System.out.println(result);




            t--;
        }
    }
}
