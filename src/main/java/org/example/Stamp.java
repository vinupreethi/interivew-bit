package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Stamp {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        long ans = 1L;
        while (t != 0) {
            long stamps = scanner.nextLong();
            int n = scanner.nextInt();
            long arr[] = new long[n];

            long sum = 0L;
            long cnt = 0L;
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

            doMergeSort(arr,0,n-1);
            for (int i = n - 1; i >= 0; i--) {
                sum += arr[i];
                cnt++;
                if (sum >= stamps) {
                    break;
                }


            }
            System.out.println("Scenario #" + ans + ":");
            if (sum >= stamps)
                System.out.println(cnt);
            else
                System.out.println("impossible");

            ans++;


            t--;
        }
    }

    private static void doMergeSort(long[] arr, int low, int high) {
        if(low>=high)
        {
            return;
        }
        int mid=(low+high)/2;
        doMergeSort(arr,low,mid);
        doMergeSort(arr,mid+1,high);
        merging(arr,low,mid,high);
    }

    private static void merging(long[] arr, int low, int mid, int high) {
        int left=low;
        int right=mid+1;
        ArrayList<Long> arrayList=new ArrayList<>();
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                arrayList.add(arr[left]);
                left++;
            }
            else
            {
                arrayList.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            arrayList.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            arrayList.add(arr[right]);
            right++;
        }

        int size=arrayList.size();
        int k=0;
        while(k<size)
        {
            arr[low]=arrayList.get(k);
            k++;
            low++;
        }
    }

    private static void doQuickSort(long[] arr, int low, int high) {
        if (low < high) {
            int p_index = partition(arr, low, high);
            doQuickSort(arr, low, p_index - 1);
            doQuickSort(arr, p_index + 1, high);
        }


    }


    private static int partition(long[] a, int low, int high) {
        int i = low;
        int j = high;
        long pivot = a[low];
        while(i<j) {
            while (i <= high-1 && a[i] <= pivot)
                i++;
            while (j >= low+1  && a[j] > pivot)
                j--;

            if (i < j) {
                long temp=a[i];
                a[i]=a[j];
                a[j]=temp;

            }
        }

        long temp=a[j];
        a[j]=a[low];
        a[low]=temp;



        return j;
    }
}
