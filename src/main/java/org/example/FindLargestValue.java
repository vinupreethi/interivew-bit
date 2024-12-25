package org.example;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2() {
    }

    TreeNode2(int val) {
        this.val = val;
    }

    TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class FindLargestValue {
    public static void main(String args[]) {
        TreeNode2 treeNode2 = new TreeNode2(1);
        treeNode2.left = new TreeNode2(3);
        treeNode2.right = new TreeNode2(2);
        treeNode2.left.left = new TreeNode2(5);
        treeNode2.left.right = new TreeNode2(3);
        treeNode2.right.right = new TreeNode2(9);

        List<Integer> arr = new ArrayList<>();
        Queue<TreeNode2> queue = new LinkedList<>();
        queue.offer(treeNode2);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int maxim = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode2 answer = queue.poll();
                maxim = Math.max(answer.val, maxim);
                if (answer.left != null)
                    queue.offer(answer.left);
                if (answer.right != null)
                    queue.offer(answer.right);

            }
            arr.add(maxim);
        }
        System.out.println(arr);

    }


}
