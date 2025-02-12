package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathInDirectedGraph {
    public static void main(String args[]) {
        int edges[][] = {{1, 2}};
        int endNode = 2;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <endNode+1; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        boolean visited[] = new boolean[endNode + 1];
        Arrays.fill(visited, false);

        PathDfs(1, visited, adj);
        if (visited[endNode] == true)
            System.out.println("Yes");

    }

    private static void PathDfs(int i, boolean[] visited, List<List<Integer>> adj) {
        visited[i] = true;
        for (Integer a : adj.get(i)) {
            if (visited[a] != true)
                PathDfs(a, visited, adj);
        }
    }
}
