package org.example;

import org.example.binaryTreePaths.*;



public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(
                s.binaryTreePaths(
                        root
                )
        );
    }
}