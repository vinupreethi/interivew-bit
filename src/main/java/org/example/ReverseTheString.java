package org.example;

public class ReverseTheString {
    public static void main(String args[])
    {
        String a=" hello world ";
        String str[]=a.split(" ");
        String answer="";
        for(int i=str.length-1;i>=0;i--) {
            answer += str[i];
            answer+=" ";
        }

        System.out.println(answer+"...");
    }
}
