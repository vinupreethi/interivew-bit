package org.example;

public class PrimeNumberWorking {
    public static void main(String args[])
    {
        int number=21;

        for(int i=2;i<number/2;i++)
        {
            if(number%i==0)
                System.out.println("not prime");
        }
        System.out.println("prime  ");
    }
}
