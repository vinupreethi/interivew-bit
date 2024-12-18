package org.example;

import java.util.Scanner;

public class HotelsSpoj {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextLong();
        long sum = 0L;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        long ans = Long.MAX_VALUE;
        int left = 0;
        int right = 0 ;
        while (right < n) {
            sum += arr[right];
            while (sum > m) {
                sum -= arr[left];
                left++;
            }
            ans = Math.min(m - sum, ans);

            right++;

        }
        System.out.println(m-ans);

    }
}
