class Solution {
    public int[] transformArray(int[] nums) {
        int res[] = new int[nums.length];

        int even=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            } 
        }
         for (int i = even; i < nums.length; i++) {
            res[i] = 1;
        }

        return res;
        
    }
}