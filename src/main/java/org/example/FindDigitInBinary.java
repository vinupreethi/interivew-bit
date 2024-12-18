package org.example;

public class FindDigitInBinary {
    public static void main(String args[])
    {
        int n=6;
        String answer="";
        while(n!=0)
        {
       
            answer+=n%2;
            n = n/2;
        }
        System.out.println("new StringBuilder(answer).reverse() = " + new StringBuilder(answer).reverse());
    }
}
