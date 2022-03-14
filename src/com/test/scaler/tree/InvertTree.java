package com.test.scaler.tree;

public class InvertTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        invert(root);
    }

    private static void invert(TreeNode root) {
        if (root == null) return;
        invert(root.left);
        invert(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
