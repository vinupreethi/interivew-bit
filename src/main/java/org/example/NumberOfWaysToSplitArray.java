package org.example;

public class NumberOfWaysToSplitArray {
    public static void main(String args[]) {
        int nums[] = {10, 4, -8, 7};
        int n = nums.length;
        long prefix[] = new long[n];
        long suffix[] = new long[n];

        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        suffix[nums.length - 1] = nums[nums.length - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }
        int cnt = 0;
        for (int k = 0; k < n - 1; k++) {
            if (prefix[k] >= suffix[k + 1])
                cnt++;
        }
        System.out.println(cnt);


    }
}
