package org.example;

public class MinLightsToActiviate {
    public static void main(String args[])
    {
        int[] a={0, 0, 1, 1, 1, 0, 0, 1};
        int b=3;
        int n=a.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int start=Math.max(i-b+1,0);
            int end=Math.min(i+b-1,n-1);
            boolean found=true;
            
            while(end>=start)
            {
                if(a[end]==1)
                {
                    i=end+b;
                    cnt++;
                    found=true;
                    break;
                }
                end--;
            }
            if(found==false)
            {
                System.out.println(-1);
            }
        }
        System.out.println("cnt = " + cnt);

    }
}
