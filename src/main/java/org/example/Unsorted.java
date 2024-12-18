package org.example;

public class Unsorted {
    public static void main(String args[]) {
        int a[] = { 1, 3, 2, 4, 5 };
        int n = a.length;
        int start = -1;
        int end = -1;
        for (int i = 0; i < n-1; i++) {
            if (a[i] > a[i + 1]) {
                start = i;
                break;
            }

        }
        for (int i = n -1; i >= 1; i--) {
            if (a[i - 1]>a[i]) {
                end = i;
                break;
            }
        }
        System.out.println("start+\" \"+end = " + start+" "+end);
        int minim=Integer.MAX_VALUE;
        int maxim=Integer.MIN_VALUE;
       for(int i=start;i<=end;i++)
       {
           maxim=Math.max(a[i],maxim);
           minim=Math.min(a[i],minim);
       }
        System.out.println("minim = " + minim);
        System.out.println("maxim = " + maxim);
       int answer[]=new int[2];
       for(int i=0;i<n;i++)
       {
           if(a[i]>minim)
           {
               answer[0]=i;
               break;
           }
       }
       for(int i=n-1;i>=0;i--)
       {
           if(a[i]<maxim)
           {
               answer[1]=i;
               break;
           }
       }
        System.out.println("answer[0] = " + answer[0]);
        System.out.println("answer[1] = " + answer[1]);



    }
}
