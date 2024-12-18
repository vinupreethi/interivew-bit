package org.example;

public class MinimumNumberOfBalls {
    public static void main(String args[]) {
        int nums[] = {9};
        int maxOperation = 2;
        int maxim = nums[0];
        for (int i = 1; i < nums.length; i++)
            maxim = Math.max(nums[i], maxim);

        int low = 1;
        int high = maxim;
        int result = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(nums, mid, maxOperation)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(result);


    }

    private static boolean possible(int nums[], int mid, int maxOperation) {
        int operation = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > mid)
                operation += (nums[i] / mid);
            if(nums[i]%mid==0)
                operation--;
        }
        if (operation <= maxOperation)
            return true;
        return false;


    }
}
