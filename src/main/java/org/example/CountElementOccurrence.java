package org.example;

public class CountElementOccurrence {
    public static void main(String args[]) {
        int a[] = {5, 7, 7, 8, 8, 10};

        int target = 8;
        int low = 0;
        int high = a.length - 1;
        int index1=-1;
        int index2=-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == a[mid]) {
                index1= mid;
                high = mid - 1;
            } else if (target < a[mid]) {
                high = mid - 1;

            } else if (target > a[mid]) {
                low = mid + 1;
            }
        }
        low = 0;
        high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == a[mid]) {
                index2=mid;
                low = mid + 1;
            } else if (target < a[mid]) {
                high = mid - 1;
            } else if (target > a[mid]) {
                low = mid + 1;
            }
        }
        System.out.println(index1+" "+index2);
    }
}
