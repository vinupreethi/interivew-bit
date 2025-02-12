package org.example;

import java.util.*;

public class MotherVertex {

    public static void main(String args[]) {
        int vertices = 3;
        int edges[][] = {{1, 3}, {2, 3}, {3, 2}};
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= vertices; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        boolean visited[] = new boolean[vertices + 1];
        Arrays.fill(visited, false);
        int mother = 1;
        for (int i = 1; i <= vertices; i++) {
            if (!visited[i]) {
                mother = i;
                dfsMother(mother, visited, adj);
            }
        }

        Arrays.fill(visited, false);
        dfsMother(mother, visited, adj);
        for(int i=1;i<=vertices;i++)
        {
            if(visited[i]!=false)
                System.out.println("no mother");
        }
        System.out.println("mother");

    }

    private static void dfsMother(int mother, boolean[] visited, List<List<Integer>> adj) {
        visited[mother] = true;
        for (Integer a : adj.get(mother)) {
            if (!visited[a])
                dfsMother(a, visited, adj);
        }
    }


}
