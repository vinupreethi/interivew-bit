package org.example;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String args[]) {
        int temperatures[] = {73, 74, 75, 71, 69, 72, 76, 73};
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        stack.push(0);
        int result[] = new int[n];
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i] ) {
                int answer= stack.peek();
                stack.pop();
                int j = i - answer;
                result[answer] = j;
            }
                stack.push(i);
        }
        for (Integer ik : result)
            System.out.println(ik);

    }
}
