package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * temp: random leetcode solutions
 */
public class Miscellaneous {

    /**
     * constructor
     */
    Miscellaneous() {}
    /**
     * <h4><a href="https://leetcode.com/problems/running-sum-of-1d-array/">Running Sum of 1d Array</a></h4>
     * Computes the running sum of an array of integers. <br>
     * <br>
     * The running sum of a given array is an array where each element at index `i` is the sum of all elements
     * from the start of the array up to index `i`. The original array is modified in-place to store the running sum.<br>
     * <br>
     * This method iteratively updates each element in the input array by adding the value of the previous element,
     * effectively transforming the array into its running sum form.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of elements in the array. The method processes each element exactly once.<br>
     * Space Complexity: O(1) - the transformation is done in place with no additional memory usage beyond the input array.<br>
     * <br>
     * Algorithm:<br>
     * 1. Iterate over the array starting from the second element (index 1).<br>
     * 2. For each element at index `i`, add the value of the previous element (`nums[i-1]`) to the current element (`nums[i]`).<br>
     * 3. After the loop completes, the array `nums` will be transformed into its running sum.<br>
     * 4. Return the modified array.<br>
     * <br>
     * Example:<br>
     * - Input: nums = [1, 2, 3, 4]<br>
     * - Output: [1, 3, 6, 10]<br>
     *
     * @param nums the array of integers for which the running sum is to be computed
     * @return the same array modified to contain the running sum
     */
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/"> Maximum Depth of Binary Tree</a></h4>
     * Computes the maximum depth (or height) of a binary tree.<br>
     * <br>
     * The maximum depth is the number of nodes along the longest path
     * from the root node down to the farthest leaf node.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree,
     * as each node is visited once.<br>
     * Space Complexity: O(h) - where h is the height of the tree,
     * due to the recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return the maximum depth of the tree
     */
    public int maxDepth(TreeNode root) {
        // Base case: if the node is null, the depth is 0
        if (root == null) return 0;

        // Recursively find the maximum depth of the left subtree
        int lmax = maxDepth(root.left);

        // Recursively find the maximum depth of the right subtree
        int rmax = maxDepth(root.right);

        // Return the greater depth between the left and right subtree plus 1 (for the current node)
        return Math.max(lmax, rmax) + 1;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/balanced-binary-tree/">Balanced Binary Tree</a></h4>
     * Determines if a binary tree is height-balanced.<br>
     * <br>
     * A binary tree is considered balanced if the heights of the two subtrees of
     * every node never differ by more than one. This method utilizes a helper function
     * to recursively calculate the height of each subtree and check the balance condition.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree, as each node is visited once.<br>
     * Space Complexity: O(h) - where h is the height of the tree, due to the recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return true if the tree is balanced, false otherwise
     */
    public static boolean isBalanced(TreeNode root) {
        // If checkHeight returns -1, the tree is unbalanced
        return checkHeight(root) != -1;
    }

    /**
     * Helper method that calculates the height of a subtree and checks if it is balanced.<br>
     * <br>
     * The method returns -1 if the subtree is unbalanced; otherwise, it returns the height
     * of the subtree. If any subtree has a height difference greater than 1 between
     * its left and right children, the method will propagate -1 up to signal that the
     * entire tree is unbalanced.<br>
     * <br>
     * @param node the current node in the binary tree
     * @return the height of the subtree if balanced, or -1 if unbalanced
     */
    public static int checkHeight(TreeNode node) {
        // Base case: if the node is null, its height is 0
        if (node == null) return 0;

        // Recursively check the height of the left subtree
        int left = checkHeight(node.left);
        if (left == -1) return -1;  // If the left subtree is unbalanced, propagate -1

        // Recursively check the height of the right subtree
        int right = checkHeight(node.right);
        if (right == -1) return -1;  // If the right subtree is unbalanced, propagate -1

        // If the height difference between left and right subtrees is more than 1, return -1
        if (Math.abs(left - right) > 1) return -1;

        // Return the height of the current subtree
        return Math.max(left, right) + 1;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/symmetric-tree/description/">Symmetric Tree</a></h4>
     * Checks if the given binary tree is symmetric (i.e., a mirror of itself).<br>
     * <br>
     * A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree, as each node is visited once.<br>
     * Space Complexity: O(h) - where h is the height of the tree, due to the recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return true if the tree is symmetric, false otherwise
     */
    public boolean isSymmetric(TreeNode root) {
        // If the tree is empty, it's symmetric by definition
        if (root == null) return true;

        // Check if the left and right subtrees are mirrors of each other
        return isMirror(root.left, root.right);
    }

    /**
     * Helper method to check if two trees are mirror images of each other.<br>
     * <br>
     * Two trees are mirrors if:<br>
     * 1. Their root values are the same.<br>
     * 2. The right subtree of one tree is a mirror of the left subtree of the other tree and vice versa.<br>
     * <br>
     * @param t1 the root of the first subtree
     * @param t2 the root of the second subtree
     * @return true if the subtrees are mirrors, false otherwise
     */
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // If both subtrees are null, they are mirrors
        if (t1 == null && t2 == null) return true;

        // If only one of the subtrees is null, they are not mirrors
        if (t1 == null || t2 == null) return false;

        // Check if the current nodes have the same value and
        // the left subtree of t1 is a mirror of the right subtree of t2,
        // and the right subtree of t1 is a mirror of the left subtree of t2
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

//    /**
//     *
//     * @param root TreeNode
//     * @return boolean
//     */
//    public boolean isSymmetric(TreeNode root) {
//        if ((root.left == null) != (root.right == null)) return false;
//
//        List<Integer> listLeft = new ArrayList<>();
//        List<Integer> listRight = new ArrayList<>();
//
//        preorder(root.left, listLeft);
//        preorderReverse(root.right, listRight);
//        System.out.println(listLeft);
//        System.out.println(listRight);
//
//        return listLeft.equals(listRight);
//    }
//
//    public void preorder(TreeNode node, List<Integer> list){
//        if (node == null) {
//            list.add(null);
//            return;
//        }
//
//        list.add(node.val);
//        preorder(node.left, list);
//        preorder(node.right, list);
//    }
//
//    public void preorderReverse(TreeNode node, List<Integer> list){
//        if (node == null) {
//            list.add(null);
//            return;
//        }
//
//        list.add(node.val);
//        preorderReverse(node.right, list);
//        preorderReverse(node.left, list);
//
//    }

}
