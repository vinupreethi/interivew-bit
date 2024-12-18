package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CountInversions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long t=sc.nextInt();
        while(t!=0) {
            int n=sc.nextInt();
            long a[]=new long[n];
            for (int i = 0; i < n; i++) {
               a[i]=sc.nextLong();
            }
            int cnt = (int) mergeSort(a, 0, n - 1);
            System.out.println(cnt);
            t--;
            }


    }


    private static long mergeSort(long[] arr, int low, int high) {
        long cnt=0L;
        if (low >= high) return cnt;
        int mid = (low + high) / 2;
        cnt+=mergeSort(arr, low, mid);
        cnt+=mergeSort(arr, mid + 1, high);
        cnt+=arraymerge(arr, low, mid, high);
        return cnt;
    }

    private static long arraymerge(long[] arr, int low, int mid, int high) {
        long cnt=0L;
        int left = low;
        int right = mid + 1;
        ArrayList<Long> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
                cnt+=(mid-left+1);

            }


        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }


        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
        return cnt;
    }
}
