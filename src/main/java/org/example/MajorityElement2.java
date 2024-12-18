package org.example;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static void main(String args[])
    {
        int a[]={2,1,1,3,1,4,5,6};
        List<Integer> result=new ArrayList<>();
        int first=a[0];
        int second=a[0];
        int count1=0;
        int count2=0;
        int n=a.length;

        for(int i=0;i<n;i++)
        {
            if(first!=a[i] && count1==0)
            {
                first=a[i];
                count1++;
            }
            else if(second!=a[i] && count2==0)
            {
                second=a[i];
                count2++;
            }
            else if(first==a[i])
                count1++;
            else if(second==a[i])
                count2++;
            else
            {
                count1--;
                count2--;
                if(count1==0)
                {
                    first=a[i];
                    count1++;
                }
                else if(count2==0)
                {
                    second=a[i];
                    count2++;
                }
            }
        }
        int cnt1=0;int cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(first==a[i])
                cnt1++;
            else if(second==a[i])
                cnt2++;
        }
        System.out.println(first);
        System.out.println(second);
        if(cnt1> Math.floor(n/3))
            result.add(first);
        if(cnt2> Math.floor(n/3))
            result.add(second);



    }
}
