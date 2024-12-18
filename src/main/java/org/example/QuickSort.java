package org.example;

public class QuickSort {
    public static void main(String args[])
    {
        int nums[]={110,100,0};
        doQuickSort(nums, 0, nums.length-1);
       for(Integer i:nums)
           System.out.print(i+" ");

    }
    private static void doQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p_index = partition(arr, low, high);
            doQuickSort(arr, low, p_index - 1);
            doQuickSort(arr, p_index + 1, high);
        }


    }


    private static int partition(int[] a, int low, int high) {
        int i = low;
        int j = high;
        int pivot = a[low];
        while(i<j) {
            while (i <= high-1 && a[i] <= pivot)
                i++;
            while (j >= low+1  && a[j] > pivot)
                j--;

            if (i < j) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

            }
        }

        int temp=a[j];
        a[j]=a[low];
        a[low]=temp;



        return j;
    }
}
