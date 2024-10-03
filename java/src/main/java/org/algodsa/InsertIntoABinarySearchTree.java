package main.java.org.algodsa;

/**
 * This class provides a method to insert a value into a Binary Search Tree (BST).
 */
public class InsertIntoABinarySearchTree {

    /**
     * Constructor
     */
    public InsertIntoABinarySearchTree(){}

    /**
     * <h4><a href="https://leetcode.com/problems/insert-into-a-binary-search-tree/description/">701. Insert into a Binary Search Tree</a></h4>
     * <br>
     * Inserts a new value into the BST. If the tree is empty, it creates a new TreeNode with the value.<br>
     * The insertion follows the standard BST insertion rules:<br>
     * 1. If the value is less than the root's value, it is inserted into the left subtree.<br>
     * 2. If the value is greater than the root's value, it is inserted into the right subtree.<br>
     * The method returns the root of the updated BST.<br>
     * <br>
     * Time Complexity: O(h), where h is the height of the BST. In the worst case (for a skewed tree), the time complexity is O(n), where n is the number of nodes.<br>
     * For a balanced tree, the time complexity is O(log n).<br>
     * <br>
     * Space Complexity: O(h) due to the recursion stack space, where h is the height of the tree.<br>
     * <br>
     * @param root the root of the BST
     * @param val the value to be inserted into the BST
     * @return the root of the updated BST after insertion
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // Base case: if root is null, create a new node with the value
        if (root == null) root = new TreeNode(val);

            // If the value is smaller than the root's value, go to the left subtree
        else if (val < root.val) root.left = insertIntoBST(root.left, val);

            // If the value is greater than the root's value, go to the right subtree
        else if (val > root.val) root.right = insertIntoBST(root.right, val);

        // Return the root of the updated tree
        return root;
    }
}

