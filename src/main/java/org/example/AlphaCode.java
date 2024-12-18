package org.example;

import java.util.Scanner;

public class AlphaCode {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        while(true) {
            String str=scanner.next();
            if(str=="0")
                break;
            int n = str.length();
            int dp[] = new int[n + 1];
            dp[0] = 1;
            if (str.charAt(0) != '0')
                dp[1] = 1;
            else
                dp[1] = 0;

            for (int i = 2; i <= n; i++) {
                Integer first = Integer.parseInt(str.substring(i - 1, i));
                Integer second = Integer.parseInt(str.substring(i - 2, i));

                if (first <= 9 && first >= 1)
                    dp[i] += dp[i - 1];
                if (second <= 26 && second >= 10)
                    dp[i] += dp[i - 2];
            }
            System.out.println(dp[n]);
        }
    }
}
