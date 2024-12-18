package org.example;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class ContinuousSubArrays {
    public static void main(String args[]) {
        int nums[] = {42, 41, 42, 41, 41, 40, 39, 38};

        //42,41,42,41,41,40 -- 3  // 21 // 21+10+6 = 37
        //41,41,40,39 -- 2  // 10
        //40,39,38 --  // 6


        int leftIndex = 0;
        int difference = 0;
        int answer = 0;
        int currentMinimum = nums[0];
        int currentMaximum = nums[0];
        int currentMinimumIndex = 0;
        int currentMaximumIndex = 0;
        int ans = 0;
        boolean flag = false;
        for (int right = 0; right < nums.length; right++) {
            flag = false;
            if (currentMaximum <= nums[right]) {
                currentMaximum = nums[right];
                currentMaximumIndex = right;
            }
            if (currentMinimum >= nums[right]) {
                currentMinimum = nums[right];
                currentMinimumIndex = right;
            }
            if (right == nums.length - 1 && Math.abs(currentMaximum - currentMinimum) <= 2) {
                difference = right - leftIndex + 1;
                answer += (difference) * (difference + 1) / 2;
            } else if (Math.abs(currentMaximum - currentMinimum) > 2) {
                flag = true;
                difference = right - leftIndex;
                answer += (difference) * (difference + 1) / 2;
                if (right == currentMinimumIndex) {
                    int j = right;
                    int temp = currentMaximum;
                    currentMaximumIndex = j;
                    currentMaximum=nums[right];
                    while (nums[j] != temp && j >= 0) {
                        if (currentMaximum < nums[j]) {
                            currentMaximum = nums[j];
                            currentMaximumIndex = j;
                        }
                        leftIndex = j;
                        j--;
                    }
                    int diff = Math.abs(right - leftIndex);
                    ans += ((diff + 1) * diff) / 2;


                } else if (right == currentMaximumIndex) {
                    int j = right;
                    int temp = currentMinimum;
                    currentMinimumIndex = j;
                    currentMinimum=nums[right];
                    while (nums[j] != temp && j >= 0) {
                        if (currentMinimum > nums[j]) {
                            currentMinimum = nums[j];
                            currentMinimumIndex = j;
                        }
                        leftIndex = j;
                        j--;
                    }
                    int diff = Math.abs(right - leftIndex);
                    ans += ((diff + 1) * diff) / 2;

                }


            }


        }
       // System.out.println(answer);
        if (flag == true) {
           // System.out.println(nums.length);
            //System.out.println(leftIndex);
            difference = nums.length - leftIndex ;
            answer += (difference) * (difference + 1) / 2;
           // System.out.println(".." + answer);
//            int diff = Math.abs(nums.length- leftIndex);
//            ans += (diff + 1) * diff / 2;
        }
       // System.out.println(ans);
        //System.out.println(answer);

         System.out.println(answer - ans);


    }

}



