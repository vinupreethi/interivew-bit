package org.example;

import java.util.*;

public class ANARC05BSPOJ {
    public static void main(String args[]) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0)
                break;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            int b[] = new int[m];
            for (int j = 0; j < m; j++) {
                b[j] = scanner.nextInt();
            }

            int start1 = 0;
            int start2 = 0;
            long sum1 = 0L;
            long sum2 = 0L;
            long result = 0L;
            while (start1 < n && start2 < m) {
                if (a[start1] < b[start2]) {
                    sum1 += a[start1];
                    start1++;
                } else if (a[start1] > b[start2]) {
                    sum2 += b[start2];
                    start2++;
                } else if (a[start1] == b[start2]) {
                    result += Math.max(sum1, sum2);
                    result += a[start1];
                    sum1 = 0;
                    sum2 = 0;
                    start1++;
                    start2++;
                }

            }
            while (start1 < n) {
                sum1 += a[start1];
                start1++;
            }

            // Add remaining elements in array b, if any
            while (start2 < m) {
                sum2 += b[start2];
                start2++;
            }

            // Add the maximum of the remaining sums
            result += Math.max(sum1, sum2);
            System.out.println(result);
        }

    }
}
