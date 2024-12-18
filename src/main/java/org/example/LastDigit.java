package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class LastDigit {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {

            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if (b%4 ==0) {
                System.out.println((int) Math.pow(a, 4) % 10);
            } else if (b%4==3) {
                System.out.println((int) Math.pow(a, 3) % 10);
            } else if (b%4==2) {
                System.out.println((int) Math.pow(a, 2) % 10);
            } else if (b%4==1) {
                System.out.println((int) Math.pow(a, 1) % 10);
            }
            n--;
        }
    }
}
