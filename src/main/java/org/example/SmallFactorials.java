package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0) {
            long n = sc.nextLong();
            BigInteger res=BigInteger.ONE;
            if(n==0)
                System.out.println(1);
            else if(n==1)
                System.out.println(1);
            else {
                for (int i = 2; i <= n; i++) {
                    res = res.multiply(BigInteger.valueOf(i));
                }
                System.out.println(res);
            }
            t--;
        }
    }


}
