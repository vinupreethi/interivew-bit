package org.example;

public class Minimum_steps {
    public static void main(String args[])
    {
        int a[]={ 1,1,1,1};
                 //0 1 2 3   4   5  6  7
        int b=3;
        System.out.println(solve(a,b));
    }
    public static int solve(int[] a, int B) {
        int n=a.length;
        int i=0;
        int count=0;
        while(i<n)
        {
            if(a[i]==1)
            {
                int end=Math.min(i+B-1,n-1);
                int start=i-B+1;
                if(start<0)
                    start=0;
                int flag=0;
                while(start<end && start<n)
                {

                    if(a[start]==1)
                    {

                        if(flag==0)
                        {
                            count++;
                            flag=1;
                        }
                    }


                    start++;
                }
            }
            i++;

        }
        for(i=0;i<n;i++)
            if(a[i]==0)
                return -1;

        return count;
    }
}
