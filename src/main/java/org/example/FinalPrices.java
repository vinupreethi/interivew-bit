package org.example;

public class FinalPrices {
    public static void main(String args[])
    {
        int prices[]={8,4,6,2,3};
        int i=0;
        int j=1;
        int n=prices.length;
        int result[]=new int[n];
        while(j<n)
        {
            if(i>j)
            {
              j=i+1;
            }
            if(i==j)
            {
                j++;
            }
            else if(i<prices.length && j<prices.length && prices[j]<=prices[i])
            {
                result[i]=prices[i]-prices[j];
                i++;
            }
            else
            {
                j++;
            }
        }
        while(i<n)
        {
            result[i]=prices[i];
            i++;
        }
       // System.out.println(i);
        for(Integer ij:result)
            System.out.println(ij);
    }
}
