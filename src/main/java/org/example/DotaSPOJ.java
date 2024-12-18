package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class DotaSPOJ {
    public static void main(String args[]) throws java.lang.Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(reader.readLine());
        //int t = scanner.nextInt();
        while(t--!=0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            int h =Integer.parseInt(tokenizer.nextToken());
            int arr[]=new int[n];
            //tokenizer = new StringTokenizer(reader.readLine());
           // st = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                arr[i]=Integer.parseInt(reader.readLine());
            }
            Arrays.sort(arr);
            int flag = 0;
            int j=0;
            while ( m>0) {
                if(arr[j]<=h)
                {
                    flag=1;
                    break;
                }
                while(arr[j]-h>0)
                {
                    arr[j]=arr[j]-h;
                    m--;
                }
                j++;

            }
            if (flag == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}
