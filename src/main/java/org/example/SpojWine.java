package org.example;

import java.util.Scanner;

public class SpojWine {
    public static void main(String args[]) {
        int t;
        Scanner scanner=new Scanner(System.in);
        while(true) {

            int n=scanner.nextInt();
            if(n==0)
                break;
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=scanner.nextInt();
            var answer = answer(n, arr);
            System.out.println(answer);

        }
    }

    private static Integer answer(int n, int[] arr) {
        int buy = 0;
        int sell = 0;
        int answer = 0;
        while (buy < n && sell < n) {
            while (arr[buy] <= 0 && buy< n) {
                buy++;
                if(buy== n)
                    return answer;
            }
            while (arr[sell] >= 0 && sell< n) {
                sell++;
                if(sell== n)
                    return answer;
            }
            if (Math.abs(arr[buy]) >= Math.abs(arr[sell])) {
                answer += Math.abs(arr[sell]) * Math.abs(buy - sell);
                arr[buy] += arr[sell];
                arr[sell] = 0;
            } else {
                answer += Math.abs(buy - sell) * arr[buy];
                arr[sell] += arr[buy];
                arr[buy]=0;
            }


        }
        return answer;
    }
}
