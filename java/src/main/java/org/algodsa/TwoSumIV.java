package main.java.org.algodsa;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class TwoSumIV {
    // HashMap to store the nodes' values and their corresponding TreeNodes
    Map<Integer, TreeNode> map;

    /**
     * constructor
     */
    public TwoSumIV(){
     map = new HashMap<>();
     }

    /**
     * <h4><a href="https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/">Two Sum IV - Input is a BST</a></h4>
     * Finds if there exist two elements in the BST that sum to the target value k.<br>
     * The function uses depth-first search (DFS) to traverse the tree and a HashMap
     * to keep track of previously seen values.<br>
     * <br>
     * @param root the root node of the binary search tree
     * @param k the target sum we are looking for
     * @return true if two nodes' values sum up to k, false otherwise
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree, since each node is visited once.<br>
     * Space Complexity: O(n) - due to the extra space required by the HashMap.<br>
     */
    public boolean findTarget(TreeNode root, int k) {
        // Base case: if root is null, we cannot find the target
        if (root == null) return false;

        // Calculate the complement that we are looking for
        int complement = k - root.val;

        // If the complement exists in the map, return true
        if (map.containsKey(complement)) return true;

        // Store the current node's value in the map
        map.put(root.val, root);

        // Recur for both left and right subtrees
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}

