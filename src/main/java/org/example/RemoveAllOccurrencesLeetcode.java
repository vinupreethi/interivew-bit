package org.example;

import java.util.Stack;

public class RemoveAllOccurrencesLeetcode {
    public static void main(String args[]) {
        String s = "daabcbaabcbc";
        String part = "abc";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if (stack.size() >= part.length()) {
                if (checkMatch(stack, part)) {
                    int size=part.length();
                    while(size!=0)
                    {
                        stack.pop();
                        size--;
                    }

                }
            }
        }
        StringBuilder sbr=new StringBuilder();
        while(!stack.isEmpty())
        {
            sbr.append(stack.pop());
        }
        System.out.println(sbr.reverse().toString());

    }

    private static boolean checkMatch(Stack<Character> stack, String part) {
        Stack<Character> copy = new Stack<>();
        copy.addAll(stack);
        for (int i = part.length() - 1; i >= 0; i--) {
            if (copy.peek() != part.charAt(i)) {
                return false;
            }
            copy.pop();
        }
        return true;


    }
}
