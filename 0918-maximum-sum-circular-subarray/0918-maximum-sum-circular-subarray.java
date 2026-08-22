class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int total_sum =arr[0];

        int curr_min =arr[0];
        int min_sum = arr[0];

        int max_sum= arr[0];
        int curr_max =arr[0];



        for(int i =1;i<arr.length;i++){
            total_sum  +=arr[i];

            curr_min  = Math.min(arr[i],arr[i]+curr_min);
            min_sum = Math.min(min_sum ,curr_min);

            curr_max  = Math.max(arr[i],arr[i]+curr_max);
            max_sum  =  Math.max(max_sum,curr_max);
        }

         if (max_sum < 0)
            return max_sum;

        return Math.max(max_sum, total_sum - min_sum);
 
    }
}