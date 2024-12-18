package org.example;

import java.util.Arrays;

public class SpecialArrayOptimized {
    public static void main(String args[]) {
        int nums[] = {3, 4, 1, 2, 6};
        int queries[][] = {{0, 4}};
        boolean ans[]=new boolean[queries.length];
        int prefix[] = new int[nums.length];
        Arrays.fill(prefix, 1);
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i - 1] % 2 == 1)
                prefix[i] += prefix[i - 1];
            else if (nums[i] % 2 == 1 && nums[i - 1] % 2 == 0)
                prefix[i] += prefix[i - 1];
            else
                prefix[i] = 1;

        }
        for(int i=0; i<queries.length; i++)
        {
           if(queries[i][1]-queries[i][0] == prefix[queries[i][1]]-prefix[queries[i][0]] )
           {
               ans[i]=true;
           }
           else
               ans[i]=false;
        }

    }
}
