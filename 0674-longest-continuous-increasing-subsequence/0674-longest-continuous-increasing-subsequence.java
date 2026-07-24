class Solution {
    public int findLengthOfLCIS(int[] arr) {
        int count =0;
        int max_count  = 0;

        for(int i=0;i<arr.length-1;i++){
            int next_element =  arr[i+1];
            if(next_element > arr[i]){
                count +=1;
                max_count = Math.max(max_count, count);
            }else{
                count =0;
            }
        }
        return max_count +1;
    }
}