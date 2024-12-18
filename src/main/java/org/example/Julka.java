package org.example;

import java.util.Scanner;

public class Julka {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = 10;
        while (t != 0) {
            long n1 = scanner.nextLong();
            long n2 = scanner.nextLong();

            long ans = (n1 - n2) / 2L;
            if (ans % 2 != 0) {
                System.out.println(0);
                System.out.println(0);
            } else {
                System.out.println(ans + n2);
                System.out.println(ans);
            }
            t--;
        }
    }
}
