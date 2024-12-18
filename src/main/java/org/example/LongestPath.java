package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestPath {

    static int MaxNode;
    static int max;
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        boolean visited[] = new boolean[10000000];

        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n-1;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(adj,u,v);

        }

        max=-1;
        dfs(1,visited,adj,0); // From the first dfs call we can find farthest node
        for(int i=0;i<visited.length;i++)// After visting all the node we have to make unvisited node so that we can call second dfs
        {
            visited[i]=false;
        }
        max=-1;
        dfs(MaxNode,visited,adj,0);

        System.out.println(max);

    }


    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u ,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);

    }

// Implementation of DFS

    public static void dfs (int node ,boolean visited[],ArrayList<ArrayList<Integer>> adj,int d)
    {
        visited[node]=true;
        if(d>max)
        {
            max=d;
            MaxNode=node;
        }
      //  System.out.println("node = " + node);
       // System.out.println("adj.get(node) = " + adj.get(node));
        //System.out.println("d = " + d);
        for(int it : adj.get(node))
        {
      //      System.out.println("it = " + it);
            if(!visited[it])
            {
                dfs(it,visited,adj,d+1);
            }
        }
    }
}