package org.example.binaryTreePaths;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new LinkedList<>();
        List<String> paths = new LinkedList<>();
        StringBuilder temp_path = new StringBuilder();
        if (root.left == null && root.right == null) {
            paths.add(String.valueOf(root.val));
            return paths;
        }
        if (root.left != null) {
            for (String path : binaryTreePaths(root.left)
            ) {
                paths.add(root.val + "->" + path);

            }
        }
        if (root.right != null) {
            for (String path : binaryTreePaths(root.right)
            ) {
                paths.add(root.val + "->" + path);
            }
        }
        return paths;
    }
}