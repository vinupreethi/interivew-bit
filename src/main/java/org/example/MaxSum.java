package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxSum {
    public static void main(String args[]) {
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        int nums[] = {18, 43, 36, 13, 7, 72};
        int answer = 0;
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int ans = nums[i];
            while (ans > 0) {
                sum += ans % 10;
                ans = ans / 10;
            }

            if (hashMap.get(sum) == null) {
                List<Integer> arr = new ArrayList<>();
                arr.add(nums[i]);
                hashMap.put(sum, arr);
            } else {
                List<Integer> arr = hashMap.get(sum);
                if (arr.size() == 2) {
                    if (arr.get(0) > arr.get(1)) {
                        answer=arr.get(0)+nums[i];
                        result=Math.max(result,answer);
                        arr.set(1, nums[i]);
                    } else {
                        answer=arr.get(1)+nums[i];
                        result=Math.max(result,answer);
                        arr.set(0, nums[i]);

                    }
                } else {
                    arr.add(nums[i]);
                    answer=arr.get(0)+arr.get(1);
                    result=Math.max(result,answer);
                }
                hashMap.put(sum, arr);
            }
        }
        System.out.println(result);
    }
}
