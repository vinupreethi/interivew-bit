package org.example;

public class PalindromeString {
    public static void main(String args[])
    {
        String answer="A man, a plan, a canal: Panama";
        String result="";
        for(int i=0;i<answer.length();i++) {
            if (Character.isAlphabetic(answer.charAt(i)))
                result+=answer.charAt(i);
        }
        result=result.toLowerCase();
        System.out.println(result);
        int j=0;
        while(j<result.length())
        {
            if(result.charAt(j)==result.charAt(result.length()-j-1))
                j++;
            else {
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");
    }
}
