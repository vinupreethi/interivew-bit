package org.example;

import java.util.*;

class Pairing {
    int first;
    int second;
}

public class BugLifeSpoj {
    public static void main(String args[]) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int counter = 1;
        while (t != 0) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            int vertices = scanner.nextInt();
            int edges = scanner.nextInt();
            for (int j = 0; j <= vertices; j++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < edges; i++) {
                int edge1 = scanner.nextInt();
                int edge2 = scanner.nextInt();
                adj.get(edge1).add(edge2);
                adj.get(edge2).add(edge1);
            }

            int color[] = new int[vertices + 1];
            int visited[] = new int[vertices + 1];
            Arrays.fill(color, -1);
            Arrays.fill(visited, 0);
            Queue<Pairing> queue = new LinkedList<>();
            int flag = 0;
            for (int ij = 0; ij <= vertices; ij++) {
                if (visited[ij] != 1) {
                    Pairing e = new Pairing();
                    e.first = ij;
                    e.second = 1;
                    color[ij] = e.second;
                    queue.add(e);
                    while (!queue.isEmpty()) {
                        Pairing node = queue.poll();
                        int colour = node.second;
                        visited[node.first] = 1;
                        for (Integer ik : adj.get(node.first)) {
                            if (visited[ik] != 1) {
                                Pairing e1 = new Pairing();
                                e1.first = ik;
                                e1.second = 1 - colour;
                                color[ik] = e1.second;
                                queue.add(e1);
                            } else if (visited[ik] == 1 && color[ik] == colour) {
                                System.out.println("Scenario #" + counter + ":");
                                System.out.println("Suspicious bugs found!");
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 1)
                            break;
                    }
                    if (flag == 1)
                        break;
                }

            }
            if (flag != 1) {
                System.out.println("Scenario #" + counter + ":");
                System.out.println("No suspicious bugs found!");
            }
            t--;
            counter++;

        }
    }
}
