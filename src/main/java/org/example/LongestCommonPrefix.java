package org.example;

public class LongestCommonPrefix {
    public static void main(String args[])
    {
        String a[]={"abcdefgh", "aefghijk", "abcefgh"};
        int result=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            result=Math.min(a.length,result);
        }
        
    }
}
