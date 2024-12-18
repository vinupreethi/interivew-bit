package org.example;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String args[])
    {

        int n=4;

        List<Integer> previousrow = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> rows=new ArrayList<>();
            for(int j=0;j<=i;j++) {

                if (j == 0 || j == i)
                    rows.add(1);
                else {
                    int i1 = previousrow.get(j) + previousrow.get(j - 1);
                    rows.add(i1);
                }


            }
            previousrow = rows;
            System.out.println(rows);
        }
    }
}
