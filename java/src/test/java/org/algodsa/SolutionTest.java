package test.java.org.algodsa;

import main.java.org.algodsa.TreeNode;

public class SolutionTest {

    static TreeNode setUp() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }

    static TreeNode setUp2() {
        // Create the tree:
        //      5
        //     / \
        //    3   6
        //   / \   \
        //  2   4   7
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        return root;
    }


}