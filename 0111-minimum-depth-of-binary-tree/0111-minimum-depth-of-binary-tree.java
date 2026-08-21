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
    public int minDepth(TreeNode root) {

          if (root == null)
            return 0;
        return 1+ find_min_height(root);
   
    }


    public  int find_min_height(TreeNode root){
         if (root.left == null && root.right == null)
            return 0;
 
        if (root.left == null)
            return 1 + find_min_height(root.right);
 
        if (root.right == null)
            return 1 + find_min_height(root.left);
 
        return 1 + Math.min(
            find_min_height(root.left),
            find_min_height(root.right)
        );
    }
}