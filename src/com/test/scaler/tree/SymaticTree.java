package com.test.scaler.tree;

public class SymaticTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println("isTrue -->" + isMirror(root.left, root.right));
    }

    private static boolean isMirror(TreeNode t1, TreeNode t2) {
        // base case
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        // check values
        if (t1.val != t2.val) return false;
        // check left subtree and right subtree
        return isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
    }
}
