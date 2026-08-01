class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n  =arr.length;
        int start  =0;
        int end  = 0; 
        int sum  = 0;
        int length = Integer.MAX_VALUE;

        while(end<n){
            sum  +=arr[end];
            while(sum>=target){
                length =Math.min(length, end-start+1);
                sum -=arr[start++];
            }

            end++;

        }

        return length == Integer.MAX_VALUE ? 0 : length;
        
    }
}