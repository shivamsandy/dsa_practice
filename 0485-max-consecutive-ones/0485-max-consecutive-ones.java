class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max_count = 0;

        int current = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] ==1){
                current +=1;
                max_count = Math.max(max_count, current);
            }else{
                current =0;
            }
        }
    return max_count;
        
    }
}