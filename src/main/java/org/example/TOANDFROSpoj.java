package org.example;

import java.util.Scanner;

public class TOANDFROSpoj {
    public static void main(String args[]) throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if( n == 0)
                break;
            String str = scanner.next();

            int direction = 0;
            int cnt = 0;
            String answer[]=new String[n];
            for(int i=0;i<n;i++)
                answer[i]="";
            for (int i = 0; i < str.length(); i++) {
                if (direction == 0) {

                    answer[i % n] =   answer[i % n]+ str.charAt(i);
                    cnt++;
                    if (cnt == n) {
                        direction = 1; cnt=0;
                    }
                } else {
                    answer[(n - 1) - (i % n)] = answer[(n - 1) - (i % n)] + str.charAt(i);
                    cnt++;
                    if (cnt == n) {
                        direction = 0;
                        cnt=0;
                    }
                }
            }
            String ans="";
            for(int i=0;i<answer.length;i++)
                ans+=answer[i];
            System.out.println(ans);
        }
    }
}
