package org.example;

public class MaxChunks {
    public static void main(String args[]) {
        int arr[] = {1, 0, 2, 3, 4};
        int maxim = arr[0];
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {

            maxim=Math.max(maxim,arr[i]);
            if(maxim==i)
                cnt++;


        }
        System.out.println(cnt);
    }
}
