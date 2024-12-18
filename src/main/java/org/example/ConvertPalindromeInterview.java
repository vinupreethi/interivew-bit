package org.example;

public class ConvertPalindromeInterview {
    public static void main(String args[]) {
        String str = "phmjjmap";

        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome1 = true;
        boolean isPalindrome2= true;
        int flag = 0;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else if (flag == 0) {
                flag = 1;
                start++;
            } else {
                isPalindrome1 = false;
            }
                start++;
                end--;


        }
        start=0;
        end=str.length()-1;
        flag=0;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else if (flag == 0) {
                flag = 1;
                end--;
            } else {
                isPalindrome2 = false;
            }
            start++;
            end--;

        }

        if(isPalindrome1 || isPalindrome2)
            System.out.println(1);

    }
}
