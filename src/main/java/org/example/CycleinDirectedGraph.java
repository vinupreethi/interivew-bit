package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleinDirectedGraph {
    public static void main(String args[]) {
        int vertices = 2;
        int edges[][] = {{1, 2}};
        boolean visited[] = new boolean[vertices + 1];
        Arrays.fill(visited, false);
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= vertices; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        //boolean answer = false;
        for (int j = 1; j <= vertices; j++) {
            if (!visited[j]) {
                if (checkDfsinCycle(-1, j, visited, adj))
                    System.out.println("true");
            }
        }
        // System.out.println("false");


    }

    private static boolean checkDfsinCycle(int parent, int child, boolean visited[], List<List<Integer>> adj) {

        visited[child] = true; //1
        for (Integer adjacent : adj.get(child)) { // 2
            if (!visited[adjacent]) {
                if (checkDfsinCycle(child, adjacent, visited, adj))
                    return true;

            }
            else if (visited[adjacent] == true && adjacent != parent)
                return true;

        }
        return false;
    }


}
