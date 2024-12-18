package org.example;

import java.util.ArrayList;

public class Kth_Permutation {
    public static void main(String args[]) {
        int n = 3;
        int rank = 1;
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            arr.add(i);
        rank--;
        while (arr.size()!=0) {
            int index = rank / fact(n - 1);
            answer += arr.get(index);
            arr.remove(arr.get(index));
            rank = rank % fact(n - 1);
            n--;

        }

        System.out.println("answer = " + answer);


    }

    private static int fact(int n) {
        int answer = 1;
        if (n == 0 || n == 1)
            return 1;
        for (int i = 2; i <= n; i++)
            answer = answer * i;

        return answer;
    }
}
