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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> outr_list = new ArrayList<>();
         if(root ==null) return outr_list;

        Queue<TreeNode> q  =  new LinkedList<>();
        q.offer(root);
        int lvl  =0;
         
        while(!q.isEmpty()){
            List<Integer> list  =  new ArrayList<>();
            int size  =q.size();
            
            for(int i=0;i<size;i++){
                TreeNode temp  =  q.remove();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                if(lvl%2!=0){
                    list.addFirst(temp.val);
                }else{
                    list.add(temp.val);
                }
            }
            lvl++;
            outr_list.add(list);

        }
        
        return outr_list;
        
    }
}