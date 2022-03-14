package com.test.scaler.tree;

public class BSTRangeLieon {
    public static void main(String[] args) {

    }

    public  int countNodes(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int count = 0;
        if (root.val >= low && root.val <= high) count += 1;
        count += countNodes(root.left, low, high);
        return count + countNodes(root.right, low, high);
    }
}
