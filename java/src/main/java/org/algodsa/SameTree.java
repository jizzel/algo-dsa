package main.java.org.algodsa;

/**
 * Same Tree
 */
public class SameTree {
    /**
     * Constructor
     */
    public SameTree(){}

    /**
     * <a href="https://leetcode.com/problems/same-tree/description/">Same Tree</a>
     * Determines whether two binary trees are structurally identical and have the same node values.<br>
     * <br>
     * This method checks if two binary trees `p` and `q` are the same.<br>
     * Two binary trees are considered the same if they are structurally identical,
     * and the nodes have the same values in the same positions.<br>
     * <br>
     * @param p the root node of the first binary tree
     * @param q the root node of the second binary tree
     * @return true if the two trees are the same, otherwise false
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the smaller tree.<br>
     *                  Each node is visited once to compare its value.<br>
     * Space Complexity: O(h) - where h is the height of the tree. This is the space used by the recursive call stack.<br>
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, the trees are identical at this point
        if (p == null && q == null) return true;

        // If one node is null and the other is not, the trees are not identical
        if (p == null || q == null) return false;

        // Compare the current nodes' values and recursively check left and right subtrees
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
