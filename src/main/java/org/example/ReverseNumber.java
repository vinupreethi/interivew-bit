package org.example;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t!=0)
        {
            int first=sc.nextInt();
            int second=sc.nextInt();
            int reverse_first=0;
            int reverse_second=0;
            while(first!=0)
            {
                int answer=first%10;
                reverse_first=reverse_first*10+answer;
                first=first/10;
            }

            while(second!=0)
            {
                int answer=second%10;
                reverse_second=reverse_second*10+answer;
                second=second/10;
            }

           int result= reverse_first+reverse_second;
            int reverse_end=0;
            while(result!=0)
            {
                int answer=result%10;
                reverse_end=reverse_end*10+answer;
                result=result/10;
            }
            System.out.println(reverse_end);

            t--;
        }
    }
}
