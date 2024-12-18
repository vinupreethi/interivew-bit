package org.example;

public class KadanesAlgorithm {
    public static void main(String args[]) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > maxsum)
                maxsum = sum;
            if (sum < 0)
                sum = 0;
        }

    }
}
