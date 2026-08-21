/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null || root ==p ||  root ==q){
            return root;
        }
        TreeNode left_child  =  lowestCommonAncestor(root.left,p,q);
        TreeNode right_child  =  lowestCommonAncestor(root.right,p,q);

        if(left_child== null){
            return right_child;
        }else if( right_child == null){
            return left_child;
        }else{
            return root;
        }


        
    }
}