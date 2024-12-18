package org.example;

import java.util.Arrays;

public class add_arrays {
    public static void main(String args[])
    {
        int a[] = {3, 0, 5  };
       int b[]={ 3,6};
        int n=a.length-1; //8
        int m=b.length-1; //3

        int i=n;
        int j=m;
        int k=0;
        if(i>j)
          k=n+1; //9
        else
           k=m+1;
        int carry=0;
        int result[]=new int[k+1]; //10
        int sum=0;
        while(i>=0 && j>=0)
        {
            sum=a[i]+b[j]+carry;
            carry=sum/10;
            sum=sum%10;
            result[k]=sum;
            i--;
            j--;
            k--;
        }
        if(i>=0)
        {
            while(i>=0)
            {
                sum=a[i]+carry;
                carry=sum/10;
                sum=sum%10;
                result[k]=sum;
                k--;
                i--;
            }
        }
        else if(j>=0)
        {
            while(j>=0)
            {
                sum=b[j]+carry;
                carry=sum/10;
                sum=sum%10;
                result[k]=sum;
                k--;
                j--;
            }
        }

        result[0]=carry;

        if(result[0]==0)
        {
            Arrays.copyOfRange(result,1,result.length);
        }

        for(i=0;i<result.length;i++)
            System.out.println("result[i] = " + result[i]);


        
    }
}
