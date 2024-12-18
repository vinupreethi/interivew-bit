package org.example;

public class TrailingZerosinFactorial {
    public static void main(String args[])
    {
        int n=10;
        int count=0;
        for(int i=5;n/i>1;i=i*5)
        {
            count+=n/i;
        }
        System.out.println("count = " + count);
    }
}
