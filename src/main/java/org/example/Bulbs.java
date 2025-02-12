package org.example;

public class Bulbs {
    public static void main(String args[]) {
        int a[] = {1, 1, 1, 1, 0, 1, 1, 0, 1, 0};
        int toggle = 0;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 && toggle == 0) {
                cnt++;
                toggle = 1;
            } else if (toggle == 1 && a[i] == 1) {
                toggle = 0;
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
