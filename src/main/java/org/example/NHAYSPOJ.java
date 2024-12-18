package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NHAYSPOJ {
    public static void main(String args[])  throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n=sc.nextInt();
            String pattern = sc.next();
            String str = sc.next();
            if (pattern.length() > str.length()) {
                System.out.println();
            } else if (pattern.length() == str.length()) {
                if (pattern.equals(str))
                    System.out.println(0);
            } else {
                int lps[] = new int[pattern.length()];
                int len = 0;
                int start = 1;
                while (start < pattern.length()) {
                    if (pattern.charAt(start) == pattern.charAt(len)) {
                        lps[start] = len + 1;
                        len++;
                        start++;
                    } else {
                        if (len != 0)
                            len = lps[len - 1];
                        else {
                            lps[start] = 0;
                            start++;
                        }
                    }
                }
                int startpat = 0;
                int startstr = 0;
                ArrayList<Integer> arr = new ArrayList<>();
                while (startstr < str.length()) {
                    if (str.charAt(startstr) == pattern.charAt(startpat)) {
                        startpat++;
                        startstr++;
                        if (startpat == pattern.length()) {
                            arr.add(startstr - pattern.length());
                            startpat = lps[startpat - 1];
                        }
                    } else {
                        if (startpat != 0)
                            startpat = lps[startpat - 1];
                        else {
                            startstr++;
                        }
                    }
                }
                for (Integer ij : arr)
                    System.out.println(ij);
            }
        }

    }
}
