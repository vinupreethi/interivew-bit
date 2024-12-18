package org.example;

public class ConvertToPalindrome {
    public static void main(String args[])
    {
        String a="abecbea";

        int j=a.length()-1;
        int i=0;
        int flag=0;
        while(i<=j)
        {
            if(a.charAt(i)==a.charAt(j))
            {
                i++;
                j--;
            }
            else if(a.charAt(i)!=a.charAt(j)) {
                flag=1;
                if(a.charAt(i)==a.charAt(j-1) && i<=j)
                {
                    j--;
                }
                else if(i<=j)
                {
                    i++;
                }
            }
            else
            {
                System.out.println(0);
                return;
            }
        }

    }
}
