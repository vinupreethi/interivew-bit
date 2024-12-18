package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class EKOSPOJ {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long target = sc.nextLong();
        long[] a = new long[n];
        long maxim=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            maxim=Math.max(a[i],maxim);
        }


        long low = 0;
        long high = maxim;  // Max height in the array
        long result = 0;

        // Binary search for the height 'H'
        while (low <= high) {
            long mid = (low + high) / 2;
            long harvestedWood = calculateWood(mid, a);

            if (harvestedWood == target) {
                result = mid;  // Found exact match
                break;
            } else if (harvestedWood < target) {
                high = mid - 1;  // Need to reduce height
            } else {
                result = mid;  // This height is valid, try for higher
                low = mid + 1;
            }
        }

        System.out.println(result);
    }

    // Calculate total wood harvested if the cutting height is 'mid'
    private static long calculateWood(long mid, long[] arr) {
        long totalWood = 0;
        for (long height : arr) {
            if (height > mid) {
                long diff= height - mid;
                totalWood = totalWood + ((diff > 0) ? diff : 0);
            }
        }
        return totalWood;
    }
}
