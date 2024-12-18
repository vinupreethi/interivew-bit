package org.example;

public class MaximSumTriplet {
    public static void main(String args[]) {
        int a[] = {1,2,3};
        int n = a.length;
        int suffix[] = new int[n];
        suffix[n-1]=a[n-1];
        for (int i = n - 2; i >= 0; i--)
            suffix[i] = Math.max(a[i],suffix[i+1]);
        int minim=a[0];
        int answer=0;
        for(int i=1;i<n;i++)
        {
            if(minim < a[i] && a[i] < suffix[i+1])
            {
                answer=Math.max(answer,minim+a[i]+suffix[i+1]);
                break;
            }
            if(a[i]<minim)
                minim=a[i];
        }
        System.out.println("answer = " + answer);


    }
}

