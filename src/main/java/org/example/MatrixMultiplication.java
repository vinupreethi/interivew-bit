package org.example;

public class MatrixMultiplication {
    public static void main(String args[])
    {
        int[] arr = {40,60,20};
        System.out.println(matrixMultiplication(arr));
    }
    static int matrixMultiplication(int[] arr) {

        int n = arr.length;

        // Create a 2D DP array to store minimum
        // multiplication costs
        int[][] dp = new int[n][n];

        // Fill the DP array
        // len is the chain length
        for (int len = 2; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i + 1; k < j; k++) {
                    int cost = dp[i][k] + dp[k][j]
                            + Modsum(i,k,arr) * Modsum(k,j,arr);
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }

        // Minimum cost is in dp[0][n-1]
        return dp[0][n - 1];
    }

    private static int Modsum(int start, int end,int arr[]) {
        int ans=0;
        for(int i=start;i<=end;i++)
        {
            ans+=arr[i];
            ans %=100;

        }
        return ans;
    }
}
