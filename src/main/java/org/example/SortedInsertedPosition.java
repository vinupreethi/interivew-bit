package org.example;

public class SortedInsertedPosition {
    public static void main(String args[]) {
        int arr[] = {1, 2, 5, 7, 8};
        int low = 0;
        int high = arr.length - 1;
        int target = 6;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid])
                System.out.println(mid);
            else if (target < arr[mid])
                high = mid - 1;
            else if (target > arr[mid])
                low = mid + 1;
        }
        System.out.println(low);
    }
}
