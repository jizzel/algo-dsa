package main.java.org.algodsa;

import java.util.*;

/**
 * temp: random leetcode solutions
 */
public class Miscellaneous {

    /**
     * constructor
     */
    Miscellaneous() {}
    /**
     * <h4><a href="https://leetcode.com/problems/running-sum-of-1d-array/">Running Sum of 1d Array (Linear Search)</a></h4>
     * Computes the running sum of an array of integers. <br>
     * <br>
     * The running sum of a given array is an array where each element at index `i` is the sum of all elements
     * from the start of the array up to index `i`. The original array is modified in-place to store the running sum.<br>
     * <br>
     * This method iteratively updates each element in the input array by adding the value of the previous element,
     * effectively transforming the array into its running sum form.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of elements in the array. The method processes each element exactly once.<br>
     * Space Complexity: O(1) - the transformation is done in place with no additional memory usage beyond the input array.<br>
     * <br>
     * Algorithm:<br>
     * 1. Iterate over the array starting from the second element (index 1).<br>
     * 2. For each element at index `i`, add the value of the previous element (`nums[i-1]`) to the current element (`nums[i]`).<br>
     * 3. After the loop completes, the array `nums` will be transformed into its running sum.<br>
     * 4. Return the modified array.<br>
     * <br>
     * Example:<br>
     * - Input: nums = [1, 2, 3, 4]<br>
     * - Output: [1, 3, 6, 10]<br>
     *
     * @param nums the array of integers for which the running sum is to be computed
     * @return the same array modified to contain the running sum
     */
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/"> Maximum Depth of Binary Tree</a></h4>
     * Computes the maximum depth (or height) of a binary tree.<br>
     * <br>
     * The maximum depth is the number of nodes along the longest path
     * from the root node down to the farthest leaf node.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree,
     * as each node is visited once.<br>
     * Space Complexity: O(h) - where h is the height of the tree,
     * due to the recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return the maximum depth of the tree
     */
    public int maxDepth(TreeNode root) {
        // Base case: if the node is null, the depth is 0
        if (root == null) return 0;

        // Recursively find the maximum depth of the left subtree
        int lmax = maxDepth(root.left);

        // Recursively find the maximum depth of the right subtree
        int rmax = maxDepth(root.right);

        // Return the greater depth between the left and right subtree plus 1 (for the current node)
        return Math.max(lmax, rmax) + 1;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/balanced-binary-tree/">Balanced Binary Tree</a></h4>
     * Determines if a binary tree is height-balanced.<br>
     * <br>
     * A binary tree is considered balanced if the heights of the two subtrees of
     * every node never differ by more than one. This method utilizes a helper function
     * to recursively calculate the height of each subtree and check the balance condition.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree, as each node is visited once.<br>
     * Space Complexity: O(h) - where h is the height of the tree, due to the recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return true if the tree is balanced, false otherwise
     */
    public static boolean isBalanced(TreeNode root) {
        // If checkHeight returns -1, the tree is unbalanced
        return checkHeight(root) != -1;
    }

    /**
     * Helper method that calculates the height of a subtree and checks if it is balanced.<br>
     * <br>
     * The method returns -1 if the subtree is unbalanced; otherwise, it returns the height
     * of the subtree. If any subtree has a height difference greater than 1 between
     * its left and right children, the method will propagate -1 up to signal that the
     * entire tree is unbalanced.<br>
     * <br>
     * @param node the current node in the binary tree
     * @return the height of the subtree if balanced, or -1 if unbalanced
     */
    public static int checkHeight(TreeNode node) {
        // Base case: if the node is null, its height is 0
        if (node == null) return 0;

        // Recursively check the height of the left subtree
        int left = checkHeight(node.left);
        if (left == -1) return -1;  // If the left subtree is unbalanced, propagate -1

        // Recursively check the height of the right subtree
        int right = checkHeight(node.right);
        if (right == -1) return -1;  // If the right subtree is unbalanced, propagate -1

        // If the height difference between left and right subtrees is more than 1, return -1
        if (Math.abs(left - right) > 1) return -1;

        // Return the height of the current subtree
        return Math.max(left, right) + 1;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/symmetric-tree/description/">Symmetric Tree</a></h4>
     * Checks if the given binary tree is symmetric (i.e., a mirror of itself).<br>
     * <br>
     * A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree, as each node is visited once.<br>
     * Space Complexity: O(h) - where h is the height of the tree, due to the recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return true if the tree is symmetric, false otherwise
     */
    public boolean isSymmetric(TreeNode root) {
        // If the tree is empty, it's symmetric by definition
        if (root == null) return true;

        // Check if the left and right subtrees are mirrors of each other
        return isMirror(root.left, root.right);
    }

    /**
     * Helper method to check if two trees are mirror images of each other.<br>
     * <br>
     * Two trees are mirrors if:<br>
     * 1. Their root values are the same.<br>
     * 2. The right subtree of one tree is a mirror of the left subtree of the other tree and vice versa.<br>
     * <br>
     * @param t1 the root of the first subtree
     * @param t2 the root of the second subtree
     * @return true if the subtrees are mirrors, false otherwise
     */
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // If both subtrees are null, they are mirrors
        if (t1 == null && t2 == null) return true;

        // If only one of the subtrees is null, they are not mirrors
        if (t1 == null || t2 == null) return false;

        // Check if the current nodes have the same value and
        // the left subtree of t1 is a mirror of the right subtree of t2,
        // and the right subtree of t1 is a mirror of the left subtree of t2
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

//    /**
//     *
//     * @param root TreeNode
//     * @return boolean
//     */
//    public boolean isSymmetric(TreeNode root) {
//        if ((root.left == null) != (root.right == null)) return false;
//
//        List<Integer> listLeft = new ArrayList<>();
//        List<Integer> listRight = new ArrayList<>();
//
//        preorder(root.left, listLeft);
//        preorderReverse(root.right, listRight);
//        System.out.println(listLeft);
//        System.out.println(listRight);
//
//        return listLeft.equals(listRight);
//    }
//
//    public void preorder(TreeNode node, List<Integer> list){
//        if (node == null) {
//            list.add(null);
//            return;
//        }
//
//        list.add(node.val);
//        preorder(node.left, list);
//        preorder(node.right, list);
//    }
//
//    public void preorderReverse(TreeNode node, List<Integer> list){
//        if (node == null) {
//            list.add(null);
//            return;
//        }
//
//        list.add(node.val);
//        preorderReverse(node.right, list);
//        preorderReverse(node.left, list);
//
//    }

    /**
     * <h4><a href="https://leetcode.com/problems/binary-search/">Binary Search</a></h4>
     * Performs binary search on a sorted array to find the target value.<br>
     * <br>
     * Time Complexity: O(log n) - where n is the number of elements in the array.<br>
     * Space Complexity: O(1) - uses constant space.<br>
     * <br>
     * @param nums the sorted array of integers
     * @param target the value to search for
     * @return the index of the target if found, otherwise -1
     */
    public static int searchBinary(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        // Loop until the search interval becomes empty
        while (low <= high) {
            // Find the middle index, avoiding overflow by using (low + (high - low) / 2)
            int mid = low + (high - low) / 2;  // Alternatively: (low + high) >>> 1;

            // If the middle element is the target, return its index
            if (nums[mid] == target) {
                return mid;
            }

            // If the target is greater than the middle element, search in the right half
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                // If the target is smaller, search in the left half
                high = mid - 1;
            }
        }

        // If the target is not found, return -1
        return -1;
    }

    /**
     * Prints a pyramid of stars where the number of stars in each row
     * is determined by the first N odd numbers. Each row is centered
     * based on the row with the maximum number of stars.<br>
     * <br>
     * Time Complexity: O(n²) (due to the increasing number of stars per row).<br>
     * Space Complexity: O(n) (for the array of odd numbers and the strings created during each iteration).<br>
     * <br>
     * @param n the number of rows in the pyramid
     */
    public static void printPyramid(int n) {
        int[] arr = firstNOdd(n);  // Get the first n odd numbers
        int maxStars = arr[arr.length - 1];  // Maximum stars in the last row

        // Loop through each row and print the stars
        for (int stars : arr) {
            int numOfSpaces = (maxStars - stars) / 2;  // Calculate leading spaces

            // Build the string with leading spaces and stars
            String row = " ".repeat(numOfSpaces) + "*".repeat(stars);

            // Print the row
            System.out.println(row);
        }
    }

    /**
     * Helper function
     * <br>
     * Generates an array containing the first N odd numbers.<br>
     * For example, if N = 3, the result will be [1, 3, 5].<br>
     * <br>
     * @param n the number of odd numbers to generate
     * @return an array of the first N odd numbers
     */
    public static int[] firstNOdd(int n) {
        int[] oddNums = new int[n];  // Array to store the odd numbers
        int i = 0;
        int num = 1;

        // Generate the first N odd numbers
        while (i < n) {
            oddNums[i++] = num;
            num += 2;
        }

        return oddNums;
    }

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

    /**
     * <h4><a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">Minimum Depth of Binary Tree</a></h4><br>
     * Finds the minimum depth of a binary tree.<br>
     * <br>
     * The minimum depth is defined as the number of nodes along the shortest path
     * from the root node down to the nearest leaf node. A leaf node is a node with no children.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return the minimum depth of the binary tree
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once. <br>
     * Space Complexity: O(n) - for the queue used in the breadth-first search.<br>
     */
    public static int minDepth(TreeNode root) {
        // If the tree is empty, the depth is 0
        if (root == null) return 0;

        // Queue for BFS traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int minDepth = 0;

        // Perform a breadth-first search (BFS) to find the minimum depth
        while (!queue.isEmpty()) {
            int size = queue.size();
            minDepth++;
            for (int i = 0; i < size; i++) {
                // Get the current node from the queue
                TreeNode node = queue.poll();

                // If this node is a leaf node (no children), return the current depth
                assert node != null;
                if (node.left == null && node.right == null) return minDepth;

                // Add the left and right children to the queue for further exploration
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }

        return minDepth;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/roman-to-integer/description/">Roman to Integer</a></h4>
     * @param s String
     * @return integer
     */
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = getStringIntegerMap();

        int value = 0;

        int i = 0;
        while (i < s.length()){
            if (((s.length() - i) - 1 >= 1) && romanNumerals.get(s.charAt(i)) < romanNumerals.get(s.charAt(i+1))){
                value += romanNumerals.get(s.charAt(i+1)) - romanNumerals.get(s.charAt(i));
                i = i + 2;
            } else {
                value += romanNumerals.get(s.charAt(i));
                i++;
            }
        }

        return value;
    }

    private Map<Character, Integer> getStringIntegerMap() {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        return romanNumerals;
    }

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

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-tilt/">Binary Tree Tilt</a></h4>
     * Finds the tilt of a binary tree. The tilt of a tree node is the absolute difference
     * between the sum of all left subtree node values and the sum of all right subtree node values.<br>
     * The tilt of the whole tree is the sum of all node tilts.<br>
     * <br>
     * @param root the root of the binary tree
     * @return the total tilt of the binary tree
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree.<br>
     * Space Complexity: O(n) - due to the recursive call stack.<br>
     */
    public int findTilt(TreeNode root) {
        int[] totalTilt = new int[1];  // Use an array to store the cumulative tilt across recursive calls
        postorderSum(root, totalTilt); // Calculate the sum of all subtrees and update the tilt
        return totalTilt[0];           // Return the cumulative tilt
    }

    /**
     * Helper method to perform a postorder traversal and calculate the sum of the subtree rooted at the given node.
     * At each node, the tilt is calculated and added to the total tilt.<br>
     * <br>
     * @param node the current node being processed
     * @param totalTilt the cumulative tilt being updated
     * @return the sum of all node values in the subtree rooted at the given node
     */
    private int postorderSum(TreeNode node, int[] totalTilt) {
        if (node == null) return 0;  // Base case: null node has sum 0

        // Recursively calculate the sum of the left and right subtrees
        int leftSum = postorderSum(node.left, totalTilt);
        int rightSum = postorderSum(node.right, totalTilt);

        // Tilt of the current node is the absolute difference between left and right subtree sums
        totalTilt[0] += Math.abs(leftSum - rightSum);

        // Return the sum of the current node's value plus its left and right subtree sums
        return node.val + leftSum + rightSum;
    }

}
