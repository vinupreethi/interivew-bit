package org.example;

public class RotatedArray {
    public static void main(String args[]) {
        int a[] = {7, 2, 4, 5};
        int low = 0;
        int high = a.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[low] <= a[mid]) {
                ans=Math.min(a[low],ans);
                low = mid + 1;
            } else if(a[mid] <= a[high]){
                ans=Math.min(a[mid],ans);
                high = mid -1;
            }
        }
        System.out.println(ans);

    }
}
