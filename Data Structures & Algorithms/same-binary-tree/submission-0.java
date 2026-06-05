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
    boolean a=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null||q==null){
            if(p!=q){
                a=false;
                return false;
            }else{
                return true;
            }
        }
        if(p.val==q.val&&a==true){
            isSameTree(p.left,q.left);
            isSameTree(p.right,q.right);
        }else{
            a=false;
            return false;
        }

        return a;    
    }
}
