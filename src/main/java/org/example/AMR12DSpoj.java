package org.example;

import java.util.*;

public class AMR12DSpoj {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            String str = scanner.next();
            Set<String> substring = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length(); j++) {
                    substring.add(str.substring(i, j + 1));
                }
            }
            int flag=0;
            for (String sbr : substring) {
                StringBuilder string = new StringBuilder(sbr);
                if (!substring.contains(String.valueOf(string.reverse()))) {
                    flag=1;
                    System.out.println("NO");
                    break;
                }
            }
            if(flag==0)
            System.out.println("YES");

            t--;
        }
    }
}
