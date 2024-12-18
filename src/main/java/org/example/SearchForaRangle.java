package org.example;

import java.util.ArrayList;

public class SearchForaRangle {
    public static void main(String args[]) {
        int arr[] = {1, 10, 10, 10, 10, 10, 10};
        int target = 10;

        int low = 0;
        int high = arr.length - 1;
        int beginIndex = arr.length - 1;
        int endIndex = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                beginIndex = Math.min(beginIndex, mid);
                if (beginIndex == 0)
                    break;
                if (arr[beginIndex - 1] != target)
                    break;
                high = mid - 1;

            } else if (target < arr[mid]) {
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                endIndex = Math.max(endIndex, mid);
                if (endIndex == arr.length-1)
                    break;
                if (arr[endIndex + 1] != target)
                    break;
                low = mid + 1;

            } else if (target < arr[mid]) {
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (arr[endIndex] == target && arr[beginIndex] == target) {
            arrayList.add(beginIndex);
            if (beginIndex != endIndex) {

                arrayList.add(endIndex);
            }

        } else {
            arrayList.add(-1);
            arrayList.add(-1);
        }
        System.out.println(arrayList);
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }


    }
}
