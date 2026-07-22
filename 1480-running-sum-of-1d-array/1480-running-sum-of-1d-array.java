class Solution {
    public int[] runningSum(int[] nums) {

        int running_sum[]  =  new int[nums.length];
        running_sum[0] = nums[0];

        for(int i=1;i<nums.length;i++){
            running_sum[i] = nums[i]+ running_sum[i-1];
        }
        return running_sum;
        
    }
}