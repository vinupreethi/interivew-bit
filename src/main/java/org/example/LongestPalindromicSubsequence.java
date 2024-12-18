package org.example;

public class LongestPalindromicSubsequence {
    public static void main(String args[]) {
        String text1 = "malayalam";
        String text2 = new StringBuilder(text1).reverse().toString();

        int n = text1.length();
        int m = text2.length();

        int dp[][] = new int[n][m];
        dp[0][0] = 0;
        for (int i = 0; i < n; i++) {
            if (text1.charAt(i) == text2.charAt(0))
                dp[i][0] = 1;
            else if (i != 0)
                dp[i][0] = dp[i - 1][0];
        }

        for (int j = 0; j < m; j++) {
            if (text2.charAt(j) == text1.charAt(0))
                dp[0][j] = 1;
            else if (j != 0)
                dp[0][j] = dp[0][j - 1];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (text1.charAt(i) == text2.charAt(j))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(dp[i][j] + " ");
            System.out.println(" ");
        }

    }
}
