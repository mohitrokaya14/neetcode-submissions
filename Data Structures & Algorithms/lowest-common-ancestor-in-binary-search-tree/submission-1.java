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
    TreeNode result;
    Set<TreeNode> hash = new HashSet<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        result = root;
        direction(p.val,root);
        direction(q.val,root);
        return result;
    }
    public TreeNode direction(int n,TreeNode root){

        if(root==null){
            return null;
        }

        if(!hash.add(root)){
            result=root;
        }
        if(n==root.val){
            return null;
        }else if(n<root.val){
            direction(n,root.left);
        }else{
            direction(n,root.right);
        }
        return null;
    }
}
