package org.example;

public class ImplementStrStr {
    public static void main(String args[]) {
        String string = "aaaabbbb";
        String pattern = "aabb";

        int lps[] = new int[pattern.length()];
        int len = 0;
        int start = 1;
        lps[0]=0;
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
        len=0;
        start=0;
        while (start < string.length()) {
            if (pattern.charAt(len) == string.charAt(start)) {
                len++;
                start++;
                if(pattern.length() == len)
                {
                    System.out.println(1);
                }
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    start++;
                }
            }
        }




    }
}
