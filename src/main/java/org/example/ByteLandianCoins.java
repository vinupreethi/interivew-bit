package org.example;

import java.util.Scanner;

public class ByteLandianCoins {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt())
        {
            int n1=scanner.nextInt();
            int ans1=n1/2;
            int ans2=n1/3;
            int ans3=n1/4;
            
            int sum=ans1+ans2+ans3;
            System.out.println(sum);
            
            
        }
    }
}
