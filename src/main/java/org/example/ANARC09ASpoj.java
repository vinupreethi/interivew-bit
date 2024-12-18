package org.example;

import java.util.Scanner;
import java.util.Stack;

public class ANARC09ASpoj {
    public static void main(String args[]) throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        int ik=1;
        while (true) {
            String str = scanner.next();

            String ans = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '}' || str.charAt(i) == '{')
                    ans += str.charAt(i);
            }
            if (ans.equals(""))
                break;

            Stack<Character> stack = new Stack<>();
            int unmatchedclose = 0;
            for (int i = 0; i < ans.length(); i++) {
                if (ans.charAt(i) == '{') {
                    stack.push(ans.charAt(i));
                } else if (ans.charAt(i) == '}' && !stack.isEmpty())
                    stack.pop();
                else if (ans.charAt(i) == '}' && stack.isEmpty()) {
                    unmatchedclose++;
                }
            }
            int unmatchedopen = stack.size();
           // System.out.println(unmatchedopen + " " + unmatchedclose);
            int result = 0;
            if (unmatchedopen % 2 == 1) {
                result += (unmatchedopen / 2) + 1;
            } else if (unmatchedopen % 2 == 0) {
                result += (unmatchedopen / 2);
            }

            if (unmatchedclose % 2 == 1) {
                result += (unmatchedclose / 2) + 1;
            } else if (unmatchedclose % 2 == 0) {
                result += (unmatchedclose / 2);
            }
            System.out.println(ik+"."+" "+result);
            ik++;

        }
    }
}
