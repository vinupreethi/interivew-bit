package org.example;

import java.util.*;

public class ValidArrangement {
    public static void main(String args[]) {
        int pairs[][] = {{5,1},{4,5},{11,9},{9,4}};
        HashMap<Integer, Integer> indegree = new HashMap<>();
        HashMap<Integer, Integer> outdegree = new HashMap<>();
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < pairs.length; i++) {
            indegree.put(pairs[i][1], indegree.getOrDefault(indegree.get(pairs[i][1]), 0) + 1);
            outdegree.put(pairs[i][0], outdegree.getOrDefault(outdegree.get(pairs[i][0]), 0) + 1);
            hashMap.putIfAbsent(pairs[i][0], new ArrayList<>());
            hashMap.get(pairs[i][0]).add(pairs[i][1]);
        }
        //System.out.println(hashMap);
        int start = pairs[0][0];
        for (int node : hashMap.keySet()) {
            if (outdegree.getOrDefault(node, 0) > indegree.getOrDefault(node, 0)) {
                start = node;
                break;
            }
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        List<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            int answer = stack.pop();
            res.add(answer);
            if (hashMap.get(answer) != null) {
                for (int adj : hashMap.get(answer)) {
                    if (!res.contains(adj))
                        stack.push(adj);

                }
            }


        }

        System.out.println(res);


        int result[][] = new int[pairs.length][2];
        int i = 0;
        for (i = 0; i < res.size() - 1; i++) {

            result[i][0] = res.get(i);
            result[i][1] = res.get(i + 1);
        }
        if (res.size() > pairs.length) {
            for (int j = i; j < i; j++) {

                result[j][0] = res.get(j);
                result[j][1] = res.get(j + 1);
            }
        }
        else
        {
            result[pairs.length-1][0]=res.get(res.size()-1);
            result[pairs.length-1][1]=res.get(0);
        }


        for (int j = 0; j < pairs.length; j++)
            System.out.println(result[j][0] + " " + result[j][1]);


    }
}
