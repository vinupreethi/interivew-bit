package org.example;

public class SumWisePair {
    public static void main(String args[]) {
        int a[] = {2, 4, 6};
        long ans = 0L;
        for (int i = 0; i < 32; i++) {

            int count0 = 0;
            int count1 = 0;
            for (int j = 0; j < a.length; j++) {
                if ((a[j] & (1 << i)) != 0)
                    count0++;
                else
                    count1++;
            }
            ans = (ans + (count1 * count0 * 2L) % 1000000007) % 1000000007;
        }
        System.out.println(ans);

    }

}

