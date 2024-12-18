package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class HypnosSpoj {
    public static void main(String args[]) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = 0L;
        int flag = 0;
        int cnt = 0;
        HashSet<Long> seenNumbers = new HashSet<>();
        while (true) {
            if (n == 1) {
                flag = 1;
                break;
            }
            if (seenNumbers.contains(n)) {
                break;
            }
            ans = 0;
            while (n != 0) {

                long square = n % 10;
                long value = square * square;
                ans += value;
                n = n / 10;
            }

            n = ans;
            cnt++;


            seenNumbers.add(ans);

        }

        if (flag == 1)
            System.out.println(cnt);
        else
            System.out.println(-1);

    }
}
