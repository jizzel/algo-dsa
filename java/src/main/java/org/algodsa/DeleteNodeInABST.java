package main.java.org.algodsa;

/**
 * This class provides a method to delete a node with a given key from a Binary Search Tree (BST).
 */
public class DeleteNodeInABST {

    /**
     * Constructor
     */
    public DeleteNodeInABST(){}

    /**
     * <h4><a href="https://leetcode.com/problems/delete-node-in-a-bst/">450. Delete Node in a BST</a></h4>
     * <br>
     * Deletes a node with the specified key from the BST and returns the root of the updated tree.<br>
     * The deletion follows the standard BST deletion rules:<br>
     * 1. If the key is less than the root's value, it proceeds to the left subtree.<br>
     * 2. If the key is greater than the root's value, it proceeds to the right subtree.<br>
     * 3. If the key is found, the node is deleted based on the following conditions:<br>
     *    - If the node has no children, simply remove it.<br>
     *    - If the node has one child, replace the node with the child.<br>
     *    - If the node has two children, find the in-order successor (smallest node in the right subtree),<br>
     *      replace the node's value with the successor's value, and delete the successor node.<br>
     * <br>
     * Time Complexity: O(h), where h is the height of the BST. In the worst case, the height of the tree could be n for a skewed tree, resulting in O(n) time.
     * In a balanced tree, the time complexity would be O(log n).
     * <br>
     * Space Complexity: O(h) due to the recursion stack space, where h is the height of the tree.
     * <br>
     * @param root the root of the BST
     * @param key the value of the node to be deleted
     * @return the root of the updated BST after deletion
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        // Traverse to the left or right subtree depending on the key
        if (key < root.val) root.left = deleteNode(root.left, key);

        else if (key > root.val) root.right = deleteNode(root.right, key);

        else {
            // Node with only one child or no child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children: Get the in-order successor (smallest in the right subtree)
            TreeNode successor = getSuccessor(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val); // Delete the successor node
        }

        return root;
    }

    /**
     * Finds the in-order successor of the given node in the BST, which is the smallest node
     * in the right subtree (leftmost node).
     *
     * @param node the root of the right subtree
     * @return the in-order successor (smallest node in the subtree)
     */
    private TreeNode getSuccessor(TreeNode node) {
        if (node.left != null) return getSuccessor(node.left);
        else return node;
    }
}
