package org.example;

public class CountWaysToBuildString {

    public static void main(String args[]) {
        int low = 2;
        int high = 3;
        int zero = 1;
        int one = 2;

        int dp[] = new int[high+1];
        dp[0] = 1;

        for (int i = 1; i <= high; i++) {
            if(i-zero>=0)
            dp[i] += dp[i - zero];
            if(i-one>=0)
            dp[i] += dp[i - one];
        }
        int ans=0;
        for(int j=low;j<=high;j++)
        {
            ans+=dp[j];
        }
        System.out.println(ans);

    }
}
