package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class AddOnetoNumber {
    public static void main(String args[]) {
        int a[] = {1,2,3,3,4};

        int n = a.length - 1;
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        int carry = 0;
        while (n >= 0) {
            System.out.println("carry = " + carry);
            if (n == a.length - 1) {
                sum = (a[n] + 1) % 10;
                carry =( a[n] + 1) / 10;
            } else {
                sum = (a[n] + carry) % 10;
                carry =( a[n] + carry) / 10;
            }
            arr.add(sum);
            n--;

        }
        if(carry > 0)
             arr.add(carry);
        Collections.reverse(arr);
        int i;
        for( i=0;i<arr.size();i++)
        {
            if(arr.get(i)!=0)
                break;
        }
        int result[]=new int[n-i-1];

        System.out.println("arr = " + arr);
    }
}
