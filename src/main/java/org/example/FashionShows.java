package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class FashionShows {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        
        long t= scanner.nextLong();
        while(t!=0)
        {
            long n=scanner.nextLong();
            long a[]=new long[(int) n];
            long b[]=new long[(int) n];
            
            for(int i=0;i<n;i++)
                a[i]=scanner.nextLong();
            
            for(int j=0;j<n;j++)
                b[j]=scanner.nextLong();
            Arrays.sort(a);
            Arrays.sort(b);
            long answer=0L;
            for(int k=0;k<n;k++)
            {
                answer=answer+a[k]*b[k];
            }
            System.out.println(answer);
            t--;
        }

    }
}
