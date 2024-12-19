package org.example;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String args[]) {
        int prices[] = {8, 4, 6, 2, 3};
        //             [4,2,4,2,3]
        int result[] = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = prices.length - 1; i >= 0; i--) {


            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                stack.pop();
            }


            if (!stack.isEmpty())
                result[i] = prices[i] - prices[stack.peek()];
            else
                result[i] = prices[i] - 0;

            if (stack.isEmpty() || prices[i] >= prices[stack.peek()])
                stack.push(i);
        }

        for (Integer res : result)
            System.out.println(res);
    }
}
