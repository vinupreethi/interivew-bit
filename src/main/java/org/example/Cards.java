package org.example;

import java.util.Scanner;

public class Cards {
    public static void main(String args[]) {
        long t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextLong();
        while (t != 0) {
            long n = scanner.nextLong();
            long answer = (3 * (n - 1) * n) / 2;
            long answer2 = 2 * n;
            System.out.println((answer + answer2) % 1000007);

            t--;
        }
    }
}
