package org.example;

public class SortedPermutationRank {
    public static void main(String args[])
    {
        String ans="acb";
        int n=ans.length();
        int k=n;
        int answer=0;
        for(int i=0;i<n ;i++)
        {
            int cnt=0;
            for(int j=i+1;j<n;j++)
            {
                if(ans.charAt(i)>ans.charAt(j))
                    cnt++;
            }
           answer+= cnt*find_Fact(k-1);
            k--;
        }
        System.out.println("answer = " + answer);
      
    }

    private static int find_Fact(int n) {
        int result=1;
        if(n==0 || n==1)
            return 1;
        for(int i=2;i<=n;i++)
            result=result*i;
        return result;
    }
}
