/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        heightOfNode(root);
        return d;
    }
    public int heightOfNode(TreeNode root){
        if(root == null){return 0;}

        int right = heightOfNode(root.right);
        int left = heightOfNode(root.left);

        d = Math.max(d,left+right);

        return Math.max(right,left)+1;
    }
}
