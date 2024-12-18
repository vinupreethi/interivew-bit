package org.example;

import java.util.Scanner;

public class PiggyBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read E and F for the current test case
            int E = sc.nextInt();
            int F = sc.nextInt();

            // Available weight of coins
            int W = F - E;

            // Number of coin types
            int N = sc.nextInt();

            // Array to store the coins
            int[] values = new int[N];
            int[] weights = new int[N];

            // Read each coin's value and weight
            for (int i = 0; i < N; i++) {
                values[i] = sc.nextInt();
                weights[i] = sc.nextInt();
            }

            // Solve the knapsack problem using dynamic programming
            int result = knapsack(values, weights, W);

            // Output the result
            if (result == -1) {
                System.out.println("This is impossible.");
            } else {
                System.out.println("The minimum amount of money in the piggy-bank is " + result + ".");
            }
        }

        sc.close();
    }

    // Knapsack DP function to calculate maximum value with a weight limit W
    public static int knapsack(int[] values, int[] weights, int W) {
        // dp[i] will hold the maximum value for weight limit i
        int[] dp = new int[W + 1];

        // Initialize dp array
        for (int i = 0; i <= W; i++) {
            dp[i] = Integer.MIN_VALUE; // Use a sentinel value to indicate unreachable weight
        }
        dp[0] = 0; // With 0 weight, the value is 0

        // Process each coin type
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            int weight = weights[i];

            // Traverse dp array backward to ensure each coin is considered only once
            for (int j = W; j >= weight; j--) {
                if (dp[j - weight] != Integer.MIN_VALUE) {
                    dp[j] = Math.max(dp[j], dp[j - weight] + value);
                }
            }
        }

        // If dp[W] is still Integer.MIN_VALUE, it means no valid solution was found
        if (dp[W] == Integer.MIN_VALUE) {
            return -1; // Impossible to fill the piggy bank with available coins
        }

        return dp[W];
    }
}

