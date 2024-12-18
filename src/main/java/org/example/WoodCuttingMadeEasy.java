package org.example;

import java.util.Arrays;

public class WoodCuttingMadeEasy {
    public static void main(String args[]) {
        int a[] = {4, 42, 40, 26, 46};
        int b = 20;
        Arrays.sort(a);
        int minim = a[0];
        int maxim = a[a.length - 1];
        for (int k = 0; k < a.length; k++) {
            minim = Math.min(a[k], minim);
            maxim = Math.max(a[k], maxim);
        }
        int low = minim;
        int high = maxim;
        int result=0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int sum = findSum(a, b, mid);
            if (sum >= b) {
                result=mid;
                low = mid + 1;
            } else if (sum < b) {
                high = mid - 1;
            }

            System.out.println(result);
        }

    }

    private static int findSum(int[] a, int b, int value) {
        int sum = 0;
        for (int j = a.length - 1; j >= 0; j--) {
            if (a[j] >= value) {
                sum += a[j] - value;
            } else
                break;
        }
        return sum;

    }
}
