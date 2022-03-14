package com.test.scaler.tree;

import java.util.ArrayList;
import java.util.List;

public class SearchBSTNodeK {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> ans = new ArrayList<>();
//        printTree(root);
        findBST(root, 5, ans);
        System.out.println("arrayList -->" + ans);
    }


    private static boolean findBST(TreeNode root, int K, List<Integer> ans) {
        while (root != null) {
            if (root.val == K) {
                ans.add(root.val);
                return true;
            } else if (root.val < K) {
                root = root.right;
                ans.add(root.val);
            } else {
                root = root.left;
                ans.add(root.val);
            }
        }
        return false;
    }

    static void printTree(TreeNode node) {
        if (node == null) return;
        printTree(node.left);
        System.out.println(node.val);
        printTree(node.right);
    }
}
