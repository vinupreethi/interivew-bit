package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class SortingBankAccounts {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t!=0)
        {
            int n=scanner.nextInt();
            String a[]=new String[n];
            for(int i=0;i<n;i++)
                a[i]=scanner.next();

            Arrays.sort(a);
            int cnt=1;
            System.out.println(a[0]+" "+cnt);
            for(int j=1;j<n;j++)
            {
                if(a[j]==a[j-1])
                {
                    cnt++;
                    System.out.println(a[j]+" "+cnt);
                }
                else
                {
                    cnt=1;
                    System.out.println(a[j]+" "+cnt);
                }
            }
            t--;
        }
    }
}
