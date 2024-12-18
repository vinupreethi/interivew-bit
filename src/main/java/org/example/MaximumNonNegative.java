package org.example;

public class MaximumNonNegative {
    public static void main(String args[])
    {
        int a[]={1, 2, 5, -7, 2, 3,6};
        int sum=0;
        int n=a.length;
        int startIndex=0;
        int endIndex=0;
        int maxsum=0;
        int len=1;
        int startInd = 0;
        int endInd=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                sum=0;
                if(i<=n-1)
                {
                    startIndex=i+1;
                    endIndex=i+1;
                }
                else
                    break;
            }
            else if(a[i]>=0)
            {

                sum+=a[i];
                endIndex=i;
                if(sum>=maxsum)
                {
                    if(sum>maxsum) {
                        maxsum = sum;
                        startInd = startIndex;
                        endInd = endIndex;
                    }
                    else if(sum==maxsum && len<endIndex-startIndex+1)
                    {
                        startInd=startIndex;
                        endInd=endIndex;
                        len=endIndex-startIndex+1;
                    }
                }



            }


        }
        int result[]=new int[endInd-startInd+1];
        int k=0;
        for(int i=startInd;i<=endInd;i++)
        {
            result[k]=a[i];
            k++;
        }
        for(Integer i:result)
            System.out.println("i = " + i);




    }
}
