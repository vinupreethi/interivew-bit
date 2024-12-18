package org.example;

import java.util.*;

class Node{
    int parent;
    int source;
    Node(int parent,int source)
    {
        this.parent=parent;
        this.source=source;
    }
}
public class TopoSortUndirectedGraph {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int nodes = scanner.nextInt();
        int edges = scanner.nextInt();


        int visited[] = new int[nodes];
        for (int i = 0; i < nodes; i++)
            visited[i] = 0;

        Queue<Node> queue=new LinkedList<>();
        queue.add(new Node(-1,1));

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int j=0;j<edges;j++)
        {
            int node1=scanner.nextInt();
            int node2=scanner.nextInt();
            if(adj.indexOf(node1)!=-1)
            {
                int index=adj.indexOf(node1);
                ArrayList<Integer> arr=adj.get(index);
                arr.add(node2);
                
            }
            else {
                ArrayList<Integer> arr=new ArrayList<>();
                arr.add(node2);
                adj.add(node1,arr);
            }

        }
        System.out.println("adj = " + adj);

    }
}
