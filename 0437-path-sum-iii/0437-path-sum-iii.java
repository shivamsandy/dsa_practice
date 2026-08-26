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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;

        int count  = 0 ; 


        count =  _count_no_of_path(root,(long)targetSum);
        count += pathSum(root.left,targetSum) + pathSum(root.right,targetSum);

    return count;
        
    }
    public static int  _count_no_of_path(TreeNode root,long targetSum){
        if(root  ==null ) return 0;
        int count =0;
        if((long)root.val == (long)targetSum){
            count++;
        }
        count +=  _count_no_of_path(root.left,targetSum- root.val) + _count_no_of_path(root.right,targetSum-root.val);
    return count;
    }
}