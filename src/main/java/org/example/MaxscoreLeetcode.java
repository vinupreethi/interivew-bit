package org.example;

public class MaxscoreLeetcode {
    public static void main(String args[])
    {
        String str = "011101";
        int ones=0;
        int zero=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
                ones++;
        }
        int answer=0;
        for(int j=0;j<str.length();j++)
        {
            if(str.charAt(j)=='0')
                zero++;
            else
                ones--;
           answer=Math.max(ones+zero,answer);

        }
        System.out.println(answer);

    }
}
