package org.example;

import java.util.Scanner;

public class NSteps_SPOJ {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(x==0 && y==0)
            {
                System.out.println(0);
            }
            else if(x==1 && y==1)
            {
                System.out.println(1);
            }
            else if(x==y && x%2==0 && y%2==0)
            {
                System.out.println(x+y);
            }
            else if(x==y+2 && x%2==0 && y%2==0)
            {
                System.out.println(x+y);
            }
            else if(x==y+2 && x%2!=0 && y%2!=0)
            {
                System.out.println(x+y-1);
            }
            else if(x==y && x%2!=0 && y%2!=0)
            {
                System.out.println(x+y-1);
            }
            else
            {
                System.out.println("No Number");
            }
        }

    }
}
