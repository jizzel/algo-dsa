package main.java.org.algodsa;

/**
 * This class provides a method to find the k-th smallest element in a Binary Search Tree (BST).
 */
public class KthSmallestElementInABST {
    /**
     * Constructor
     */
    public KthSmallestElementInABST(){}

    private int count = 0; // Counter for the number of nodes processed
    private int result = -1; // Result variable to store the k-th smallest value

    /**
     * <h4><a href="https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/">230. Kth Smallest Element in a BST</a></h4>
     * <br>
     * Finds the k-th smallest element in the BST.<br>
     * The method performs an in-order traversal of the tree, which visits nodes in ascending order.<br>
     * Once the k-th smallest element is found, it is stored in the result variable.<br>
     * <br>
     * Time Complexity: O(h + k), where h is the height of the tree. In the worst case,
     * this can be O(n) if the tree is skewed, where n is the number of nodes.<br>
     * In a balanced tree, this is O(log n + k).<br>
     * <br>
     * Space Complexity: O(h), due to the recursion stack space, where h is the height of the tree.<br>
     *  <br>
     * @param root the root of the BST
     * @param k the k-th position to find the smallest element
     * @return the value of the k-th smallest element in the BST
     */
    public int kthSmallest(TreeNode root, int k) {
        // Initiates in-order traversal to find the k-th smallest element
        inOrder(root, k);
        return result; // Return the result once found
    }

    /**
     * Performs an in-order traversal of the BST.
     * The traversal processes nodes in ascending order, allowing us to find the k-th smallest element.
     *
     * @param node the current node in the BST
     * @param k the k-th position to find the smallest element
     */
    private void inOrder(TreeNode node, int k) {
        if (node == null) return; // Base case: if the node is null, return

        // Traverse the left subtree
        inOrder(node.left, k);

        // Process the current node
        count++; // Increment the count of nodes processed
        if (count == k) { // Check if the k-th smallest element is found
            result = node.val; // Store the value
            return; // Early exit once the k-th smallest is found
        }

        // Traverse the right subtree
        inOrder(node.right, k);
    }
}

