package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = {5, 4, 3, 2, 1};

        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int cnt=mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("cnt = " + cnt);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        int cnt=0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2;
         cnt+=mergeSort(arr, low, mid);
         cnt+=mergeSort(arr, mid + 1, high);
         cnt+=arraymerge(arr, low, mid, high);
        return cnt;
    }

    private static int arraymerge(int[] arr, int low, int mid, int high) {
        int cnt=0;
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
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
            temp.add(arr[high]);
            right++;
        }


        int ik = 0;
        for (int j = low; j <= high; j++) {
            arr[j] = temp.get(ik);
            ik++;
        }
        return cnt;
    }
}
