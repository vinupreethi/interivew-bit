package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class CountVowels {
    public static void main(String args[]) {
        String words[] = {"aba", "bcb", "ece", "aa", "e"};
        //////////////////  1   ,  1,    2   ,  3 ,  4
        int queries[][] = {{0, 2}, {1, 4}, {1, 1}};
        int prefix[] = new int[words.length];
        int sum = 0;
        Arrays.fill(prefix, 0);
        for (int i = 0; i < words.length; i++) {
            if ((words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e' || words[i].charAt(0) == 'i'
                    || words[i].charAt(0) == 'o' || words[i].charAt(0) == 'u') &&
                    (words[i].charAt(words[i].length() - 1) == 'a' || words[i].charAt(words[i].length() - 1) == 'e' || words[i].charAt(words[i].length() - 1) == 'i'
                            || words[i].charAt(words[i].length() - 1) == 'o' || words[i].charAt(words[i].length() - 1) == 'u')) {
                sum++;

            }
            prefix[i] = sum;
        }
        int diff[] = new int[queries.length];
        //  System.out.println(queries.length);
        for (int i = 0; i < queries.length; i++) {
            int ans0 = queries[i][0];
            int ans1 = queries[i][1];
            int difference = prefix[ans1];
            if (ans0 - 1 >= 0)
                difference = prefix[ans1] - prefix[ans0 - 1];
            diff[i] = difference;


        }

        for (Integer j : diff)
            System.out.println(j);


    }
}
