package org.example;

public class MajorityElement {
    public static void main(String args[])
    {
        int a[]={3,2,3};
        int n=a.length;
        int first=a[0];
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(first==a[i])
                count++;
            else {
                count--;
                if(count==0) {
                    first = a[i];
                    count = 1;
                }
            }
        }
        int cnt=0;
        System.out.println("count = " + count);
        System.out.println("first = " + first);
        if(count>0) {
            for (int j = 0; j < n; j++) {
                if (a[j] == first) {
                    cnt++;
                }
            }
        }
        System.out.println("cnt = " + cnt);
        if(cnt>Math.floor(n/2))
            System.out.println(first);

    }
}
