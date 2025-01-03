package org.example;

public class MaxScore {
    public static void main(String args[]) {
        String str = "011101";
        int n = str.length();
        int prefix[] = new int[n];
        if (str.charAt(0) == '0')
            prefix[0] = 1;
        else
            prefix[0] = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '0')
                prefix[i] = prefix[i - 1] + 1;
            else
                prefix[i] = prefix[i - 1];
        }
        int suffix[] = new int[n];
        if (str.charAt(n - 1) == '1')
            suffix[n - 1] = 1;
        else
            suffix[n - 1] = 0;

        for (int j = str.length() - 2; j >= 0; j--) {
            if (str.charAt(j) == '1')
                suffix[j] = suffix[j + 1] + 1;
            else
                suffix[j] = suffix[j + 1];
        }
        int maxim = 0;
        for (int ik = 0; ik < n - 1; ik++) {
            maxim = Math.max(prefix[ik] + suffix[ik + 1], maxim);
        }
        maxim=Math.max(maxim,prefix[n-1]);
        System.out.println(maxim);


    }
}
