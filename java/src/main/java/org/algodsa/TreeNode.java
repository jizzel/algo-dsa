package main.java.org.algodsa;

/**
 * Represents a node in a binary tree.
 * Each node contains a value and references to its left and right children.
 */
public class TreeNode {
    /**
     * The value stored in the node.
     */
    public int val;

    /**
     * Reference to the left child node.
     */
    public TreeNode left;

    /**
     * Reference to the right child node.
     */
    public TreeNode right;

    /**
     * Constructor
     */
    public TreeNode() {}

    /**
     * Constructor
     * @param val integer
     */
    public TreeNode(int val) { this.val = val; this.left = this.right = null; }

    /**
     * Constructs a TreeNode with a specified value.
     * The left and right child nodes are initialized to null.
     *
     * @param val the value of the node
     * @param left left node
     * @param right right node
     */
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
