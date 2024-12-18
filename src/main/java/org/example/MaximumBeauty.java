package org.example;

import java.util.Arrays;

public class MaximumBeauty {
    public static void main(String args[]) {
        int nums[] = {4, 6, 1, 2}; // 1 2 4 6
        int k = 2;
        Arrays.sort(nums);
        int right = 0;
        int difference = 0;
        for (int left = 0; left < nums.length; left++) {
          right=left;
            while (right < nums.length && ((nums[right] - nums[left]) == k || (nums[right] - nums[left] == 0) ||
                    (nums[right] - nums[left] == 2 * k))) {
                right++;
            }

            difference = Math.max(right - left, difference);
        }
        System.out.println(difference);
    }
}
