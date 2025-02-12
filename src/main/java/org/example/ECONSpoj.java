package org.example;

import java.util.Scanner;

public class ECONSpoj {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result[] = new int[n];
        for (int i = 0; i < result.length; i++)
            result[i] = scanner.nextInt();
        for (int answer = 0; answer < result.length; answer++) {
            int ans = result[answer];
            if (ans % 2 != 0) {
                System.out.println(ans);
                continue;
            }
            StringBuilder sbr = new StringBuilder();
            while (ans > 0) {
                int bit = ans & 1;
                sbr.append((bit));
                ans = ans >> 1;

            }
            // System.out.println(sbr);
            String result1 = sbr.toString();
            int decimal = 0;
            int base = 1;
            for (int i = result1.length() - 1; i >= 0; i--) {
                if (result1.charAt(i) == '1')
                    decimal += base;
                base = base * 2;
            }
            System.out.println(decimal);

        }
    }

}
