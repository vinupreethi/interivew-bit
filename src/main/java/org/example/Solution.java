package org.example;

import java.util.Scanner;

public class Solution {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int answer=n-2;
        if(answer==0)
            System.out.println("NO");
        else if(answer%2==0 && n%2==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
