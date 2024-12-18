package org.example;

public class Lights_to_activate {

    public static void main(String args[])
    {
        int a[]={0, 0, 1, 1, 1, 0, 0, 1};
        int B=3;
        int i=0;
        int n=a.length;
        int count=0;
        while(i<n)
        {

            int start=Math.max(0,i-B+1);
            int end=Math.min(i+B-1,n-1);
            boolean found=false;
            for(int j=end;j>=start;j--)
            {
                if(a[j]==1)
                {
                    found=true;
                    i=end+B;
                    count++;
                    break;
                }

            }
            if(found==true)
                System.out.println(-1);


        }
        System.out.println("count = " + count);
    }
}
