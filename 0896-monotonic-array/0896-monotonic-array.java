class Solution {
    public boolean isMonotonic(int[] nums) {
        
        // int i =0;
        // if(nums[i]>=nums[i+1]){
        //     for(;i<nums.length-1;i++){
        //         if(nums[i] >= nums[i+1]){
        //             continue;
        //         }else{
        //             return false;
        //         }
        //     }
        // }else{
        //     for(int j=0;i<nums.length-1;j++){
        //         if(nums[j] <= nums[j+1]){
        //             continue;
        //         }else{
        //             return false;
        //         }
        //     }

        // }
        // return true;
          boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }

            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }
        }
        return increasing || decreasing;
        
    }
}