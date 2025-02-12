package org.example;

public class fibrec {
    public static void main(String args[])
    {
        int dp[]=new int[5];
        //System.out.println(fibonacci(1,dp));
        //System.out.println(fibonacci(2,dp));
       // System.out.println(fibonacci(3,dp));
        System.out.println(fibonacci(4,dp));
    }
    public static int fibonacci(int number,int dp[])
    {
        if(number==0)
            return 0;
        if(number==1)
            return 1;
        return dp[number]=fibonacci(number-1,dp)+fibonacci(number-2,dp);
    }

}
