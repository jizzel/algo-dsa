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
}
