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
    boolean a = true;
    public boolean isBalanced(TreeNode root) {
        lengthOfNode(root);
        return a;
    }
    public int lengthOfNode(TreeNode root){
        if(root==null){return 0;}

        int left = lengthOfNode(root.left);
        int right = lengthOfNode(root.right);

        if(Math.abs(left-right)>1){
            a = false;
        }

        return Math.max(left,right)+1;
    }
}
