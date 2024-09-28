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
     * b
     * @param root TreeNode
     * @return boolean
     */
    public boolean isSymmetric(TreeNode root) {
        if ((root.left == null) != (root.right == null)) return false;

        List<Integer> listLeft = new ArrayList<>();
        List<Integer> listRight = new ArrayList<>();

        preorder(root.left, listLeft);
        preorderReverse(root.right, listRight);
        System.out.println(listLeft);
        System.out.println(listRight);

        return listLeft.equals(listRight);
    }

    /**
     * b
     * @param node b
     * @param list b
     */
    public void preorder(TreeNode node, List<Integer> list){
        if (node == null) {
            list.add(null);
            return;
        }

        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }

    /**
     * j
     * @param node n
     * @param list n
     */
    public void preorderReverse(TreeNode node, List<Integer> list){
        if (node == null) {
            list.add(null);
            return;
        }

        list.add(node.val);
        preorderReverse(node.right, list);
        preorderReverse(node.left, list);

    }


}
