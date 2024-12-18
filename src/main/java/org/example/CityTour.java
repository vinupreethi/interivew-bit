package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CityTour {
    public static void main(String args[]) {
        int a = 4;
        int b[] = {3,1};

        int n = b.length;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < b.length; i++) {

            if (b[i] - 1 >= 1)
                s.add(b[i] - 1);
            if (b[i] + 1 <= a)
                s.add(b[i] + 1);
        }
        System.out.println("s = " + s);

        int answer = 0;
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) {
            answer += get_factorial(a-n-1);
            it.next();
        }
        System.out.println("answer = " + answer);
    }

    private static int get_factorial(int n) {

        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }
}
