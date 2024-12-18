package org.example;

import java.util.*;

class Pair {
    int first;
    int second;
}

public class MaximumConsecGap {
    public static void main(String args[]) {
        int a[] = {3, 5, 4, 2};
        List<Pair> ls = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            Pair p = new Pair();
            p.first = a[i];
            p.second = i;
            ls.add(p);
        }
        Arrays.sort(a);
        int result[] = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            int answer=a[i];

            j++;
        }

        for (int i = a.length - 2; i >= 0; i--) {
            result[i] = Math.max(result[i], result[i + 1]);

        }
        for (int ik = 0; ik < a.length; ik++)
            System.out.println(result[ik]);
        int answer = 0;


        for (int k = 0; k < a.length - 1; k++) {


            if (ls.get(k).second <= result[k + 1])
                answer = Math.max(answer, result[k + 1]-ls.get(k).second );
        }
        System.out.println("answer = " + answer);
    }
}
