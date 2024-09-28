package main.java.org.algodsa;

/**
 * Merge Two Binary Trees
 */
public class MergeTwoBinaryTrees {
    /**
     * Constructor
     */
    public MergeTwoBinaryTrees(){}

    /**
     * <h4><a href="https://leetcode.com/problems/merge-two-binary-trees/description/">Merge Two Binary Trees</a></h4>
     * Merges two binary trees by adding the values of nodes that overlap.<br>
     * <br>
     * If two nodes overlap, their values are added together, and the result is assigned to the merged tree's node.<br>
     * If one of the trees has a `null` node at a specific position, the non-null node from the other tree is used.<br>
     * <br>
     * @param root1 the root of the first binary tree
     * @param root2 the root of the second binary tree
     * @return the root of the new merged binary tree
     * <br>
     * Time Complexity: O(n) - where n is the minimum number of nodes in the two trees.<br>
     * Space Complexity: O(n) - due to the recursive call stack.<br>
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // If the first tree node is null, return the second tree node
        if (root1 == null) {
            return root2;
        }

        // If the second tree node is null, return the first tree node
        if (root2 == null) {
            return root1;
        }

        // Add the values of root1 and root2 and store it in root1
        root1.val += root2.val;

        // Recursively merge the left and right children of both trees
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }
}
