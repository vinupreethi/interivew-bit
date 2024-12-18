package org.example;

import java.util.Arrays;

public class perfectPeakArray {

    public static void main(String args[]) {
        String a[]={"2.093676", "2.310988", "0.942337", "1.562470", "2.256252", "2.225413", "1.397771", "2.436117"};
        
        int n=a.length;
        double result[]=new double[n];
        for(int k=0;k<n;k++)
            result[k]=Double.parseDouble(a[k]);
        Arrays.sort(result);
        for(Double d:result)
            System.out.println("d = " + d);
        int j=n-1;
        int i=0;
        double sum=0;
        while(i<=j) {
            int mid=i+1;
            if(mid==j)
                break;
            if (result[i] + result[j] + result[mid] < 2.0 && result[i] + result[j] + result[mid] > 1.0) {
                System.out.println("1 = " + 1);
            } else if (result[i] + result[j] + result[mid] < 1) {
                i++;
            } else if (result[i] + result[j] + result[mid] >= 2) {
                j--;
            }
        }





    }
}
