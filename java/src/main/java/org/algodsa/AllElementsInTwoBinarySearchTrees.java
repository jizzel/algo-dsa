package main.java.org.algodsa;

import java.util.*;

/**
 * Class to retrieve all elements from two Binary Search Trees (BSTs) and return them in a sorted list.
 */
public class AllElementsInTwoBinarySearchTrees {
    /**
     * Constructor
     */
    public AllElementsInTwoBinarySearchTrees(){}

    /**
     * <h4><a href="https://leetcode.com/problems/all-elements-in-two-binary-search-trees/description/">1305. All Elements in Two Binary Search Trees</a></h4>
     * <br>
     * Retrieves and merges all elements from two BSTs, returning them in a sorted list.<br>
     * <br>
     * Time Complexity: O(n1 + n2 + (n1 + n2)log(n1 + n2)), where n1 and n2 are the number of nodes in root1 and root2 respectively.
     * This accounts for the inorder traversal of both trees and the sorting operation.<br>
     * <br>
     * Space Complexity: O(n1 + n2) for storing the elements of both trees in lists.<br>
     * <br>
     * @param root1 the root of the first binary search tree
     * @param root2 the root of the second binary search tree
     * @return a list of integers containing all elements from both trees in sorted order
     */
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        inorder(root1, list1);
        inorder(root2, list2);

        list1.addAll(list2);
        Collections.sort(list1);

        return list1;
    }

    /**
     * Performs an inorder traversal of the BST, adding each element to the provided list.
     * <br>
     * @param root the root of the binary search tree
     * @param list the list to store the inorder traversal of the tree
     */
    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }



    Queue<Integer> queue;

    /**
     * A more efficient approach
     * Retrieves and merges all elements from two BSTs into a sorted list.<br>
     * <br>
     * Time Complexity: O(n1 + n2), where n1 and n2 are the number of nodes in root1 and root2 respectively.
     * The method performs an in-order traversal on both trees and merges their elements directly.
     * <br>
     * Space Complexity: O(n1 + n2) due to the space used by the queue and the list storing all elements.
     * <br>
     * @param root1 the root of the first binary search tree
     * @param root2 the root of the second binary search tree
     * @return a list of integers containing all elements from both trees in sorted order
     */
    public List<Integer> getAllElements2(TreeNode root1, TreeNode root2) {
        queue = new LinkedList<>();
        sol(root1);
        List<Integer> ans = new ArrayList<>();
        sol(root2, ans);
        while (!queue.isEmpty()) {
            ans.add(queue.poll());
        }
        return ans;
    }

    /**
     * Helper method to traverse the second tree and merge its elements with the queue from the first tree.
     * <br>
     * @param root the root of the second binary search tree
     * @param ans the list to store the merged elements in sorted order
     */
    public void sol(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        sol(root.left, ans);
        while (!queue.isEmpty() && queue.peek() <= root.val) {
            ans.add(queue.poll());
        }
        ans.add(root.val);
        sol(root.right, ans);
    }

    /**
     * Helper method to perform in-order traversal on the first tree and add its elements to the queue.
     *
     * @param root the root of the first binary search tree
     */
    public void sol(TreeNode root) {
        if (root == null) return;
        sol(root.left);
        queue.add(root.val);
        sol(root.right);
    }
}
