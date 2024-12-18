package org.example;

import java.util.Scanner;

public class Candy {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            int n=sc.nextInt();
            if(n==-1)
                break;
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int sum=0;
            for(int i=0;i<n;i++)
                sum+=arr[i];

            if(sum%n!=0)
                System.out.println("-1");
            else
            {
                int average=sum/n;
                int cnt=0;
                for(int i=0;i<n;i++)
                {
                    if(arr[i]>average)
                        cnt+=arr[i]-average;
                }
                System.out.println(cnt);
            }

        }
    }
}
