package org.example;

public class GcdInteger {
    public static void main(String args[]) {
        int gcd = greatest(28, 20);
        System.out.println("gcd = " + gcd);
    }

    private static int greatest(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > b)
            return greatest(a % b, b);
        return greatest(b % a, a);

    }
}
