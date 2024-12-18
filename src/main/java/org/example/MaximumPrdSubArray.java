package org.example;

public class MaximumPrdSubArray {

    public static void main(String args[]) {
        int nums[] = {2, 3, -2, 4};
        int prefix = 0;
        int suffix = nums.length - 1;
        int maxim = Integer.MIN_VALUE;
        int n = nums.length - 1;
        int prePro = 1;
        int sufPro = 1;
        while (prefix <= n && suffix >= 0) {
            if (nums[prefix] == 0)
                prePro = 1;
            if (nums[suffix] == 0)
                sufPro = 1;
            prePro = prePro * nums[prefix];
            sufPro = sufPro * nums[suffix];
            int answer = Math.max(prePro, sufPro);
            maxim = Math.max(maxim, answer);
            prefix++;
            suffix--;

        }
        System.out.println(maxim);
    }
}
