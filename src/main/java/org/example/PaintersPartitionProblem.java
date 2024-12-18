package org.example;

public class PaintersPartitionProblem {
    public static void main(String args[]) {
        int a = 1;
        int b = 1000000;
        int c[] = {1000000, 1000000};
        long c1[] = new long[c.length];
        for (int s = 0; s < c.length; s++)
            c1[s] = c[s];
        for (int i = 0; i < c.length; i++)
            c[i] = c[i] * b;

        for (Integer ks : c)
            System.out.println(ks);
        long sum = 0L;
        int maxim = Integer.MIN_VALUE;
        for (int j = 0; j < c.length; j++) {
            sum += c[j];
            maxim = Math.max(c[j], maxim);
        }
        long low = maxim;
        long high = sum;
        long result = 0L;
        while (low <= high) {
            long mid = (low + high) / 2;
            long cnt = painters(mid, c);
            if (cnt <= a) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(result  % 10000003);


    }

    private static long painters(long mid, int c[]) {
        long cnt = 1L;
        long result = 0L;
        for (int k = 0; k < c.length; k++) {
            if ((result + c[k]) <= mid)
                result += c[k];
            else {
                cnt++;
                result = c[k];
            }
        }
        return cnt;

    }
}
