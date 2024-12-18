package org.example;

import java.util.Scanner;

public class FeyMann {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            long n1=sc.nextInt();
            if(n1==0)
                break;
            long sum=(n1 * (n1+1) * ((2 * n1) +1)) /6;
            System.out.println(sum);
        }
    }
}
