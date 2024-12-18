package org.example;

import java.util.*;

class TreatCows {
    public static void main(String args[]) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        // Read number of treats
        int n = scanner.nextInt();

        // Array to store the values of treats
        int[] arr = new int[n]; // Store intrinsic values of treats

        // Read the values of treats
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read as int
        }

        // DP array where dp[l][r] is the max value for the subarray from l to r
        long[][] dp = new long[n][n];

        // Fill the DP array
        for (int len = 1; len <= n; len++) {  // len is the length of the subarray being considered
            for (int l = 0; l + len - 1 < n; l++) {  // l is the left index of the subarray
                int r = l + len - 1;  // r is the right index of the subarray

                // Calculate the age of the treat being sold today
                int age = n - (r - l + 1) + 1;  // Remaining length gives the age

                if (len == 1) {
                    // Only one treat left to sell, so its value is simply its intrinsic value * age
                    dp[l][r] = arr[l] * age;
                } else {
                    // Choose the best between taking the left or right treat
                    dp[l][r] = Math.max(arr[l] * age + dp[l + 1][r], arr[r] * age + dp[l][r - 1]);
                }
            }
        }

        // The answer is the maximum value obtainable from selling all the treats
        System.out.println(dp[0][n - 1]);
    }
}
