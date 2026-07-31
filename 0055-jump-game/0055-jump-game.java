class Solution {
    public boolean canJump(int[] nums) {

        int can_reach  =0;
        for(int i=0;i<nums.length;i++){
            if(i>can_reach){
                return false;
            }
            can_reach = Math.max(can_reach,i+nums[i]);
        }
        return true;
        
    }
}