package org.example;

import java.util.Scanner;

public class CyclicIncrementsLC {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int j = 0;
        char c;
        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) == 'z')
                c = 'a';
            else
                c = (char) (str1.charAt(i) + 1);
            if (str1.charAt(i) == str2.charAt(j) || c == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {
                System.out.println(true);
                break;
            }

        }
        System.out.println(false);

    }
}
