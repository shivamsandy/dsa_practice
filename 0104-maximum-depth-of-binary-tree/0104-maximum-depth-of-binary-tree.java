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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return 1+ find_max_depth(root);
         
    }
    public int find_max_depth(TreeNode root){
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(find_max_depth(root.left), find_max_depth(root.right));
    }
}