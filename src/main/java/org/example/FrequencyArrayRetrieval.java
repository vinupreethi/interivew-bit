package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FrequencyArrayRetrieval {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long a[] = new long[(int) n];
            int flag = 0;
            for (int ik = 0; ik < n; ik++) {
                a[ik] = sc.nextLong();
            }
            long answer[] = new long[a.length];
            for (long j = 0; j < n; j++) {
                HashMap<Long, Long> corresponding = new HashMap<>();
                HashMap<Long, Long> frequency = new HashMap<>();
                int count = 0;
                for (long hash = 0; hash < n; hash++) {
                    if (frequency.get(a[(int) hash]) != null) {
                        int val = Math.toIntExact(frequency.get(a[(int) hash]));
                        val++;
                        frequency.put(a[(int) hash], (long) val);
                    } else
                        frequency.put(a[(int) hash], 1L);
                }

                for (Map.Entry<Long, Long> mp : frequency.entrySet()) {

                    if ((mp.getValue() % mp.getKey()) != 0) {
                        flag = 1;
                    }

                }


                int jj = 0;
                for (int k = 0; k < n; k++) {
                    if (corresponding.get(a[k]) == null) {


                        int value = Math.toIntExact(frequency.get(a[k]));
                        if (value % a[k] == 0)
                            count++;
                        value--;
                        frequency.put(a[k], (long) value);
                        corresponding.put(a[k], (long) count);
                        answer[jj] = count;
                        jj++;
                    } else {
                        int ans = Math.toIntExact(corresponding.get(a[k]));
                        int value = Math.toIntExact(frequency.get(a[k]));

                        if (value % a[k] == 0)
                            ans++;
                        value--;
                        frequency.put(a[k], (long) value);
                        corresponding.put(a[k], (long) ans);
                        answer[jj] = ans;
                        jj++;
                    }

                }


            }


            if (flag == 1) {
                System.out.print("-1");
            } else {
                for (int ii = 0; ii < answer.length; ii++)
                    System.out.print(answer[ii] + " ");
            }
            System.out.println();
        }
    }
}
