package org.example;

public class SearchinBiotonicArray {
    public static void main(String args[]) {
        int a[] = {3, 9, 10, 20, 17, 5, 1};
        int b = 20;
        int low = 0;
        int pivot=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i-1]<a[i])
                pivot=i;
        }
        int high=pivot;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (b == a[mid]) {
                System.out.println(mid);
                break;
            } else if (b < a[mid]) {
                high = mid - 1;
            } else if (b > a[mid]) {
                low = mid + 1;
            }
        }
        low = pivot+1;
        high=a.length-1;
        while(low <=high)
        {
            int mid = (low + high) / 2;
            if (b == a[mid]) {
                System.out.println(mid);
                break;
            } else if (b > a[mid]) {
                high = mid - 1;
            } else if (b < a[mid]) {
                low = mid + 1;
            }
        }
    }
}
