package org.example;

import java.util.Scanner;

public class ExampleRecursion {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int x=15;
        int y=4;

        int target=18;
        System.out.println(recurse(x,y,target));
    }

    private static boolean recurse(int x, int y, int target) {
        if(x>target || y>target)
            return false;
        if(x==target || y==target)
            return true;
       return recurse(x+y,y,target) || recurse(x,x+y,target);
    }
}
