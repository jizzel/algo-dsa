//package test.java.org.algodsa;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import main.java.org.algodsa.KthSmallestElementInABST;
//import main.java.org.algodsa.TreeNode;
//import org.junit.jupiter.api.Test;
//
//public class KthSmallestElementInABSTTest {
//
//    private final KthSmallestElementInABST solution = new KthSmallestElementInABST();
//
//    public TreeNode setUp() {
//
//        // Create the following BST:
//        //        5
//        //      /   \
//        //     3     8
//        //    / \   /
//        //   2   4 6
//        //  /
//        // 1
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(8);
//        root.left.left = new TreeNode(2);
//        root.left.right = new TreeNode(4);
//        root.left.left.left = new TreeNode(1);
//        root.right.left = new TreeNode(6);
//
//        return root;
//    }
//
//    @Test
//    public void testKthSmallest_FirstElement() {
//        TreeNode root = setUp();
//        int k = 1;
//        int result = solution.kthSmallest(root, k);
//        assertEquals(1, result);
//    }
//
//    @Test
//    public void testKthSmallest_SecondElement() {
//        TreeNode root = setUp();
//        int k = 2;
//        int result = solution.kthSmallest(root, k);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void testKthSmallest_ThirdElement() {
//        TreeNode root = setUp();
//        int k = 3;
//        int result = solution.kthSmallest(root, k);
//        assertEquals(3, result);
//    }
//
//    @Test
//    public void testKthSmallest_FourthElement() {
//        TreeNode root = setUp();
//        int k = 4;
//        int result = solution.kthSmallest(root, k);
//        assertEquals(4, result);
//    }
//
//    @Test
//    public void testKthSmallest_FifthElement() {
//        TreeNode root = setUp();
//        int k = 5;
//        int result = solution.kthSmallest(root, k);
//        assertEquals(5, result);
//    }
//
//    @Test
//    public void testKthSmallest_SixthElement() {
//        TreeNode root = setUp();
//        int k = 6;
//        int result = solution.kthSmallest(root, k);
//        assertEquals(6, result);
//    }
//
//    @Test
//    public void testKthSmallest_SeventhElement() {
//        TreeNode root = setUp();
//        int k = 7;
//        int result = solution.kthSmallest(root, k);
//        assertEquals(8, result);
//    }
//
//    @Test
//    public void testKthSmallest_InvalidK() {
//        TreeNode root = setUp();
//        int k = 8; // There are only 7 nodes in the tree
//        int result = solution.kthSmallest(root, k);
//        assertEquals(-1, result); // Assuming -1 is returned for invalid k
//    }
//}
