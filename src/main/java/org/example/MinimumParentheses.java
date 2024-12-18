package org.example;

import java.util.Stack;

public class MinimumParentheses {
    public static void main(String args[])
    {
        String a="))()";
        int cnt=0;
        Stack<Character> stack=new Stack<>();
        int openclosecount=0;
        for(int i=0;i<a.length();i++)
        {
          if(a.charAt(i)=='(')
              openclosecount++;
          else if(openclosecount>0 && a.charAt(i)==')')
             openclosecount--;
          else
              cnt++;

        }

        System.out.println(openclosecount+cnt);
    }
}
