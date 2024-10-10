package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to return all root-to-leaf paths in a binary tree.
 */
public class BinaryTreePaths {
    /**
     * Constructor
     */
    public BinaryTreePaths(){}

    /**
     * <h4></h4><a href="https://leetcode.com/problems/binary-tree-paths/description/">257. Binary Tree Paths</a><h4></h4>
     * <br>
     * Returns a list of all root-to-leaf paths in the binary tree.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of nodes in the binary tree. Each node is visited once to form paths.
     * <br>
     * Space Complexity: O(h), where h is the height of the tree. The space is required for recursion, and in the worst case, h can be n (for a skewed tree).<br>
     * <br>
     * @param root the root node of the binary tree
     * @return a list of strings representing all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();

        getPath(root, list, new StringBuilder());

        return list;
    }

    /**
     * Recursive helper function to traverse the tree and build root-to-leaf paths.
     * <br>
     * @param node the current tree node
     * @param list the list to store the paths
     * @param prev the current path from root to this node
     */
    private void getPath(TreeNode node, List<String> list, StringBuilder prev) {
        // Append current node value to the path
        prev.append(node.val);

        // If leaf node, add the path to the list
        if (node.left == null && node.right == null) {
            list.add(prev.toString());
        } else {
            // Recursively explore the left and right subtrees, appending the current path
            if (node.left != null) getPath(node.left, list, new StringBuilder(prev).append("->"));
            if (node.right != null) getPath(node.right, list, new StringBuilder(prev).append("->"));
        }
    }
}

