//package org.example;
//
//import java.util.*;
////** Two Missed Conditions:
//
///*
//Edge Count Check: Your implementation does not check whether the number of edges is equal to nodes - 1. This is a fundamental property of trees, and if this condition is not met, the graph cannot be a tree.
//
//Handling of Visited Nodes: Although you're using a BFS approach, your method for checking cycles (i.e., if a visited node is encountered that isn't the parent) is fine, but you don't check if all nodes are visited after the traversal.
// */
//class NodeLink {
//    int parent;
//    int source;
//
//    NodeLink(int parent, int source) {
//        this.parent = parent;
//        this.source = source;
//    }
//
//}
//
//public class IsItATree {
//    public static void main(String args[]) throws Exception {
//
//        Scanner scanner = new Scanner(System.in);
//        int nodes = scanner.nextInt();
//        int edges = scanner.nextInt();
//        if (edges != nodes - 1) {
//            System.out.println("NO");
//            return;
//        }
//
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        for (int i = 0; i <= nodes ; i++) {
//            adj.add(new ArrayList<>());
//        }
//        int first = 0;
//        for (int i = 0; i < edges; i++) {
//            int u = scanner.nextInt();
//            int v = scanner.nextInt();
//            if (i == 0)
//                first = u;
//            adj.get(u).add(v);
//            adj.get(v).add(u);
//        }
//
//        Queue<NodeLink> queue = new LinkedList<>();
//        NodeLink nodeLink = new NodeLink(-1,first);
//        boolean visited[] = new boolean[nodes+1];
//        queue.add(nodeLink);
//        Arrays.fill(visited,false);
//        visited[first] = true;
//        int cnt=0;
//        while (!queue.isEmpty()) {
//            NodeLink queue1 = queue.poll();
//            int node = queue1.source;
//            int parent = queue1.parent;
//            visited[node] = true;
//            cnt++;
//            for (Integer it : adj.get(node)) {
//                if (visited[it] == false) {
//
//
//                    queue.add(new NodeLink(node,it));
//                } else if (it != parent && visited[it] == true) {
//                    System.out.println("NO");
//                    return;
//                }
//
//            }
//
//
//        }
//
//        if (cnt == nodes) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//    }
//}
