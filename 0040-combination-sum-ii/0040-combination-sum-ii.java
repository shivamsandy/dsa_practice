class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        // THIS IS REALLY HARD [PROBLEM NOT CONSIDER IT AS MEDIUM]
        // REVISE IT
         Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        find_combination(candidates, ans, list, target, 0);

        return ans;
        
    }
     public static void find_combination(int[] nums, List<List<Integer>> ans, List<Integer> list, int target,
            int index) {

                if(target <0 ) return ;
                if(target == 0) 
                {
                    ans.add(new ArrayList<>(list));
                    return;
                }
                for(int i= index;i<nums.length;i++){
                    if(i>index && nums[i]==nums[i-1]){
                        continue;
                    }
                    list.add(nums[i]);
                    find_combination(nums, ans, list, target - nums[i], i + 1);

            list.remove(list.size() - 1);
                }



            }

}