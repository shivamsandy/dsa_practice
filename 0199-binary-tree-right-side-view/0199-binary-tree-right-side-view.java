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
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> list  =  new ArrayList<>();
        Queue<TreeNode> pq  =  new LinkedList<>();
        if(root!=null){
            pq.add(root);
        }else{
            return  list;
        }

        
        while(!pq.isEmpty()){
            int size =pq.size();
            for(int i=1;i<=size;i++){
                TreeNode temp  =  pq.remove();
                if(temp.left!=null) pq.add(temp.left);
                if(temp.right!=null) pq.add(temp.right);
                if(i==size){
                    list.add(temp.val);
                }
            }


        }
         return list;

        
    }
}