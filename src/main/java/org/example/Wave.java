package org.example;

import java.util.Arrays;

public class Wave {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        Arrays.sort(a);
        int first = 0;
        int second = 1;
        int n = a.length;
        int result[] = new int[n];
        boolean flag = true;
        int k = 0;
        while (k < n) {
            if (flag == true && second < n) {
                result[k] = a[second];
                second += 2;
                flag = false;
            } else if (flag == false && first < n) {
                result[k] = a[first];
                first += 2;
                flag = true;
            }
            k++;
        }
       if(n%2!=0)
           result[n-1]=a[n-1];


        for (Integer ik : result)
            System.out.println(ik);


    }
}
