package org.example;


import java.util.HashMap;

public class AllocateBooks {
    static HashMap<Integer, Integer> hashMap = new HashMap<>();
    static int result = 0;

    public static void main(String args[]) {


        int a[] = {73, 58, 30, 72, 44, 78, 23, 9};
        int b = 5;
        int maxim = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            maxim = Math.max(a[i], maxim);
            sum += a[i];
        }
        int low = maxim;
        int high = sum;
        int mid = (low + high) / 2;
        while (low <= high) {
            mid = (low + high) / 2;
            int days = functiondays(mid, a);
            if (days == b) {
                high = mid -1;
            } else if (days < b) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(low);

    }

    private static int functiondays(int mid, int a[]) {
        int count = 1;
        int ans = 0;

        for (int i = 0; i < a.length; i++) {
            if (ans + a[i] <= mid) {
                ans += a[i];
            } else {
                ans = a[i];
                count++;
            }

        }

        return count;

    }
}








