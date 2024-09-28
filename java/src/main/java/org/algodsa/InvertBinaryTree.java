package main.java.org.algodsa;

/**
 * Invert Binary Tree
 */
public class InvertBinaryTree {

    /**
     * Constructor
     */
    public InvertBinaryTree(){}

    /**
     * <h4><a href="https://leetcode.com/problems/invert-binary-tree/description/">Invert Binary Tree</a></h4>
     * Inverts a binary tree by swapping the left and right child of every node recursively.<br>
     * <br>
     * Inversion means that for each node, its left and right children are swapped.<br>
     * <br>
     * @param root the root of the binary tree
     * @return the root of the inverted binary tree
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree, as we need to visit each node once.<br>
     * Space Complexity: O(h) - where h is the height of the tree due to the recursive call stack. In the worst case,
     * this can be O(n) for a skewed tree.<br>
     */
    public TreeNode invertTree(TreeNode root) {
        // Base case: If the node is null, there's nothing to invert
        if (root == null) return null;

        // Temporarily store the left child
        TreeNode temp = root.left;

        // Recursively invert the right subtree and assign it to the left child
        root.left = invertTree(root.right);

        // Recursively invert the left subtree and assign it to the right child
        root.right = invertTree(temp);

        // Return the current root after inversion
        return root;
    }
}
