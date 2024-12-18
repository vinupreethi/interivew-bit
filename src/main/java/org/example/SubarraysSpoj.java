package org.example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SubarraysSpoj {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        int k = scanner.nextInt();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        int result[] = new int[n - k + 1];
        int i = 0;
        int j = 0;
        k = k - 1;
        while (i <= a.length - 1) {
            while (!arrayDeque.isEmpty() && a[arrayDeque.peekLast()] < a[i]) {
                arrayDeque.pollLast();
            }

            while (!arrayDeque.isEmpty() && arrayDeque.peekFirst() < (i - k)) {
                arrayDeque.pollFirst();
            }
            arrayDeque.add(i);
            if (i >= k ) {
                result[j] = a[arrayDeque.peekFirst()];
                j++;
            }

            i++;

        }

        for (Integer iy : result)
            System.out.print(iy + " ");


    }
}
