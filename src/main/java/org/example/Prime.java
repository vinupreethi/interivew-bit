package org.example;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            for (int i = n1; i <= n2; i++) {
                int flag = 1;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if ((i % j) == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1 && i!=1)
                    System.out.println(i);
            }
            t--;
        }
    }
}
