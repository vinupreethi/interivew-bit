package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LongestPathMin {
    static int max = -1;
    static int maxNode = -1;
    static int farthest = 0;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int nodes = scanner.nextInt();
        int edge = nodes - 1;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int j = 0; j <= nodes; j++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edge; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);

        }

        boolean visited[] = new boolean[nodes + 1];
        int distance[] = new int[nodes + 1];
        for (int i = 0; i < visited.length; i++)
            visited[i] = false;
        Longestbfs(visited, 1, adj, distance);
        for (int i = 0; i < visited.length; i++)
            visited[i] = false;
        for (int i = 0; i < distance.length; i++)
            distance[i] = 0;
        Longestbfs(visited, maxNode, adj, distance);
        System.out.println(farthest);
    }

    private static void Longestbfs(boolean[] visited, int node, ArrayList<ArrayList<Integer>> adj, int distance[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        distance[node] = 0;
        visited[node]=true;
        while (!queue.isEmpty()) {
            Integer n1 = queue.poll();
            for (Integer i : adj.get(n1)) {
                if (visited[i] == false) {
                    visited[i] = true;
                    distance[i] = distance[n1] + 1;
                    queue.add(i);
                }
                if (distance[i] > farthest) {
                    farthest = distance[i];
                    maxNode = i;
                }
            }
        }

    }

    private static void Longestdfs(boolean visited[], int node, ArrayList<ArrayList<Integer>> adj, int distance) {

        visited[node] = true;
        if (distance > max) {
            max = distance;
            maxNode = node;
        }

        for (Integer it : adj.get(node)) {
            if (!visited[it]) Longestdfs(visited, it, adj, distance + 1);
        }

    }

}
