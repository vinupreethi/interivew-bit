package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TreatForCows {
    public static void main(String args[]) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long dp[][] = new long[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = n * arr[i];
        }
        int temp=n;
        temp--;
        for (int length = 2; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int end = start + length - 1;
                if (end  < n)
                    dp[start][end]=Math.max(dp[start][end-1] + temp * arr[end], dp[start+1][end] + temp * arr[start]);
            }
            temp--;
        }

        System.out.println(dp[0][n-1]);
//        for(int r=0;r<n;r++)
//        {
//            for(int s=0;s<n;s++)
//            {
//                System.out.print(dp[r][s]+ " ");
//            }
//            System.out.println(" ");
//        }
    }
}
