package org.example;

import java.util.*;

class TNode {
    int val;
    TNode left;
    TNode right;

    TNode() {
    }

    TNode(int val) {
        this.val = val;
    }

    TNode(int val, TNode left, TNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MinimumNoOperations {
    public static void main(String args[]) {
        TNode tnode = new TNode(1);
        tnode.left = new TNode(4);
        tnode.right = new TNode(3);
        tnode.left.left = new TNode(7);
        tnode.left.right = new TNode(6);
        tnode.right.left = new TNode(8);
        tnode.right.right = new TNode(5);
        tnode.right.left.left = new TNode(9);
        tnode.right.right.left = new TNode(10);

        Queue<TNode> queue = new ArrayDeque<>();
        queue.add(tnode);
        int totalSwaps = 0;
        while (!queue.isEmpty()) {

            int size = queue.size();
            int level[] = new int[size];
            for (int i = 0; i < size; i++) {
                TNode answer1 = queue.poll();
                level[i] = answer1.val;
                if (answer1.left != null)
                    queue.add(answer1.left);
                if (answer1.right != null)
                    queue.add(answer1.right);
            }
            totalSwaps += getMinimumSwaps(level);
        }
        System.out.println(totalSwaps);

    }

    private static int getMinimumSwaps(int[] level) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int swaps = 0;
        int[] target = level.clone();
        Arrays.sort(target);
        for(int i=0;i<level.length;i++)
        {
            hashMap.put(level[i],i);
        }
        for(int j=0;j<level.length;j++)
        {
            if(level[j]!=target[j])
            {
                int index=hashMap.get(target[j]);
                hashMap.put(level[j],index);
                int temp=level[index];
                level[index]=level[j];
                level[j]=temp;
                swaps++;
            }

        }
        return swaps;




    }
}
