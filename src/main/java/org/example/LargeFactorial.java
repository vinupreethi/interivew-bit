package org.example;

import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String args[])
    {
        int n=4;

        BigInteger answer= BigInteger.valueOf(1);

        for(int i=2;i<=n;i++)
        {
            answer=answer.multiply(BigInteger.valueOf(i));
        }
        String result=answer.toString();
        System.out.println(result);
    }
}
