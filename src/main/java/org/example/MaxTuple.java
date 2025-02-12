package org.example;

import java.util.HashMap;

public class MaxTuple {
    public static void main(String args[]) {
        int nums[] = {2, 3, 4, 6};
        HashMap<Integer, Integer> hash = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                ans += 8 * hash.getOrDefault(nums[i] * nums[j], 0);
                hash.put(nums[i] * nums[j], hash.getOrDefault(nums[i] * nums[j], 0) + 1);
            }
        }
        System.out.println(ans);
    }
}
