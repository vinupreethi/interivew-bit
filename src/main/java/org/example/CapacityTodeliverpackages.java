package org.example;

public class CapacityTodeliverpackages {
    static long ans = 0L;
    static long result;

    public static void main(String args[]) {
        int a[] = {5, 10, 15, 20};
        int b = 3;
        long sum = 0L;
        int maxim = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            maxim = Math.max(maxim, a[i]);
        }

        long low = maxim;
        long high = sum;
        long answer = sum;
        while (low <= high) {
            long mid = (low + high) / 2;
            int resultdays = function(Math.toIntExact(mid), a);
            if (resultdays <= b) {
                high = mid - 1;
                answer=mid;

            } else if (resultdays > b) {
                low = mid + 1;
            }
        }
        System.out.println(answer);

    }

    private static int function(int weight, int[] a) {
        int count = 1;
        long answer = 0L;
        for (int i = 0; i < a.length; i++) {
            if (answer + a[i] <= weight)
                answer += a[i];
            else {
                answer = a[i];
                count++;
            }
        }
        return count;
    }
}

//public class Solution {
//    static long ans = 0L;
//    public int solve(int[] a, int b) {
//        long sum = 0L;
//        int maxim = Integer.MIN_VALUE;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//            maxim = Math.max(maxim, a[i]);
//        }
//
//        long low = maxim;
//        long high = sum;
//        long answer = sum;
//        while (low <= high) {
//            long mid = (low + high) / 2;
//            int resultdays = function((int) mid, a);
//            if (resultdays <= b) {
//                high = mid - 1;
//                answer=mid;
//
//            } else if (resultdays > b) {
//                low = mid + 1;
//            }
//        }
//        return (int) answer;
//
//
//    }
//
//    private static int function(int weight, int[] a) {
//        int count = 1;
//        long answer = 0L;
//        for (int i = 0; i < a.length; i++) {
//            if (answer + a[i] <= weight)
//                answer += a[i];
//            else {
//                count++;
//                answer = a[i];
//            }
//        }
//        return count ;
//    }
//}

