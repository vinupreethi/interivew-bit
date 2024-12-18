package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            int low=1;
            int high=a[n-1];
            int answer=0;
            while(low <= high)
            {
                int mid=(low+high)/2;
               if(getResult(a, n, c,mid))
               {
                   low=mid+1;
                   answer=Math.max(mid,answer);

               }
               else
               {
                   high=mid-1;
               }

            }

            System.out.println(answer);
            t--;

        }

    }

    private static boolean getResult(int[] a, int n, int c,int dist) {
            int first_cow = a[0];
            int count=1;
            for (int cow = 1; cow < n; cow++) {
                if ((a[cow] - first_cow) >= dist) {
                    first_cow = a[cow];
                    count++;
                }


            if (count >= c)
                return true;
        }
            return false;

    }


}
