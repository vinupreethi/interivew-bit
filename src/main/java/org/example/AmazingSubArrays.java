package org.example;

public class AmazingSubArrays {
    public static void main(String args[])
    {
        String a="ABEC";
        a= a.toLowerCase();
        int n=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='o' || a.charAt(i)=='u' || a.charAt(i)=='i')
            {
                n+=(a.length()-i);
            }
        }
        System.out.println(n);
    }
}
