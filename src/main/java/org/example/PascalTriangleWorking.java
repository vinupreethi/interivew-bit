package org.example;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleWorking {
    public static void main(String args[])
    {
        int numRows=5;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> previousRows=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> rows=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==i || j == 0)
                {
                    rows.add(1);
                }
                else
                {
                    int sum=previousRows.get(j)+previousRows.get(j-1);
                    rows.add(sum);
                }

            }
            previousRows=rows;
            result.add(rows);


        }
        System.out.println("result = " + result);
    }
}
