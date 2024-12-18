package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShortestDistance {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int queries[][]= {{2,4},{0,2},{0,4}};
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        System.out.println(adj);
        int result[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            adj.get(queries[i][0]).add(queries[i][1]);
           // System.out.println(adj);
            int answer=findMinDistance(adj, n);
            result[i]=answer;
        }
        for(Integer i:result)
            System.out.println(i);



    }
    public static int findMinDistance(ArrayList<ArrayList<Integer>> adjList, int n) {
        int[] dp = new int[n];
        for(int i=0;i<n;i++)
            dp[i]=i;

        for(int j=0;j<n;j++)
        {
            for(Integer i: adjList.get(j))
            {
                dp[i]=Math.min(dp[j]+1,dp[i]);
            }
        }
//        for(Integer fd: dp)
//            System.out.print(fd+" ");
//        System.out.println();
        return dp[n-1];
    }
}
