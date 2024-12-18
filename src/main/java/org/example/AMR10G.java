package org.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class AMR10G {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            long height[] = new long[n];
            for (int i = 0; i < height.length; i++)
                height[i] = scanner.nextLong();

            mergeSort(height, 0, height.length-1);

            long minim = Long.MAX_VALUE;
            ArrayDeque<Long> arrayDeque = new ArrayDeque<>();
            for (int j = 0; j < height.length; j++) {

                arrayDeque.add(height[j]);
                if (arrayDeque.size() > k)
                    arrayDeque.pollFirst();
                if (arrayDeque.size() == k)
                    minim = Math.min(height[j] - arrayDeque.peekFirst(), minim);
            }
            System.out.println(minim);
            t--;

        }
    }

    private static void mergeSort(long[] height, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        mergeSort(height, start, mid);
        mergeSort(height, mid + 1, end);
        merge(height, start, mid, end);

    }

    private static void merge(long[] height, int start, int mid, int end) {
        // Create temporary arrays for merging
        long[] left = Arrays.copyOfRange(height, start, mid + 1);
        long[] right = Arrays.copyOfRange(height, mid + 1, end + 1);

        int i = 0, j = 0, k = start;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                height[k++] = left[i++];
            } else {
                height[k++] = right[j++];
            }
        }

        while (i < left.length) {
            height[k++] = left[i++];
        }

        while (j < right.length) {
            height[k++] = right[j++];
        }
    }

}
