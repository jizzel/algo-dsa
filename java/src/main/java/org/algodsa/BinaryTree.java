package main.java.org.algodsa;

/**
 * Represents a binary tree data structure.
 * This class provides methods for tree traversal using Pre-Order, In-Order, and Post-Order techniques.
 */
public class BinaryTree {
    /**
     * The root node of the binary tree.
     */
    public TreeNode root;

    /**
     * Initializes an empty binary tree with the root set to null.
     */
    public BinaryTree(){
        root = null;
    }

    /**
     * Prints the nodes of the binary tree in Pre-Order traversal.
     * Pre-Order traversal visits the root node first, then the left subtree, followed by the right subtree.
     *
     * @param node The starting node for the traversal. Typically, this should be the root node.
     */
    public void printPreOrder(TreeNode node){
        if (node == null) return;

        // Visit root
        System.out.println(node.val);

        // Traverse left subtree
        printPreOrder(node.left);

        // Traverse right subtree
        printPreOrder(node.right);
    }

    /**
     * Prints the nodes of the binary tree in In-Order traversal.
     * In-Order traversal visits the left subtree first, then the root node, followed by the right subtree.
     *
     * @param node The starting node for the traversal. Typically, this should be the root node.
     */
    public void printInOrder(TreeNode node){
        if (node == null) return;

        // Traverse left subtree
        printInOrder(node.left);

        // Visit root
        System.out.println(node.val);

        // Traverse right subtree
        printInOrder(node.right);
    }

    /**
     * Prints the nodes of the binary tree in Post-Order traversal.
     * Post-Order traversal visits the left subtree first, then the right subtree, followed by the root node.
     *
     * @param node The starting node for the traversal. Typically, this should be the root node.
     */
    public void printPostOrder(TreeNode node) {
        if (node == null) return;

        // Traverse left subtree
        printPostOrder(node.left);

        // Traverse right subtree
        printPostOrder(node.right);

        // Visit root
        System.out.println(node.val);
    }

    /**
     * Prints all nodes in the binary tree level by level.
     * The traversal is performed in level order (Breadth-First Search).
     *
     * @param root The root node of the binary tree.
     */
    public void printLevelOrder(TreeNode root) {
        int height = getTreeHeight(root);

        for (int level = 0; level < height; level++) {
            printLevel(root, level);
        }
    }

    /**
     * Recursively prints all nodes at a specific level in the binary tree.
     * The level is determined by the `stepsRemaining` parameter, which decreases with each recursive call.
     *
     * @param root The root node of the binary tree or the subtree.
     * @param stepsRemaining The number of levels left to traverse until the target level is reached.
     */
    private void printLevel(TreeNode root, int stepsRemaining) {
        if (root == null) return;

        if (stepsRemaining == 0) {
            System.out.println(root.val);
        } else {
            printLevel(root.left, stepsRemaining - 1);
            printLevel(root.right, stepsRemaining - 1);
        }
    }

    /**
     * Calculates the height of the binary tree.
     * The height is defined as the number of edges on the longest path from the root to a leaf node.
     *
     * @param node The root node of the binary tree or the subtree.
     * @return The height of the tree.
     */
    public int getTreeHeight(TreeNode node) {
        if (node == null) return 0;

        // Find the height of left and right subtrees
        int lSubTreeHeight = getTreeHeight(node.left);
        int rSubTreeHeight = getTreeHeight(node.right);

        // Return max(subtree_height) + 1 to get the height of the tree
        return Math.max(lSubTreeHeight, rSubTreeHeight) + 1;
    }

}
