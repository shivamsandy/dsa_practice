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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

          List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        helper(ans, list, root, targetSum);

        return ans;
        
    }
      public static void helper(List<List<Integer>> ans, List<Integer> arr, TreeNode root, int target) {
        if (root == null)
            return;
        arr.add(root.val);
        if ( (root.left == null && root.right == null)) {
            
            if (root.val == target) {
                ans.add(new ArrayList<>(arr));
            }
            arr.remove(arr.size() - 1);
            return;
        }
 
        helper(ans, arr, root.left, target - root.val);
        helper(ans, arr, root.right, target - root.val);
        arr.remove(arr.size() - 1);
    }
}
