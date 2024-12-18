package org.example;

import java.util.Arrays;

public class TripletsWithSum {

    public static void main(String args[])
    {
        String a[]={"0.503094", "0.648924", "0.999298"};
        Arrays.sort(a);

        int i=0;
        int k=a.length-1;

        while(i<k)
        {
            int j=i+1;
            while(j<k)
            {
                float sum=Float.parseFloat(a[i])+Float.parseFloat(a[j])+Float.parseFloat(a[k]);  if(sum>1 && sum<2) {
                    System.out.println(1);
                    return;
                }
                if(sum<=1)
                    j++;
                else if(sum>=2)
                    k--;


            }


            i++;



        }
        System.out.println(0);
        return ;
    

    }
}
