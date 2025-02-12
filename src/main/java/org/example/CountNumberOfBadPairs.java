package org.example;

import java.util.HashMap;

public class CountNumberOfBadPairs {
    public static void main(String args[]) {
        int nums[] = {4, 1, 3, 3};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(i - nums[i], hashMap.getOrDefault(i - nums[i], 0));
            cnt += i - hashMap.get(i - nums[i]);
            hashMap.put(i - nums[i], hashMap.getOrDefault(i - nums[i], 0) + 1);
        }
        System.out.println(cnt);
    }


}
