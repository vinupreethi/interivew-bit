//package org.example;
//
//import java.util.*;
//import java.lang.*;
//
//class IsItaTree
//{
//    public static void main(String args[]) throws java.lang.Exception {
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
////class NodeLink {
////    int parent;
////    int source;
////
////    NodeLink(int parent, int source) {
////        this.parent = parent;
////        this.source = source;
////    }
////
////}