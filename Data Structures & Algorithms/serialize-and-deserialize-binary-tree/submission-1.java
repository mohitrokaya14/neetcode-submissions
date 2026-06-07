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

public class Codec {

    // Encodes a tree to a single string.
    String s = "";
    public String serialize(TreeNode root) {
        serialized(root);
        return s;
    }
    public void serialized(TreeNode root){
        if(root==null){
            s+="N,";
            return;
        }
        s+=Integer.toString(root.val) + ",";

        serialized(root.left);
        serialized(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return deserialized(arr);
    }
    int i = 0;
    public TreeNode deserialized(String[] arr){
        if(arr[i].equals("N")){
            i++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(arr[i]));
        i++;

        node.left=deserialized(arr);
        node.right=deserialized(arr);

        return node;
    }
}
