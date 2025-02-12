package org.example;

import java.util.Arrays;

public class RedundantConnection {
    public static void main(String args[]) {
        int edges[][] = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        int parent[] = new int[edges.length];
        Arrays.fill(parent, -1);
        int edge[]=Redundant(edges, parent);
        System.out.println(edge[0]);
        System.out.println(edge[1]);

    }

    private static int[] Redundant(int[][] edges, int[] parent) {

        for (int edge[] : edges) {
            int parentX = findParent(edge[0], parent);
            int parentY = findParent(edge[1], parent);
            if (parentX == parentY)
                return edge;
            else
                parent[parentX]=parentY;

        }
        return new int[]{-1,-1};


    }

    private static int findParent(int edge, int parent[]) {
        if (parent[edge] == -1)
            return edge;
        return parent[edge] = findParent(parent[edge], parent);
       // return parent[edge];
    }
}
