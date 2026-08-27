class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans  =  new ArrayList<>();
        List<Integer> list  =  new ArrayList<>();

        find_combination(candidates, ans, list, target,0);

        return ans;



    }
    public static void find_combination(int nums[] ,List<List<Integer>> ans , List<Integer> list ,int target ,int index ){

        if(target ==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0) return;

        for(int i =index;i<nums.length;i++){
            list.add(nums[i]);
            find_combination(nums,ans,list,target-nums[i],i);
            list.remove(list.size()-1); // now backtrack
        }


    }
}