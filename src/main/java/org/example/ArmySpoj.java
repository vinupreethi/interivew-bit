package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArmySpoj {
    public static void main(String args[]) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t != 0) {
            int g = scanner.nextInt();
            int mg = scanner.nextInt();

            int a[] = new int[g];
            int b[] = new int[mg];
            int sum = 0;
            int sum1 = 0;
            for (int i = 0; i < g; i++) {
                a[i] = scanner.nextInt();
            }

            for (int j = 0; j < mg; j++) {
                b[j] = scanner.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int i = 0;
            int j = 0;
            while (i < a.length && j < b.length) {
                if(a[i]<b[j])
                {
                    j++;
                    i++;
                }
                else
                    j++;
            }
            if(j<b.length)
                System.out.println("MechaGodzilla");
            else
                System.out.println("Godzilla");

            t--;
        }

    }
}
