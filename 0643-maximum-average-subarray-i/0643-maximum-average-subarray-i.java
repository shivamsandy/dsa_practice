class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k==0) return 0.00000;
        double sum = 0;
        for(int i =0;i<k;i++){
            sum +=nums[i];
        }
        double max =sum;

        for(int i=k;i<nums.length;i++){
            sum +=nums[i];
            sum-=nums[i-k];
            max  =Math.max(max,sum);   
        }
        double avg =max/k;

        return avg;
    }
}