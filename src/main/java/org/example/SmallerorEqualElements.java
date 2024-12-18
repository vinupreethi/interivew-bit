package org.example;

public class SmallerorEqualElements {
    public static void main(String args[]) {
        int a[] = {1,2,5,5};
        int b = 3;

        int low = 0;
        int high = a.length - 1;
        int index = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] <= b) {
               low = mid + 1;
            } else if (a[mid] > b) {
                high = mid - 1;

            }
        }
        System.out.println(high);
    }
}
