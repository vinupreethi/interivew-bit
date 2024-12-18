package org.example;

public class AIBOP {
    public static void main(String args[])
    {
        String str="leetcode";
        int dp[][]=new int[str.length()][str.length()];
        for(int i=0;i<str.length();i++)
            dp[i][i] = 0;

        //Find all length till the length of string
        for(int i=2;i<=str.length();i++) {

            //Now traverse all i length substring in string
            for(int j=0;j<str.length()-i+1;j++) {

                //Find end of current string
                int e = j + i - 1;

                //if char are equal and length is 2 we need 0 operations
                if(str.charAt(e) == str.charAt(j) && i == 2)
                    dp[j][e] = 0;
                    //else if length is greater than 2 operations are equal to inside subproblem
                else if(str.charAt(e) == str.charAt(j))
                    dp[j][e] = dp[j+1][e-1];
                else
                    //else if char are not equal either we can insert at last or start
                    //so it will minimum of these two operations
                    dp[j][e] = 1 + Math.min(dp[j+1][e],dp[j][e-1]);
            }
        }

        //return result
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                System.out.print(dp[i][j]);
            }
            System.out.println(" ");
        }
    }

}
