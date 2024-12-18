package org.example;

public class MaxAbsoluteDifference {
    public static void main(String args[]) {
        int a[] = {1, 3, -1};
        int answer1=Integer.MIN_VALUE;
        int answer2=Integer.MIN_VALUE;
        int answer3=Integer.MAX_VALUE;
        int answer4=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            answer1 = Math.max(answer1, a[i] + i);
            answer3 = Math.min(answer2, a[i] + i);
            answer3 = Math.max(answer3, a[i] - i);
            answer4 = Math.min(answer4, a[i] - i);
        }
        System.out.println(Math.max(answer1 - answer2, answer3 - answer4));
    }
}
