package org.example;

import java.util.*;

public class NeedleChatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the needle and haystack
        int length=sc.nextInt();
        String needle = sc.next();
        String haystack = sc.next();

        // Get the positions of all occurrences using KMP
        List<Integer> positions = kmpSearch(haystack, needle);

        // Output all the positions (1-based index)
        for (int pos : positions) {
            System.out.println(pos);
        }

        sc.close(); // Always close the scanner
    }

    // KMP search to find all occurrences of needle in haystack
    public static List<Integer> kmpSearch(String haystack, String needle) {
        List<Integer> positions = new ArrayList<>();

        // Build the LPS (Longest Prefix Suffix) array for the needle
        int[] lps = buildLPS(needle);

        int i = 0; // Index for haystack
        int j = 0; // Index for needle

        // Traverse the haystack
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            // If we found a match of the full needle
            if (j == needle.length()) {
                positions.add(i - j ); // 1-based index
                j = lps[j - 1]; // Use LPS to skip unnecessary comparisons
            }
            // If there's a mismatch after some matches, use the LPS array
            else if (i < haystack.length() && haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];  // Use LPS to backtrack
                } else {
                    i++;
                }
            }
        }

        return positions;
    }

    // Build the LPS (Longest Prefix Suffix) array
    public static int[] buildLPS(String needle) {
        int[] lps = new int[needle.length()];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // Backtrack to previous possible match length
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}
