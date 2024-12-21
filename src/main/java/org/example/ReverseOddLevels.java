package org.example;

import com.sun.source.tree.Tree;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1() {
    }

    TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ReverseOddLevels {

    public static void main(String args[]) {
        TreeNode1 root = new TreeNode1(2);
        root.left = new TreeNode1(3);
        root.right = new TreeNode1(5);
        root.left.left = new TreeNode1(8);
        root.left.right = new TreeNode1(13);
        root.right.left = new TreeNode1(21);
        root.right.right = new TreeNode1(34);
       reverseOddLevels(root);
    }


    public static void reverseOddLevels(TreeNode1 root) {
        reverseNode(root.left,root.right, 0);
    }

    private static void reverseNode(TreeNode1 left, TreeNode1 right, int height) {
        if (left == null || right==null)
            return;
        if (height % 2 == 0) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
         reverseNode(left.left, right.right,height + 1);
         reverseNode(left.right, right.left,height + 1);

    }

}
