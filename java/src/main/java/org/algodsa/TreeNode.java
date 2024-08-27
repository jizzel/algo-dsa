package main.java.org.algodsa;

/**
 * Tree node blueprint
 */
public class TreeNode {
    int val;
    TreeNode left, right;

    /**
     * Constructor
     * @param val the value of the node
     */
    TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }

}
