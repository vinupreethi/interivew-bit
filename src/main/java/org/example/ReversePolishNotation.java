package org.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while(n!=0)
        {
            Stack<Character> stack=new Stack<>();
            HashMap<Character,Integer> hm=new HashMap<>();
            hm.put('(',1);
            hm.put('+',2);
            hm.put('-',2);
            hm.put('*',3);
            hm.put('/',3);
            hm.put('^',4);
            String input=scanner.next();
            int len=input.length();

            for(int i=0;i<len;i++)
            {
                    if(hm.containsKey(input.charAt(i)))
                    {
                        stack.push(input.charAt(i));
                    }
                    else if(input.charAt(i)==')')
                    {
                        while(stack.peek()=='(')
                            stack.pop();
                        System.out.print(stack.pop());
                    }
                    else
                        System.out.print(input.charAt(i));

            }
            System.out.println();







            n--;
        }
    }
}
