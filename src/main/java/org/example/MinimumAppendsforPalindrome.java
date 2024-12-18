package org.example;

import java.awt.image.WritableRaster;

public class MinimumAppendsforPalindrome {
    public static void main(String args[]) {
        String palindrome="aabb";

        int right=palindrome.length()-1;
        int left=0;
        int result=0;
        while(left<right)
        {
            if(isPalindrome(palindrome,left,right))
            {
                result=right-left+1;
                break;
            }
            else
            {
                right=palindrome.length()-1;
                left++;
            }
        }
        System.out.println(result);




    }

    private static boolean isPalindrome(String palindrome, int left, int right) {
       while(left<=right)
       {
           if(palindrome.charAt(left)!=palindrome.charAt(right))
           {
               return false;
           }
           left++;
           right--;
       }
        return true;
    }
}
