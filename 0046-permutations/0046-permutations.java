class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans  =   new ArrayList<>();
        List<Integer> list =  new ArrayList<>();

        boolean is_visited[] =  new boolean[nums.length];
        
        helper(nums,list,ans,is_visited);

        return ans;

    }


    public static void helper(int nums[] ,List<Integer> list , List<List<Integer>> ans, boolean is_visited[]){
       
        int n  =nums.length;

        if(list.size()==n){  //  BASE CASE
            ans.add(new ArrayList<>(list));
            }
         
        

        for(int i =0;i<n;i++){
              if (is_visited[i]) {
                continue;
            }
            
            list.add(nums[i]);
            is_visited[i] =  true;
            helper(nums,list,ans,is_visited);
            is_visited[i] = false;
            list.remove(list.size()-1);
        }



    }
    
    
    
    
    
    
}