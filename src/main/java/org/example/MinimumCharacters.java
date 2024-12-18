package org.example;

public class MinimumCharacters {
    public static void main(String args[]) {
        String str = "mmtatbdzqsoemuvnpppsu";
        int start = 0;
        int end = str.length() - 1;
        int len = 0;
        while (end >= 0) {
            int j = end;

            while (start <= j && str.charAt(start) == str.charAt(j)) {
                start++;
                j--;
                if (start == j) {
                    System.out.println(start);
                    len = end;
                    System.out.println(str.length()-len-1);
                    break;
                }
            }


            start = 0;
            end--;


        }
       // System.out.println(str.length() - len - 1);
    }
}
