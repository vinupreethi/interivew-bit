package org.example;

import java.util.*;

public class NumberOfDistinctColors {
    public static void main(String args[]) {
        int limit = 4;
        int ans[] = new int[limit];
        int queries[][] = {{0,1},{1,2},{2,2},{3,4},{4,5}};
        //1,2,1,2,1
        //[[0,1],[1,2],[2,2],[3,4],[4,5]]
        HashMap<Integer, Integer> ballMap = new HashMap<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int colour = queries[i][1];
            if (ballMap.get(ball) != null) {
                int previousBallColor = ballMap.get(ball);
                ballMap.put(ball, colour);
                if (frequencyMap.get(previousBallColor) - 1 == 0) {
                    frequencyMap.remove(previousBallColor);
                } else {
                    frequencyMap.put(previousBallColor, frequencyMap.get(previousBallColor) - 1);
                }
                frequencyMap.put(colour, frequencyMap.getOrDefault(colour, 0) + 1);
            } else {
                frequencyMap.put(colour, frequencyMap.getOrDefault(colour, 0) + 1);
                ballMap.put(ball, colour);
            }
            System.out.println(frequencyMap.size());

        }


    }


}
