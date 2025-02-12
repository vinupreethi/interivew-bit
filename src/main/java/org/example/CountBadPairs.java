package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountBadPairs {
    public static void main(String args[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        long cnt = 0;
        int nums[] = {4, 1, 3, 3};
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(i - nums[i], hashMap.getOrDefault(i - nums[i], 0) + 1);
        }
        System.out.println(hashMap);
        for (Map.Entry<Integer, Integer> hm : hashMap.entrySet()) {
            if(hm.getValue()>1)
            {
                cnt+=hm.getValue()-1;
            }
        }
        int n = nums.length;
        long answer = n * (n - 1) / 2-cnt;
        System.out.println(answer);
    }
}
