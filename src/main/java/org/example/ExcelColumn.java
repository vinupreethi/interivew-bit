package org.example;

import java.util.HashMap;

public class ExcelColumn {
    public static void main(String args[])
    {
        HashMap<Character,Integer> dict=new HashMap<>();
        int j=1;
        for(char c='A';c<='Z';c++)
        {
            dict.put(c,j);
            j++;
        }
        String str="AABB";
        int len=str.length();
        int answer=0;
        int k=0;
        for(int i=len-1;i>=0;i--)
        {
            answer= (int) (answer + (Math.pow(26,k)) * dict.get(str.charAt(i)));
            k++;
        }
        System.out.println("answer = " + answer);

    }
}
