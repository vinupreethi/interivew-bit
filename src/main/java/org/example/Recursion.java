package org.example;

public class Recursion {
    public static void main(String args[]) {
        String str = "";
        int n = 3;
        int open = 0;
        int close = 0;
        generateParenthesis(str, 0, n, open, close);
    }

    private static void generateParenthesis(String str, int length, int n, int open, int close) {

        if (open + close == 2 * n) {
            System.out.println(str);
        }
        if( open < n)
        generateParenthesis(str + "(", length, n, open + 1, close);
        if(close < open)
        generateParenthesis(str + ")", length, n, open, close + 1);

    }
}
