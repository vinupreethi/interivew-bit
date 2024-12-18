package org.example;

public class SpecialArray {
    public static void main(String args[]) {
        int nums[] = {1,1};
        int[][] queries = {{0, 1}};
        boolean arr[] = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int toggle = 0;
            int flag = 0;
            if (nums[start] % 2 == 1)
                toggle = 1;
            for (int j = start + 1; j <= end; j++) {
                if (toggle == 1) {
                    if (nums[j] % 2 == 0) {
                        flag = 1;
                        break;
                    }
                    toggle = 0;
                } else {
                    if (nums[j] % 2 != 0) {
                        flag = 1;
                        break;
                    }
                    toggle = 1;
                }
            }
            if (flag == 1)
                arr[i] = false;
            else
                arr[i] = true;
        }
        for(boolean a:arr)
            System.out.println(a);
    }
}
