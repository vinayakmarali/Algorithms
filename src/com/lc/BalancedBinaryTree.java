package com.lc;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    public int dfsHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = dfsHeight(root.left);
        if(left == -1) {
            return -1;
        }
        int right = dfsHeight(root.right);
        if(right == -1) {
            return -1;
        }

        if(Math.abs(left - right) > 1) {
            return  -1;
        }

        return 1 + Math.max(left, right);
    }
}