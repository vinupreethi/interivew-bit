package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPrimes {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> prime=new ArrayList<>();
        for(int i=2;i<=n;i++)
        {
            int flag=0;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if((i%j)==0 && i!=2)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                prime.add(i);
        }
        int answer[]=new int[prime.size()];
        for(int i=0;i<answer.length;i++)
            answer[i]=prime.get(i);
    }
}
