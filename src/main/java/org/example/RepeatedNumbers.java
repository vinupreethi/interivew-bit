package org.example;

public class RepeatedNumbers {
    public static void main(String args[])
    {
        int a[]={1,2,3,1,1};
        
        int n=a.length;
        int first=a[0];
        int second=a[0];
        int count1=1;
        int count2=1;
        for(int i=0;i<n;i++)
        {
            if(first==a[i])
                count1++;
            else if(second==a[i] && first!=second)
                count2++;
            else if(a[i]!=second && a[i]!=first)
            {
                count1--;
                count2--;
                if(count1<=0)
                    first=a[i];
                else if(count2<=0)
                    second=a[i];
            }
        }
        if(count1>=0)
        {
            int cnt1=0;
           for(int i=0;i<n;i++)
           {
               if(first==a[i])
                   cnt1++;
           }
            if(cnt1>n/3)
            System.out.println(first);
        }
        else if(count2>=0)
        {
            int cnt2=0;
            for(int i=0;i<n;i++)
            {
                if(second==a[i])
                    cnt2++;
            }
                if(cnt2>n/3)
            System.out.println(second);
        }
    }
}
